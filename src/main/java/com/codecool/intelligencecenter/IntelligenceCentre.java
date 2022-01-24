package com.codecool.intelligencecenter;

import com.codecool.intelligencecenter.mission.Mission;
import com.codecool.intelligencecenter.mission.MissionStatus;
import com.codecool.intelligencecenter.secretagent.*;
import com.codecool.intelligencecenter.secretagent.blueprints.SecretAgent;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class IntelligenceCentre {

    private List<SecretAgent> secretAgents = new LinkedList<SecretAgent>();
    private List<Mission> missions = new LinkedList<Mission>();

    public List<SecretAgent> getSecretAgents() {
        return secretAgents;
    }

    public List<Mission> getMissions() {
        return missions;
    }

    public String hireNewAgent(SecretAgent secretAgent){
        return "hired";
    }

    public List<SecretAgent> createPartialAgentInformationList(){
        return secretAgents.stream().map(e -> new PartialAgent(e.getId(), e.getAlias(), e.getContactInformation())).collect(Collectors.toList());
    }

    private void updatePartialAgentInformationList(SecretAgent newAgent){
        PartialAgent partialAgent = new PartialAgent(newAgent.getId(), newAgent.getAlias(), newAgent.getContactInformation());
        secretAgents.stream()
                .filter(e -> e instanceof Agent)
                .forEach(e -> ((Agent) e).addPartialAgent(partialAgent));
    }

    public List<SecretAgent> getAgentsUnderOfficer(Officer officer){
        return secretAgents.stream().filter(e -> {{
            if (e instanceof Agent){
                return ((Agent) e).getSuperior() == officer && e.getAgentStatus() == AgentStatus.ACTIVE;
            }
            return false;
        }}).collect(Collectors.toList());
    }

    public List<SecretAgent> getInformantUnderAgent(Agent agent){
        return secretAgents.stream().filter(e -> {{
            if (e instanceof Informant){
                return ((Informant) e).getSuperior() == agent;
            }
            return false;
        }}).collect(Collectors.toList());
    }

    public String getAllCompletedMissionReport(){
        return missions.stream()
                .map(Mission::toString)
                .collect(Collectors.joining("\n\n"));
    }

    public String getInProgressPastDeadlineMissionReport(){
        return missions.stream()
                .filter(Mission::isPastDeadline)
                .filter(e -> e.getStatus() == MissionStatus.IN_PROGRESS)
                .map(Mission::toString)
                .collect(Collectors.joining("\n\n"));
    }

    public String getAgentsEligibleForRetirementReport(){
        return secretAgents.stream()
                .filter(e -> e.getCompletedMissions().size() >= 3)
                .map(SecretAgent::toString)
                .collect(Collectors.joining());
    }

    public String getOfficerAssignedToMostCompletedMissionReport(){
        return secretAgents.stream()
                .filter(o -> o instanceof Officer)
                .max(Comparator.comparingInt(o -> (int) missions.stream().filter(m -> m.getOfficer() == o).count())).toString();
    }
}
