package com.thymeleaf.spring.app.service;

import java.util.List;

import com.thymeleaf.spring.app.model.Corso;

public interface CorsoService {

	List<Corso> getAllCorsi();

	void saveCorso(Corso corso);

	Corso getCorsoById(long id);

	void deleteCorsoById(long id);

}
