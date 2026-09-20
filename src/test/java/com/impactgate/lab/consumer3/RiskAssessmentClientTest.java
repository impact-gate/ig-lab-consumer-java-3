package com.impactgate.lab.consumer3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RiskAssessmentClientTest {
    @Test
    public void testRiskGrading() {
        RiskAssessmentClient client = new RiskAssessmentClient();
        assertEquals("TIER_A", client.calculateCustomerGrade(780, 1));
        assertEquals("TIER_B", client.calculateCustomerGrade(680, 3));
        assertEquals("TIER_C", client.calculateCustomerGrade(580, 5));
    }
}
