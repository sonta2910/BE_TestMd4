package com.example.testmd4_c11.service.impl;

import com.example.testmd4_c11.model.Nation;
import com.example.testmd4_c11.repository.INationRepository;
import com.example.testmd4_c11.service.ICoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NationServiceImpl implements ICoreService<Nation> {
    @Autowired
    private INationRepository nationRepository;

    @Override
    public void save(Nation nation) {
        nationRepository.save(nation);
    }

    @Override
    public void delete(Long id) {
        nationRepository.deleteById(id);
    }

    @Override
    public List<Nation> findAll() {
        return nationRepository.findAll();
    }

    @Override
    public Nation findById(Long id) {
        return nationRepository.findById(id).orElse(null);
    }
}
