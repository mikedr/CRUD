package com.trimix.service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.trimix.model.Persona;

@Service
public class PersonasService {
	private static List<Persona> personasDB = new ArrayList<Persona>();
	private static int todoCount = 3;

	static {
		personasDB.add(new Persona(1, "Pratto", "Oso", 9122018L,"DNI", new Date()));
		personasDB.add(new Persona(2, "Quinteroooooooo", "Juanfer", 9122018L,"Pasaporte", new Date()));
		personasDB.add(new Persona(3, "Martinez", "Que loco que esta", 9122018L,"Cedula", new Date()));
	}
	
	public List<Persona> retrievePersonas() {
		List<Persona> personas = new ArrayList<Persona>();
		for(Persona persona : personasDB) {
			personas.add(persona);
		}
		return personas;
	}

	public List<Persona> retrievePersona(String perNombre, String perTipoDocumento) {
		List<Persona> personas = new ArrayList<Persona>();
		for(Persona persona : personasDB) {
			if(persona.getPerTipoDocumento().equals(perTipoDocumento)) {
				personas.add(persona);
			}
		}
		return personas;
	}
}
