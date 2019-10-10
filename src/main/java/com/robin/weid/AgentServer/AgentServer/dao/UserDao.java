package com.robin.weid.AgentServer.AgentServer.dao;

import com.robin.weid.AgentServer.AgentServer.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @author Robin
 */
@Repository
public interface UserDao {

    /*
     * getMatchCount finds out if the account exists.
     * The params includes userName and password.
     */
    int getMatchCount(Map params);

    /*
     * findUserByUserName finds out the data of user by userName.
     */
    User findUserByUserName(String userName);

    /*
     * updateLoginInfo updates the log of Login.
     */
    void updateLoginInfo(User user);

}
