package com.robin.weid.AgentServer.AgentServer.service;

import com.robin.weid.AgentServer.AgentServer.domain.Node;

import java.util.List;
import java.util.Map;

public interface NodeService {

    /*
     * queryNodeList finds out all of nodes from database.
     */
    List<Node> queryNodeList();

    /*
     * addNode adds IP, port and so on of node to database.
     */
    boolean addNode(Map params);

    /*
     * removeNode removes node from database.
     */
    boolean removeNode(int nodeId);
}
