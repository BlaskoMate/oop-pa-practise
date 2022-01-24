package com.codecool.intelligencecenter.secretagent;

import com.codecool.intelligencecenter.IntelligenceCentre;
import com.codecool.intelligencecenter.secretagent.blueprints.HigherRankAgent;
import com.codecool.intelligencecenter.secretagent.blueprints.LowerRankAgent;
import com.codecool.intelligencecenter.secretagent.blueprints.SecretAgent;

import java.util.List;
import java.util.stream.Collectors;

public class Officer extends SecretAgent implements HigherRankAgent {

    private final IntelligenceCentre intelligenceCentre;

    public Officer(IntelligenceCentre intelligenceCentre, Integer id, String name, String alias, String contactInformation) {
        super(id, name, alias, contactInformation);
        this.intelligenceCentre = intelligenceCentre;
    }

    @Override
    public String sendMessageToAgent(String contactInformation) {
        return "msg sent";
    }

    public List<SecretAgent> getAgentsWithCompromisedSuperior(){
        return intelligenceCentre.getSecretAgents().stream()
                .filter( e -> e instanceof LowerRankAgent)
                .filter(e -> ((LowerRankAgent<?>) e).getSuperior().getAgentStatus() == AgentStatus.COMPROMISED)
                .collect(Collectors.toList());
    }
}
