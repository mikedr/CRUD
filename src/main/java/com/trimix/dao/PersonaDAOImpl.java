package com.trimix.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trimix.entity.PersonaEntity;
import com.trimix.model.Persona;

@Repository
public class PersonaDAOImpl implements PersonaDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean savePersona(Persona persona) {
		boolean saveFlag = true;
		PersonaEntity personaEntity = new PersonaEntity();
		personaEntity.setPerId(persona.getPerId());
		personaEntity.setPerNombre(persona.getPerNombre());
		personaEntity.setPerApellido(persona.getPerApellido());
		personaEntity.setPerNumeroDocumento(persona.getPerNumeroDocumento());
		personaEntity.setPerTipoDocumento(persona.getPerTipoDocumento());
		personaEntity.setPerFechaNacimiento(persona.getPerFechaNacimiento());
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.save(personaEntity);
		} catch (Exception ex) {
			ex.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}

	@Override
	public List<Persona> getPersonas() {
		List<Persona> list = new ArrayList<Persona>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query<PersonaEntity> query = session.createQuery("From PersonaEntity", PersonaEntity.class);
			List<PersonaEntity> personaEntities = query.getResultList();
			for(PersonaEntity personaEntity : personaEntities) {
				Persona persona = new Persona();
				persona.setPerId(personaEntity.getPerId());
				persona.setPerNombre(personaEntity.getPerNombre());
				persona.setPerApellido(personaEntity.getPerApellido());
				persona.setPerNumeroDocumento(personaEntity.getPerNumeroDocumento());
				persona.setPerTipoDocumento(personaEntity.getPerTipoDocumento());
				persona.setPerFechaNacimiento(personaEntity.getPerFechaNacimiento());				
				list.add(persona);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}

	@Override
	public Persona getPersona(Integer id) {
		Persona persona = new Persona();
		try {
			Session session = sessionFactory.getCurrentSession();
			PersonaEntity personaEntity = (PersonaEntity)session.load(PersonaEntity.class, id);
			persona.setPerId(personaEntity.getPerId());
			persona.setPerNombre(personaEntity.getPerNombre());
			persona.setPerApellido(personaEntity.getPerApellido());
			persona.setPerNumeroDocumento(personaEntity.getPerNumeroDocumento());
			persona.setPerTipoDocumento(personaEntity.getPerTipoDocumento());
			persona.setPerFechaNacimiento(personaEntity.getPerFechaNacimiento());
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return persona;
	}

	@Override
	public boolean deleteAccount(Integer id) {
		boolean deleteFlag = true;
		try {
			Session session = sessionFactory.getCurrentSession();
			PersonaEntity personaEntity = (PersonaEntity)session.load(PersonaEntity.class, id);
			session.delete(personaEntity);
		} catch (Exception ex) {
			ex.printStackTrace();
			deleteFlag= false;
		}
		return deleteFlag;
	}

}
