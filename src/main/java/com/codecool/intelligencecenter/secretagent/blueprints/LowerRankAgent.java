package com.codecool.intelligencecenter.secretagent.blueprints;

public abstract class LowerRankAgent<T> extends SecretAgent{

    String profession;
    T superior;

    public LowerRankAgent(Integer id, String name, String alias, String contactInformation, String profession) {
        super(id, name, alias, contactInformation);
        this.profession = profession;
    }

    public void setSuperior(T superior) {
        this.superior = superior;
    }

    public T getSuperior() {
        return superior;
    }

    public String getProfession(){
        return profession;
    }

    public void setProfession(String profession){
        this.profession = profession;
    }
}
