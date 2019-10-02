package edu.sbcc.cs105;

public class AwardManager {

	public String GetAward(String studentModel, int expectedFamilyContribution, String primaryParentMaritalStatus) {

		String aidType = null;

		// Level 0
		if (studentModel.equals("Dependent")) {
			// Level 1
			aidType = getDependentStudentAward(expectedFamilyContribution, primaryParentMaritalStatus);

		} else {
			// Assume that data has been validated so that only dependent and independent
			// allowed
			// Level 1
			aidType = getIndependentStudentAward(expectedFamilyContribution);
		}

		return aidType;
	}

	private String getIndependentStudentAward(int expectedFamilyContribution) {
		String aidType;
		if (expectedFamilyContribution <= 5000) {
			aidType = "University Grant";
		} else {
			aidType = "Subsidized Loan";
		}
		return aidType;
	}

	private String getDependentStudentAward(int expectedFamilyContribution, String primaryParentMaritalStatus) {
		String aidType;
		if (expectedFamilyContribution <= 3000) {
			// Level 2
			if (primaryParentMaritalStatus.equals("Single")) {
				aidType = "State Grant";
			} else {
				aidType = "University Grant";
			}
		} else {
			aidType = "PLUS Loan";
		}
		return aidType;
	}

}
