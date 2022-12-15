package com.likezhen.chemlab.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.likezhen.chemlab.bean.LoginUser;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class JwtUtils {
    // token 过期时间 7 天
    private static final int expireDay = 7;
    // token 刷新时间为 30 天
    private static final int refreshDay = 30;

    public static void main(String[] args) {
        String token = JwtUtils.getToken(new LoginUser(1, 10, "123456"));
        System.out.println(token);
        System.out.println(JwtUtils.refresh(token));
    }

    public static String getToken(LoginUser user) throws RuntimeException {
        final LocalDateTime dateTime = LocalDateTime.now();
        final LocalDateTime refreshTime = dateTime.plusDays(refreshDay);
        final LocalDateTime expireTime = dateTime.plusDays(expireDay);
        final String secret = user.getPassword();
        final Algorithm algorithm = Algorithm.HMAC512(secret);
        String token = null;
        if (user.getUserid() == null) {
            throw new RuntimeException("user id can not be null");
        }
        token = JWT.create()
                .withIssuer("chemlab")
                .withSubject("chemlab-vue")
                .withJWTId(user.getUserid().toString())
                .withNotBefore(getDate(dateTime))
                .withExpiresAt(getDate(expireTime))
                .withClaim("userId", user.getUserid())
                .withClaim("groupId", (user.getGroupId()))
                .withClaim("refreshTime", refreshTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
                .sign(algorithm);
        return token;
    }

    /**
     * 获取解码后的 token 令牌内容
     */

    public static DecodedJWT decode(String token) {
        return JWT.decode(token);
    }


    /**
     * 获取用户 ID
     *
     * @param token token 字符串
     * @return 用户 ID
     */
    public static String getUserId(String token) {
        final DecodedJWT decode = decode(token);
        return decode.getClaim("userId").toString();
    }

    /**
     * 获取群组 ID
     *
     * @param token token 字符串
     * @return 群组 ID
     */
    public static String getGroupId(String token) {
        final DecodedJWT decode = decode(token);
        return decode.getClaim("groupId").toString();
    }

    /**
     * 刷新 token 令牌
     * 用户令牌过期后，自动刷新令牌过期时间
     */
    public static String refresh(String token) {
        final DecodedJWT decode = decode(token);
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        final Claim decodeClaim = decode.getClaim("refreshTime");
        LocalDateTime refreshTime = LocalDateTime.parse(decodeClaim.asString(), dtf);
        final LocalDateTime expireTime = getLocalDateTime(decode.getExpiresAt());
        final LocalDateTime now = LocalDateTime.now();
        // 当前令牌已经过期了，但是还没有超过刷新令牌时间，可以刷新令牌
        if (now.isBefore(refreshTime) && now.isAfter(expireTime)) {
            String userid = JwtUtils.decode(token).getClaim("userId").asString();
            String groupId = JwtUtils.decode(token).getClaim("groupId").asString();
        }
        return null;
    }

    /**
     * Date -> LocalDateTime 转换
     */
    public static LocalDateTime getLocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    /**
     * LocalDateTime -> Date 转换
     */
    public static Date getDate(LocalDateTime dateTime) {
        return Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
    }
}
