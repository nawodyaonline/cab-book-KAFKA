package com.dailycode.cab_book_driver.controller;

import com.dailycode.cab_book_driver.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class CabLocationController {

    private final CabLocationService cabLocationService;

    @Autowired
    public CabLocationController(CabLocationService cabLocationService) {
        this.cabLocationService = cabLocationService;
    }

    @PutMapping
    public ResponseEntity updateLocation(){



        return new ResponseEntity(Map.of("message", "Location updated!"), HttpStatus.OK);
    }
}
