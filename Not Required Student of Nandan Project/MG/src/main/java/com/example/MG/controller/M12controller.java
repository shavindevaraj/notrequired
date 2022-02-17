package com.example.MG.controller;

import com.example.MG.models.M12;
import com.example.MG.models.M1;
import com.example.MG.models.M2;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/catalog")
public class M12controller {

    @RequestMapping("/{classAId}")
    public M12 getCatalog(@PathVariable String classAId) {
        RestTemplate restTemplate = new RestTemplate();
        M1 m1 = restTemplate.getForObject("http://localhost:3001/field1/get/" + classAId, M1.class);
        M2 m2 = restTemplate.getForObject("http://localhost:3002/field2/getCourse/" + classAId, M2.class);
        return new M12(m1.getName(), m1.getCollege(), m2.getCourse(), m2.getStudentId());

    }

}
