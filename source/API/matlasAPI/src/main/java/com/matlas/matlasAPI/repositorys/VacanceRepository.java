package com.matlas.matlasAPI.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matlas.matlasAPI.classe.Vacance;


public interface VacanceRepository extends JpaRepository<Vacance,Integer>{
//	Vacance findById_Vacance(int id);
	List<Vacance> findAll();
//	void save(Vacance vacance);
}
