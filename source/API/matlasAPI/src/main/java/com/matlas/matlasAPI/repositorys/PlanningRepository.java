package com.matlas.matlasAPI.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matlas.matlasAPI.classe.Planning;


public interface PlanningRepository extends JpaRepository<Planning,Integer>{
//	Planning findById_Planning(int id);
	List<Planning> findAll();
	Planning findById(int id);
//	void add(Planning planning);
}
