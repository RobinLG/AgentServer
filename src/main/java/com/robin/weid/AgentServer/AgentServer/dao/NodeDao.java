package com.robin.weid.AgentServer.AgentServer.dao;

import com.robin.weid.AgentServer.AgentServer.domain.Node;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author Robin
 */
@Repository
public interface NodeDao {

    /*
     * queryNodeList returns the list of nodes of
     * blockchain that was added into database.
     */
    List<Node> queryNodeList();

    /*
     * addNode adds the node of blockchain into database.
     * The params includes IP and port and so on.
     */
    boolean addNode(Map params);

    /*
     * removeNode removes the node of blockchain from database.
     */
    boolean removeNode(int nodeId);
}
