package com.robin.weid.AgentServer.AgentServer.web;

import com.robin.weid.AgentServer.AgentServer.domain.User;
import com.robin.weid.AgentServer.AgentServer.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class LoginController {

    private UserService userService;

    @RequestMapping(value = "/index.html")
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/loginCheck.html")
    public ModelAndView loginCheck(HttpServletRequest request, LoginCommand loginCommand) {

        boolean isValidUser = userService.hasMatchUser(loginCommand.getUserName(),
                                                    loginCommand.getPassword());
        if (!isValidUser) {
            return new ModelAndView("login", "error", "用户名密码错误");
        } else {
            User user = userService.findUserByUserName(loginCommand.getUserName());
            user.setLastIp(request.getLocalAddr());
            user.setLastVisit(new Date());
            userService.loginSuccess(user);
            request.getSession().setAttribute("user", user);
            return new ModelAndView("main");
        }
    }


}
