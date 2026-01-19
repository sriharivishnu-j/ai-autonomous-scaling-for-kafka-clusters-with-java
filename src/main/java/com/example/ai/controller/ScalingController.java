package com.example.ai.controller;

import com.example.ai.service.ScalingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScalingController {

    @Autowired
    private ScalingService scalingService;

    @GetMapping("/scale")
    public String scaleCluster() {
        boolean scaled = scalingService.autonomousScale();
        return scaled ? "Cluster scaled successfully" : "No scaling needed";
    }
}
