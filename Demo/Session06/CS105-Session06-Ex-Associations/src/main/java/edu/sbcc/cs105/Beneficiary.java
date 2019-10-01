package edu.sbcc.cs105;

import java.util.ArrayList;

/**
 * Beneficiary
 */
public class Beneficiary {

    private String name;
    private ArrayList<Policy> associatedPolicies = new ArrayList<>();

    public Beneficiary(String name) {
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

    private void addAssociatedPolicies(Policy policy){
        associatedPolicies.add(policy);
    }

	public ArrayList<Policy> getAssociatedPolicies() {
		return new ArrayList<>(associatedPolicies);
	}
}