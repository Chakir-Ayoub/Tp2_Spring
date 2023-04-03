package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Livre;


@Repository
public interface LivreRepository extends JpaRepository<Livre, Integer> {
  Livre findByid(Integer id);
  
  List<Livre> findBydateEditionBetween(Date startDate,Date endDate);
}
