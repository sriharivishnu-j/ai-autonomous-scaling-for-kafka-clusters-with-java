package com.example.ai.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ScalingServiceTest {

    @Test
    void testAutonomousScale() {
        ScalingService scalingService = new ScalingService();
        assertDoesNotThrow(scalingService::autonomousScale);
    }
}
