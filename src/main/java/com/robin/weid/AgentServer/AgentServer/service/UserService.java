package com.robin.weid.AgentServer.AgentServer.service;

import com.robin.weid.AgentServer.AgentServer.domain.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserService {

    /*
     * hasMatchUser checks the userName whether exist.
     */
    boolean hasMatchUser(String userName, String password);

    /*
     * findUserByUserName finds the data of user through userName.
     */
    User findUserByUserName(String userName);

    /*
     * loginSuccess records the logs.
     */
    void loginSuccess(User user);

}
