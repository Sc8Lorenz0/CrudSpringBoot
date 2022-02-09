package com.thymeleaf.spring.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymeleaf.spring.app.model.Corso;
import com.thymeleaf.spring.app.repository.CorsoRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;



@Service
public class CorsoServiceImpl implements CorsoService {
	
	
	@Autowired
	private CorsoRepository corsoRepository;
	

	@Override
	public List<Corso> getAllCorsi() {
		// TODO Auto-generated method stub
		return corsoRepository.findAll();
	}

	@Override
	public void saveCorso(Corso corso) {
		// TODO Auto-generated method stub
		this.corsoRepository.save(corso);

	}

	@Override
    public Corso getCorsoById(long id) {
        java.util.Optional<Corso> optional = corsoRepository.findById(id);
        Corso corso = null;
        if (optional.isPresent()) {
            corso = optional.get();
        } else {
            throw new RuntimeException(" Corso not found for id :: " + id);
        }
        return corso;
    }
		

	@Override
	public void deleteCorsoById(long id) {
		// TODO Auto-generated method stub
		this.corsoRepository.deleteById(id);

	}

}
