package com.huai.auth.controller.api;

import com.huai.common.domain.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class LoginRestController {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @PostMapping("/auth")
    Object auth(@RequestBody Map vo) {
        logger.info("  auth   vo = {}",vo);
        return Result.success("登录成功","/index");
    }


}
