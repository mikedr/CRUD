package com.trimix.dao;

import java.util.List;

import com.trimix.model.Persona;

public interface PersonaDAO {
	
	public boolean savePersona(Persona persona);
	
	public List<Persona> getPersonas();

	public Persona getPersona(Integer id);

	public boolean deleteAccount(Integer accountNo);

}
