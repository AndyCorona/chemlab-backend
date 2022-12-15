package com.likezhen.chemlab.service.impl;

import com.likezhen.chemlab.entity.TUser;
import com.likezhen.chemlab.mapper.TUserMapper;
import com.likezhen.chemlab.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author likezhen
 * @since 2022-12-15
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
