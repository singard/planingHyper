package com.matlas.matlasAPI.classe;

import java.util.Date;

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
public class Vacance {
	
	@Id
	@Column(name="id_vacance")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id_vacance;
	private Date dateDebut;
	private Date dateFin;

}
