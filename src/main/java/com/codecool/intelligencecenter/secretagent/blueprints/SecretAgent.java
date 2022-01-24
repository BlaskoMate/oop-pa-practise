package com.codecool.intelligencecenter.secretagent.blueprints;

import com.codecool.intelligencecenter.mission.Mission;
import com.codecool.intelligencecenter.secretagent.Agent;
import com.codecool.intelligencecenter.secretagent.AgentStatus;

import java.util.LinkedList;
import java.util.List;

public abstract class SecretAgent {

    private final Integer id;
    private String name;
    private String alias;
    private AgentStatus status;
    private String contactInformation;
    private List<Mission> completedMissions = new LinkedList<>();

    public SecretAgent(Integer id, String name,  String alias , String contactInformation) {
        this.id = id;
        this.name = name;
        this.alias = alias;
        this.status = AgentStatus.ACTIVE;
        this.contactInformation = contactInformation;
    }

    public SecretAgent(Integer id,  String alias , String contactInformation) {
        this.id = id;
        this.alias = alias;
        this.status = AgentStatus.ACTIVE;
        this.contactInformation = contactInformation;
    }

    public String changeAlias(String alias){
        return "alias changed";
    }

    public String liquidateAgent(Agent agent){
        return agent.getAlias() + " liquidated";
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setStatus(AgentStatus status) {
        this.status = status;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public void setCompletedMissions(List<Mission> completedMissions) {
        this.completedMissions = completedMissions;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    public AgentStatus getAgentStatus() {
        return status;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public List<Mission> getCompletedMissions() {
        return completedMissions;
    }

    @Override
    public String toString(){
        return String.format("Alias: %s / status: %s / contactInfo: %s\ncompleted missions: %s", alias, status, contactInformation, completedMissions);
    }
}
