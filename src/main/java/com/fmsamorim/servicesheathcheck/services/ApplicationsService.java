package com.fmsamorim.servicesheathcheck.services;

import org.springframework.stereotype.Service;

import com.fmsamorim.servicesheathcheck.models.Applications;
import com.fmsamorim.servicesheathcheck.models.EnumStatusService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicationsService {
    public List<Applications> getAll() {
        List<Applications> list = new ArrayList<>();
        var obj = new Applications();
        obj.Id = 1;
        obj.Service = "SERPRO";
        obj.Status = EnumStatusService.UP;

        list.add(obj);
        obj = new Applications();
        obj.Id = 2;
        obj.Service = "Conselho Nacional de Justiça";
        obj.Status = EnumStatusService.WARNING;

        list.add(obj);
        obj = new Applications();
        obj.Id = 3;
        obj.Service = "Tribunal de Justiça";
        obj.Status = EnumStatusService.ERROR;

        list.add(obj);

        return list;
    }
}
