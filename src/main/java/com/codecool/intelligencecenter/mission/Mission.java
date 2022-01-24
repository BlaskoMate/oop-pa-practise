package com.codecool.intelligencecenter.mission;

import com.codecool.intelligencecenter.secretagent.Agent;
import com.codecool.intelligencecenter.secretagent.Officer;
import com.codecool.intelligencecenter.secretagent.Informant;

import java.time.LocalDate;
import java.util.List;

public class Mission {

    private final String codeName;
    private LocalDate deadline;
    private MissionStatus status;
    private Officer officer;
    private Agent agent;
    private List<Informant> informants;

    public Mission(String codeName, LocalDate deadline, Officer officer, Agent agent, List<Informant> informants) {
        this.codeName = codeName;
        this.deadline = deadline;
        this.status = MissionStatus.IN_PROGRESS;
        this.officer = officer;
        this.agent = agent;
        this.informants = informants;
    }

    public Mission(String codeName, LocalDate deadline) {
        this.codeName = codeName;
        this.deadline = deadline;
        this.status = MissionStatus.IN_PROGRESS;
    }

    public boolean isPastDeadline(){
        return LocalDate.now().isAfter(deadline);
    }

    public String deactivateLowerRateAgents(){
        return "deactivated";
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public void setStatus(MissionStatus status) {
        this.status = status;
    }

    public void setOfficer(Officer officer) {
        this.officer = officer;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public void setInformants(List<Informant> informants) {
        this.informants = informants;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public MissionStatus getStatus() {
        return status;
    }

    public Officer getOfficer() {
        return officer;
    }

    public Agent getAgent() {
        return agent;
    }

    public List<Informant> getInformants() {
        return informants;
    }

    @Override
    public String toString(){
        return String.format("Mission %s / deadline: %s / status: %s / leading officer: %s", codeName, deadline, status, officer.getAlias());
    }
}
