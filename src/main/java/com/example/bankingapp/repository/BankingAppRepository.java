package com.example.bankingapp.repository;

import java.util.Optional;

import com.example.bankingapp.Model.BankingAppModel;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankingAppRepository extends JpaRepository<BankingAppModel, Long> {
  List<BankingAppModel> findByPublished(boolean published);
  List<BankingAppModel> findByTitleContainingIgnoreCase(String title);
}