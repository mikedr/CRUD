package com.trimix.service;

import java.util.List;

import com.trimix.model.Persona;

public interface PersonaService {

	public boolean savePersona(Persona persona);
	
	public List<Persona> getPersonas();
	
	public Persona getPersona(Long id);

	public List<Persona> getPersonasPorNombre(String nombre);

	public List<Persona> getPersonasPorTipoDoc(String tipoDOC);
	
	public List<Persona> getPersonasPorNombreYPorTipoDoc(String nombre, String tipoDOC);
	
	public boolean deletePersona(Long id);
	
	public void editPersona(Persona persona);
}
