package com.thymeleaf.spring.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="corsi")
public class Corso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	
	@Column(name="nome_corso")
	private String nomeCorso;
	@Column(name="luogo_corso")
	private String luogoCorso;
	@Column(name="datainiziofine_corso")
	private String dataInizioFineCorso;
	@Column(name="ore_corso")
	private String oreCorso;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeCorso() {
		return nomeCorso;
	}
	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}
	public String getLuogoCorso() {
		return luogoCorso;
	}
	public void setLuogoCorso(String luogoCorso) {
		this.luogoCorso = luogoCorso;
	}
	public String getDataInizioFineCorso() {
		return dataInizioFineCorso;
	}
	public void setDataInizioFineCorso(String dataInizioFineCorso) {
		this.dataInizioFineCorso = dataInizioFineCorso;
	}
	public String getOreCorso() {
		return oreCorso;
	}
	public void setOreCorso(String oreCorso) {
		this.oreCorso = oreCorso;
	}
	

}
