package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Cosmetic;
import com.example.demo.repositories.CosmeticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// ที่จริงแล้วส่วนนี้จะเอาไว้เก็บ logic แบบหนาๆเลย
@Service
public class CosmeticService {

    @Autowired
    private CosmeticRepository cosmeticRepository;

    public List<Cosmetic> getAllCosmetics() {
        return cosmeticRepository.findAll();
    }

    public void addCosmetic(Cosmetic cosmetic) {
        cosmeticRepository.save(cosmetic);
    }

    public void deleteCosmetic(int id) {
        cosmeticRepository.deleteById(id);
    }

    public Optional<Cosmetic> getCosmeticId(int id){
        return cosmeticRepository.findById(id);
    }
}