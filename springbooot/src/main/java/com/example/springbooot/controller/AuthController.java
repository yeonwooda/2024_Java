package com.example.springbooot.controller;

import com.example.springbooot.JwtUtil;
import com.example.springbooot.model.LoginRequest;
import com.example.springbooot.model.User;
import com.example.springbooot.model.UserDetailCustom;
import com.example.springbooot.service.UserDetailService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private UserDetailService userDetailService;
    private PasswordEncoder passwordEncoder;
    private JwtUtil jwtUtil;

    public AuthController(UserDetailService userDetailService, PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.userDetailService = userDetailService;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest){
        UserDetailCustom userDetailCustom = userDetailService.loadUserByUsername(loginRequest.getUsername());
        System.out.println(loginRequest.getUsername());
        // 비밀번호 매칭확인
        if(!passwordEncoder.matches(loginRequest.getPassword(),userDetailCustom.getPassword())) return  "비밀번호가 맞지않습니다.";

        // 로그인 성공 했으니 토큰을 줌
        return jwtUtil.generateToken(loginRequest.getUsername());
    }
    @PostMapping("/signup")
    public String signup(@RequestBody LoginRequest loginRequest){
        userDetailService.saveUser(loginRequest);
         return "로그인 성공";
    }


}
