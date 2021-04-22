package com.example.demo.repositories;

import com.example.demo.model.Cosmetic;
import org.springframework.data.jpa.repository.JpaRepository;

// เราแค่ extends อย่าเดียวเพราะ JpaRepository ส่วนใหญ่มีให้หมดแล้ว
// < 1 , 2 > ตัวแรกคือใช้คลาสไหน ตัวสองคือ Data Type ของ Primary Key
public interface CosmeticRepository extends JpaRepository <Cosmetic, Integer>{
}
