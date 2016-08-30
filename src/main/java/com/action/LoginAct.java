package com.action;

import com.entity.User;
import com.service.UserMng;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by LK on 2016/8/21.
 */
// 将user的值存到session中
@SessionAttributes("user")
@Controller
public class LoginAct {
    @Resource
    private UserMng userMng;

    @RequestMapping(value = "/logingoto")
    public String login(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        return "login";
    }

    @RequestMapping(value = "/login")
    public String login(String userName, String password, HttpServletRequest request, HttpServletResponse response,
                        ModelMap model) {
        User user = this.userMng.getUserByUserName(userName);
        if(user!=null){
            if(user.getPassword().equals(password)){
                model.addAttribute("user",user);
            }
        }

        return "index";
    }

    @RequestMapping(value = "/simpleRegist")
    public String simpleRegist(String username, String email, String password, String repassword,
                               HttpServletRequest request, HttpServletResponse response, ModelMap model) {

        return "login";
    }

    @RequestMapping(value = "/loginout")
    public String loginOut(SessionStatus sessionStatus, HttpSession session) {
        sessionStatus.setComplete();// 将所有的会话注销
        session.removeAttribute("user");
        return "index";
    }
}

