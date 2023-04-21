package com.example.testmd4_c11.service.impl;

import com.example.testmd4_c11.model.City;
import com.example.testmd4_c11.repository.ICityRepository;
import com.example.testmd4_c11.service.ICoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements ICoreService<City> {
    @Autowired
    private ICityRepository ICityRepository;
    @Override
    public void save(City city) {
        ICityRepository.save(city);
    }

    @Override
    public void delete(Long id) {
ICityRepository.deleteById(id);
    }

    @Override
    public List<City> findAll() {
        return ICityRepository.findAll();
    }

    @Override
    public City findById(Long id) {
        return ICityRepository.findById(id).orElse(null);
    }
}
