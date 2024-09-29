package org.example.edumgr.controller;

import org.example.edumgr.constant.UrlConstant;
import org.example.edumgr.dto.request.UserLoginReq;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @PostMapping(UrlConstant.USER_LOGIN)
    public Object login(@RequestBody UserLoginReq req) {
        return req;
    }
}
