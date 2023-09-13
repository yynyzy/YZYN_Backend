package com.yzyn.sys.mapper;

import com.yzyn.sys.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YYN
 * @since 2023-09-07
 */
public interface UserMapper extends BaseMapper<User> {

    List<String> getRoleNamesByUserId(Integer userId);
}
