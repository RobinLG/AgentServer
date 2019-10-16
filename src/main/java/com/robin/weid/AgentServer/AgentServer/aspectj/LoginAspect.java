package com.robin.weid.AgentServer.AgentServer.aspectj;

import com.robin.weid.AgentServer.AgentServer.dao.LoginLogDao;
import com.robin.weid.AgentServer.AgentServer.dao.UserDao;
import com.robin.weid.AgentServer.AgentServer.domain.LoginLog;
import com.robin.weid.AgentServer.AgentServer.domain.User;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Aspect
public class LoginAspect {

    private UserDao userDao;
    private LoginLogDao loginLogDao;

    @AfterReturning("@execution(com.robin.weid.AgentServer.AgentServer.service.UserService.loginSuccess(..))")
    public void successLogin(User user) {
        LoginLog loginLog = new LoginLog();
        loginLog.setUserId(user.getUserId());
        loginLog.setIp(user.getLastIp());
        loginLog.setLoginDate(user.getLastVisit());

        userDao.updateLoginInfo(user);
        loginLogDao.insertLoginLog(loginLog);
    }

    @Autowired
    @Qualifier("jdbcLoginLogDao")
    public void setLoginLogDao(LoginLogDao loginLogDao) {
        this.loginLogDao = loginLogDao;
    }
}
