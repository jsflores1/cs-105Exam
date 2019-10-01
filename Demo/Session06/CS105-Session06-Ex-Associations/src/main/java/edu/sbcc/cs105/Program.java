package edu.sbcc.cs105;

import java.util.Date;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        
        Beneficiary beneficiary = new Beneficiary("Lucky Bob");
        PolicyOwner policyOwner1 = new PolicyOwner("123456", "Uncle Jim");
        PolicyOwner policyOwner2 = new PolicyOwner("123456", "Uncle Jim");

        Policy policyA = new Policy("P122345", new Date(2018, 12, 01), policyOwner1, "Term Life", 100000);
        policyA.addBeneficiary(beneficiary);

        Policy policyB = new Policy("P222345", new Date(2018, 10, 01), policyOwner2, "Whole Life", 200000);
        policyA.addBeneficiary(beneficiary);

        // PolicyOwner -> Policy -> 
        System.out.printf("%s has a %s policy for %d naming %s as a beneficiary%n", 
             policyOwner1.getName(),
             policyOwner1.getPolicy().getCoverageType(),
             policyOwner1.getPolicy().getCoverageAmount(),
             policyOwner1.getPolicy().getBeneficiary(1).getName());

        // The relatiosnship between Policy and PolicyOwner is bi-drectional becuase they each have an instance reference to each other,
        // so I can even use this to get back to the original object
        System.out.println(policyOwner1.getPolicy().getOwner().getName());

        // Since I have a reference to beneficiary, we can navigate back to the policies
        System.out.printf("%s is the beneficiary of the following policies:%n", beneficiary.getName());
        for (Policy pol : beneficiary.getAssociatedPolicies()) {
            System.out.printf("-Policy %d owned by %s",pol.getPolicyNumber(), pol.getOwner().getName());
        }
        
    }
}