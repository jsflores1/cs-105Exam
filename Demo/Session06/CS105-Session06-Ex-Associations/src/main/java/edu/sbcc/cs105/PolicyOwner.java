package edu.sbcc.cs105;

/**
 * PolicyOwner
 */
public class PolicyOwner {

    private String id;
    private String name;
    private Policy policy;

    public PolicyOwner(String id, String name) {
        
        this.setId(id);
        this.setName(name);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    private void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    private void setId(String id) {
        this.id = id;
    }

    public void setPolicy(Policy policy){
        this.policy = policy;
    }

    public Policy getPolicy(){
        return policy;
    }
}