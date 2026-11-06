package com.example.touristservice;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tourists")
public class TouristController {

    private final TouristService touristService;
    private final Environment environment;

    public TouristController(TouristService touristService, Environment environment) {
        this.touristService = touristService;
        this.environment = environment;
    }

    @GetMapping
    public Map<String, Object> getAllTourists() {
        // Read the actual running port assigned by the OS
        String port = environment.getProperty("local.server.port");

        List<Tourist> tourists = touristService.getAllTourists();

        Map<String, Object> response = new HashMap<>();
        response.put("instancePort", port);
        response.put("tourists", tourists);

        return response;
    }
}
