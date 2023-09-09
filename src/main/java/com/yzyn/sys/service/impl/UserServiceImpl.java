package com.yzyn.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.mysql.cj.protocol.x.StatementExecuteOk;
import com.yzyn.sys.entity.User;
import com.yzyn.sys.mapper.UserMapper;
import com.yzyn.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YYN
 * @since 2023-09-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Override
    public Map<String, Object> login(User user) {
        // 查询是否有这个用户
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getUsername, user.getUsername());
        wrapper.eq(User::getPassword, user.getPassword());
        User loginUser = this.baseMapper.selectOne(wrapper);

        // 返回token
        if (loginUser != null) {
            String key  = "User:" + UUID.randomUUID();

            HashMap<String, Object> data = new HashMap<>();
            data.put("token", key);
            return data;
        }
        return null;
    }
}
