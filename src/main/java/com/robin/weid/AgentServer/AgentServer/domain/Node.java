package com.robin.weid.AgentServer.AgentServer.domain;

public class Node {

    private int nodeId;
    private String nodeIp;
    private String noderpc;
    private String nodeOwner;
    private int nodeCancle;

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeIp() {
        return nodeIp;
    }

    public void setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
    }

    public String getNoderpc() {
        return noderpc;
    }

    public void setNoderpc(String noderpc) {
        this.noderpc = noderpc;
    }

    public String getNodeOwner() {
        return nodeOwner;
    }

    public void setNodeOwner(String nodeOwner) {
        this.nodeOwner = nodeOwner;
    }

    public int getNodeCancle() {
        return nodeCancle;
    }

    public void setNodeCancle(int nodeCancle) {
        this.nodeCancle = nodeCancle;
    }
}
