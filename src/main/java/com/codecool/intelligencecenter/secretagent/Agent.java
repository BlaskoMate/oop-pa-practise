package com.codecool.intelligencecenter.secretagent;

import com.codecool.intelligencecenter.secretagent.blueprints.HigherRankAgent;
import com.codecool.intelligencecenter.secretagent.blueprints.LowerRankAgent;
import com.codecool.intelligencecenter.secretagent.blueprints.SecretAgent;

import java.util.LinkedList;
import java.util.List;

public class Agent extends LowerRankAgent<Officer> implements HigherRankAgent {

    private final List<PartialAgent> partialAgentInformationList = new LinkedList<>();

    public Agent(Integer id, String name, String alias, String contactInformation, String profession) {
        super(id, name, alias, contactInformation, profession);
    }

    public void addPartialAgent(PartialAgent partialAgent){
        partialAgentInformationList.add(partialAgent);
    }

    @Override
    public String sendMessageToAgent(String contactInformation) {
        return "message sent";
    }
}
