package com.arun.springjdbcvsjpawithhibernate.controller;

import com.arun.springjdbcvsjpawithhibernate.model.Cricket;
import com.arun.springjdbcvsjpawithhibernate.service.CricketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CricketController {

    private CricketService cricketService;

    @Autowired
    public CricketController(CricketService cricketService) {
        this.cricketService = cricketService;
    }

    @GetMapping("crickets/v1/cricket")
    public ResponseEntity<List<Cricket>> getAllCrickets() {
        List<Cricket> allCricketers = cricketService.getAllCricketers();
        return new ResponseEntity<>(allCricketers, HttpStatus.OK);
    }
}
