package com.codecool.intelligencecenter.secretagent;

import com.codecool.intelligencecenter.secretagent.blueprints.LowerRankAgent;

public class Informant extends LowerRankAgent<Agent> {


    public Informant(Integer id, String name, String alias, String contactInformation, String profession) {
        super(id, name, alias, contactInformation, profession);
    }

}
