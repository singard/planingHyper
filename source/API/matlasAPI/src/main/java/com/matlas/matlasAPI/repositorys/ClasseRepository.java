package com.matlas.matlasAPI.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matlas.matlasAPI.classe.Classe;


public interface ClasseRepository extends JpaRepository<Classe,Integer>{
//	Classe findById_classe(int id);
	List<Classe> findAll();
}
