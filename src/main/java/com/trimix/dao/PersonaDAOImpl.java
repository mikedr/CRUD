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
			currentSession.saveOrUpdate(personaEntity);
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
	public Persona getPersona(Long id) {
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
	public List<Persona> getPersonasPorNombre(String nombre) {
		List<Persona> list = new ArrayList<Persona>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query<PersonaEntity> query = session.createQuery("From PersonaEntity Where perNombre LIKE '"+nombre+"%'", PersonaEntity.class);
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
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<Persona> getPersonasPorTipoDoc(String tipoDOC) {
		List<Persona> list = new ArrayList<Persona>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query<PersonaEntity> query = session.createQuery("From PersonaEntity Where perTipoDocumento = '"+tipoDOC+"'", PersonaEntity.class);
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
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean deletePersona(Long id) {
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

	@Override
	public void editPersona(Persona persona) {
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			PersonaEntity personaEntity = new PersonaEntity();
			personaEntity.setPerId(persona.getPerId());
			personaEntity.setPerNombre(persona.getPerNombre());
			personaEntity.setPerApellido(persona.getPerApellido());
			personaEntity.setPerNumeroDocumento(persona.getPerNumeroDocumento());
			personaEntity.setPerTipoDocumento(persona.getPerTipoDocumento());
			personaEntity.setPerFechaNacimiento(persona.getPerFechaNacimiento());
			currentSession.update(personaEntity);
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
	}

	@Override
	public List<Persona> getPersonasPorNombreYPorTipoDoc(String nombre, String tipoDOC) {
		List<Persona> list = new ArrayList<Persona>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query<PersonaEntity> query = session.createQuery("From PersonaEntity Where perNombre LIKE '"+nombre+"%' AND perTipoDocumento = '"+tipoDOC+"'", PersonaEntity.class);
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
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}
	
	

}
