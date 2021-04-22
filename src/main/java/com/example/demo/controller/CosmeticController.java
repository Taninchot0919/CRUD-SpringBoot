package com.example.demo.controller;

import com.example.demo.model.Cosmetic;
import com.example.demo.service.CosmeticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CosmeticController {
    @Autowired
    CosmeticService cosmeticService;

    @GetMapping("/")
    public List<Cosmetic> getAllCosmetics() {
        return cosmeticService.getAllCosmetics();
    }

    @PostMapping("/")
    public List<Cosmetic> addCosmetics(@RequestBody Cosmetic cosmetic) {
        cosmeticService.addCosmetic(cosmetic);
        return cosmeticService.getAllCosmetics();
    }

    @DeleteMapping("/{id}")
    public List<Cosmetic> deleteCosmeticsId(@PathVariable int id) {
        cosmeticService.deleteCosmetic(id);
        return cosmeticService.getAllCosmetics();
    }

    @GetMapping("/{id}")
    public Optional<Cosmetic> getCosmeticId(@PathVariable int id){
        return cosmeticService.getCosmeticId(id);
    }


}
