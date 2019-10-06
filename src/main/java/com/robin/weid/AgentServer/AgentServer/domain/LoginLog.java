package com.robin.weid.AgentServer.AgentServer.domain;

import java.util.Date;

public class LoginLog {

    private int loginLog;
    private int userId;
    private String ip;
    private Date lgoinDate;

    public int getLoginLog() {
        return loginLog;
    }

    public void setLoginLog(int loginLog) {
        this.loginLog = loginLog;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLgoinDate() {
        return lgoinDate;
    }

    public void setLgoinDate(Date lgoinDate) {
        this.lgoinDate = lgoinDate;
    }
}
