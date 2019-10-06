package com.robin.weid.AgentServer.AgentServer.domain;

public class Organization {

    private int orgId;
    private String orgIp;
    private String orgOwner;
    private String orgSuspend;

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    public String getOrgIp() {
        return orgIp;
    }

    public void setOrgIp(String orgIp) {
        this.orgIp = orgIp;
    }

    public String getOrgOwner() {
        return orgOwner;
    }

    public void setOrgOwner(String orgOwner) {
        this.orgOwner = orgOwner;
    }

    public String getOrgSuspend() {
        return orgSuspend;
    }

    public void setOrgSuspend(String orgSuspend) {
        this.orgSuspend = orgSuspend;
    }
}
