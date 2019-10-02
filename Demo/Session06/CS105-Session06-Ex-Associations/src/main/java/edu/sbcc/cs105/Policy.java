package edu.sbcc.cs105;

import java.util.ArrayList;
import java.util.Date;

/**
 * Policy
 */
public class Policy {

    Date policyDate;
    String policyNumber;
    String coverageType;
    int coverageAmount;
    private PolicyOwner owner;
    private ArrayList<Beneficiary> beneficiaries = new ArrayList<>();

    public Policy(String policyNumber, Date policyDate, PolicyOwner owner, String coverageType, int coverageAmount) {
        
        this.policyNumber = policyNumber;
        this.policyDate = policyDate;
        this.coverageType = coverageType;
        this.coverageAmount = coverageAmount;

        // Here I am creating a bidirectional relationship: owner has ref to policy; policy has ref to owner
        this.owner = owner;
        owner.setPolicy(this);

       
    }

    /**
     * @return the owner
     */
    public PolicyOwner getOwner() {
        return owner;
    }

    public String getPolicyNumber(){
        return policyNumber;
    }

    public Date policyDate(){
        return policyDate;
    }


    public String getCoverageType(){
        return coverageType;
    }

    public int getCoverageAmount(){
        return coverageAmount;
    }

	public void addBeneficiary(Beneficiary beneficiary) {
        beneficiaries.add(beneficiary);        
	}

	public Beneficiary getBeneficiary(int number) {
        
        return beneficiaries.get(number - 1);
	}
   
   
}