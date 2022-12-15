package com.likezhen.chemlab.user;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.likezhen.chemlab.entity.TGroup;
import com.likezhen.chemlab.entity.TUser;
import com.likezhen.chemlab.mapper.TGroupMapper;
import com.likezhen.chemlab.mapper.TUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserTest {
    @Autowired
    private TUserMapper userMapper;

    @Test
    public void testUserInsert() {
        TUser user = new TUser(1, "测试用户1", "818181818@qq.com", "1234455", LocalDateTime.now(), LocalDateTime.now(),"门头沟大学", "有机", "化学", true, "默认的用户空间标语", "默认的用户头像路径", "[1,2,3,4]", 100, "[1,2,3,4]", null, null);
        userMapper.insert(user);
        assertThat(userMapper.selectById(1)).isNotNull();
    }

    @Test
    public void testUserSelect() {
        TUser user = userMapper.selectById(1);
        assertThat(user).isNotNull();
    }

    @Test
    public void testUserUpdate() {
        TUser user = new TUser(1, "测试用户1", "818181818@qq.com", "1234455", LocalDateTime.now(), LocalDateTime.now(),"门头沟大学", "有机", "化学", true, "默认的用户空间标语", "默认的用户头像路径", "[1,2,3,4]", 100, "[1,2,3,4]", null, null);

        userMapper.update(user, new UpdateWrapper<TUser>().eq("id", 1).set("name", "测试用户2"));
    }

    @Test
    public void testUserDelete() {
        int i = userMapper.deleteById(1);
        assertThat(i).isNotEqualTo(0);
    }

}
