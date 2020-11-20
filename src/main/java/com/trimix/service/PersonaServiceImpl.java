package com.trimix.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trimix.dao.PersonaDAO;
import com.trimix.model.Persona;

@Service
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired
	PersonaDAO personaDAO;

	@Override
	@Transactional
	public boolean savePersona(Persona persona) {
		return personaDAO.savePersona(persona);
	}

	@Override
	@Transactional
	public List<Persona> getPersonas() {
		return personaDAO.getPersonas();
	}

	@Override
	@Transactional
	public Persona getPersona(Integer id) {
		return personaDAO.getPersona(id);
	}

	@Override
	@Transactional
	public boolean deleteAccount(Integer accountNo) {
		// TODO Auto-generated method stub
		return false;
	}

}
