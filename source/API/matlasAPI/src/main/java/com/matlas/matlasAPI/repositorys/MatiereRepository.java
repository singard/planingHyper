package com.matlas.matlasAPI.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matlas.matlasAPI.classe.Matiere;



public interface MatiereRepository extends JpaRepository<Matiere,Integer>{
	
	    Matiere findById(int id);
	    List<Matiere> findAll();
	   
	
}
