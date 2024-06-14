package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.CompanyDo;

@Repository
public interface CompanyRepo extends JpaRepository<CompanyDo, Integer>{

}
