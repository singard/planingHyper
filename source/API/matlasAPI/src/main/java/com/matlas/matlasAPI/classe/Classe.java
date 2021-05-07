package com.matlas.matlasAPI.classe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Classe {
	
	@Id
	@Column(name="id_classe")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id_classe;
	private String section;
	private String specialite;

}
