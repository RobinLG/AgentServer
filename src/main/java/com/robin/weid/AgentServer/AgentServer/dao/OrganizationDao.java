package com.robin.weid.AgentServer.AgentServer.dao;

import com.robin.weid.AgentServer.AgentServer.domain.Organization;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author Robin
 */
@Repository
public interface OrganizationDao {

    /*
     * queryOrgList returns all of organizations.
     */
    List<Organization> queryOrgList();

    /*
     * addOrg adds organization into database.
     */
    boolean addOrg(Map params);

    /*
     * suspendNode remove the IP of node from IP white list.
     * At the same time, change the flag's stuate
     */
    boolean suspendNode(int orgId);

}
