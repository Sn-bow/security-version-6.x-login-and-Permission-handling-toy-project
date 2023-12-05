package com.security.study.controller;


import com.security.study.dao.UserDao;
import com.security.study.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserDao userDao;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping({"", "/"})
    public @ResponseBody String index() {
        return "메인 페이지";
    }

    @GetMapping("/user")
    public @ResponseBody String user() {
        return "user 사이트";
    }

    @GetMapping("/manager")
    public @ResponseBody String manager() {
        return "manager 사이트";
    }

    @GetMapping("/admin")
    public @ResponseBody String admin() {
        return "admin 사이트";
    }

    @Secured("ROLE_ADMIN")
    @GetMapping("/info")
    public @ResponseBody String info() {
        return "개인정보";
    }

    @GetMapping("/loginForm")
    public String loginForm() {
        return "login";
    }

    @GetMapping("/join")
    public String joinForm() {
        return "join";
    }

    @PostMapping("/join")
    public String join(User user) {
        user.setRole("ROLE_USER");
        String rawPassword = user.getPassword();
        String encPassword = this.bCryptPasswordEncoder.encode(rawPassword);
        user.setPassword(encPassword);
        this.userDao.save(user);
        return "redirect:/";
    }

}
