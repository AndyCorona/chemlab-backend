package com.likezhen.chemlab.service.impl;

import com.likezhen.chemlab.entity.TVersion;
import com.likezhen.chemlab.mapper.TVersionMapper;
import com.likezhen.chemlab.service.ITVersionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 版本控制表 服务实现类
 * </p>
 *
 * @author likezhen
 * @since 2022-12-15
 */
@Service
public class TVersionServiceImpl extends ServiceImpl<TVersionMapper, TVersion> implements ITVersionService {

}
