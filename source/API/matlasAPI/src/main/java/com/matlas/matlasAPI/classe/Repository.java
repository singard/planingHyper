package com.matlas.matlasAPI.classe;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface Repository extends JpaRepository<Matiere,Integer>{
	
	    Matiere findById(int id);
	   
	
}
