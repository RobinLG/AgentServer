package com.robin.weid.AgentServer.AgentServer.service;

import com.robin.weid.AgentServer.AgentServer.domain.Organization;

import java.util.List;
import java.util.Map;

public interface OrganizationService {

    /*
     * queryOrgList finds out all of organizations from database.
     */
    List<Organization> queryOrgList();

    /*
     * addOrg adds the messages of organization to database.
     */
    boolean addOrg(Map params);

    /*
     * suspendNode removes the IP of node from white list of IP.
     */
    boolean suspendNode(int nodeId);

    /*
     * openNode adds the IP of node to white list of IP.
     */
    boolean openNode(int nodeId);

}