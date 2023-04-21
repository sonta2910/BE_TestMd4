package com.example.testmd4_c11.controller;

import com.example.testmd4_c11.model.City;
import com.example.testmd4_c11.model.Nation;
import com.example.testmd4_c11.service.impl.CityServiceImpl;
import com.example.testmd4_c11.service.impl.NationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/cities")
public class CityController {
    @Autowired
    private NationServiceImpl nationService;
    @Autowired
    private CityServiceImpl cityService;
    @GetMapping
    public ResponseEntity<List<City>>findAll(){
        List<City>cities=cityService.findAll();
        return new ResponseEntity<>(cities, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Void>create(@RequestBody City city){
        cityService.save(city);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void>delete(@PathVariable Long id){
        cityService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<City>findOne(@PathVariable Long id){
        return new ResponseEntity<>(cityService.findById(id),HttpStatus.OK);
    }
    @GetMapping("/nations")
    public ResponseEntity<List<Nation>>findAllNation(){
        List<Nation> nations = nationService.findAll();
        return new ResponseEntity<>(nations,HttpStatus.OK);
    }
}
