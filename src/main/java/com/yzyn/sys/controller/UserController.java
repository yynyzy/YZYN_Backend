package com.yzyn.sys.controller;

import com.yzyn.common.Enum.CodeStatus;
import com.yzyn.common.publicClass.ResponseResult;
import com.yzyn.sys.entity.User;
import com.yzyn.sys.service.IUserService;
import org.omg.PortableInterceptor.SUCCESSFUL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author YYN
 * @since 2023-09-07
 */
//@RestController 注解默认帮你把下面的方法做 json 处理

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("/login")
    public ResponseResult<Map<String, Object>> login(@RequestBody User user) {
        Map<String, Object> data = userService.login(user);
        if (data != null) {
            return ResponseResult.success(data);
        }
        return ResponseResult.fail(201, "登陆失败");
    }

    @GetMapping("/all")
    public ResponseResult<List<User>> getAllUser() {
        return ResponseResult.success("查询成功", userService.list(null));
    }
}
