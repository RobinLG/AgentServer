package com.robin.weid.AgentServer.AgentServer.dao;

import com.robin.weid.AgentServer.AgentServer.domain.LoginLog;
import org.springframework.stereotype.Repository;

/**
 * @author Robin
 */
@Repository
public interface LoginLogDao {

    /*
     * insertLoginLog inserts log of login
     */
    void insertLoginLog(LoginLog loginLog);

}
