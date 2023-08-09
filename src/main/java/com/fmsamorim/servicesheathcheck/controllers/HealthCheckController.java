package com.fmsamorim.servicesheathcheck.controllers;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fmsamorim.servicesheathcheck.models.Applications;
import com.fmsamorim.servicesheathcheck.services.ApplicationsService;
import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class HealthCheckController {

    private final ApplicationsService _applicationsService;
    public HealthCheckController(ApplicationsService applicationsService) {
        _applicationsService = applicationsService;
    }

    @GetMapping("/healthcheck")
    public List<Applications> healthcheck() {
        return _applicationsService.getAll();
    }
}
