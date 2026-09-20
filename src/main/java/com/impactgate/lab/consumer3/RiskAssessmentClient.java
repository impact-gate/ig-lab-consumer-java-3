package com.impactgate.lab.consumer3;

public class RiskAssessmentClient {
    public String calculateCustomerGrade(int creditScore, int activeLoanCount) {
        if (creditScore >= 750 && activeLoanCount <= 2) return "TIER_A";
        if (creditScore >= 650 && activeLoanCount <= 4) return "TIER_B";
        return "TIER_C";
    }
}
