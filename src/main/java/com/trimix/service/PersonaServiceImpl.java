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
	public Persona getPersona(Long id) {
		return personaDAO.getPersona(id);
	}

	@Override
	@Transactional
	public List<Persona> getPersonasPorNombre(String nombre) {
		return personaDAO.getPersonasPorNombre(nombre);
	}
	
	@Override
	@Transactional
	public List<Persona> getPersonasPorTipoDoc(String tipoDOC) {
		return personaDAO.getPersonasPorTipoDoc(tipoDOC);
	}

	@Override
	@Transactional
	public boolean deletePersona(Long id) {
		return personaDAO.deletePersona(id);
	}

	@Override
	@Transactional
	public void editPersona(Persona persona) {
		personaDAO.editPersona(persona);
	}

	@Override
	@Transactional
	public List<Persona> getPersonasPorNombreYPorTipoDoc(String nombre, String tipoDOC) {
		return personaDAO.getPersonasPorNombreYPorTipoDoc(nombre, tipoDOC);
	}

}
