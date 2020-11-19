package com.trimix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trimix.model.Persona;
import com.trimix.service.PersonasService;

@Controller
public class PersonasController {
	
	@Autowired
	private PersonasService service;
	
	@RequestMapping(value="/personas", method = RequestMethod.GET)
	public String mostrarPersonas(ModelMap model) {
		model.addAttribute("personas", service.retrievePersonas());
		return "personas";
	}
	
	@RequestMapping(value="/personasFiltradas", method = RequestMethod.GET)
	public String mostrarPersonasFiltradas(ModelMap model) {
		return "personas";
	}
	
	@RequestMapping(value="/editar", method = RequestMethod.GET)
	public String showEditar(ModelMap model) {
		model.addAttribute("persona", new Persona());
		return "formPersona";
	}
	
	@RequestMapping(value="/editar", method = RequestMethod.POST)
	public String editar(ModelMap model) {
		//service update
		return "personas";
	}	
	
	@RequestMapping(value="/eliminar", method = RequestMethod.GET)
	public String mostrarEliminar(ModelMap model) {
		//logica delete
		return "redirect:personas";
	}

}
