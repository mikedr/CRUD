package com.trimix.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.trimix.model.Persona;
import com.trimix.model.PersonaBuscar;
import com.trimix.service.PersonaService;

@Controller
public class PersonasController {
	
	@Autowired
	private PersonaService personaService;
	
	@RequestMapping(value="/personas", method = RequestMethod.GET)
	public String mostrarPersonas(ModelMap model) {
		model.addAttribute("personas", personaService.getPersonas());
		return "personas";
	}
	
	@RequestMapping(value="/personasFiltradas", method = RequestMethod.GET)
	public String mostrarPersonasFiltradas(ModelMap model) {
		return "personas";
	}
	
	@RequestMapping(value="/editar", method = RequestMethod.GET)
	public String showEditar(ModelMap model, @RequestParam int id) {
	    List<String> tiposDocumento = new ArrayList<String>();
	    tiposDocumento.add("DNI");
	    tiposDocumento.add("Pasaporte");
	    tiposDocumento.add("Cedula");
	    model.addAttribute("tiposDocumento", tiposDocumento);
		model.addAttribute("persona", personaService.getPersona(new Long(id)));
		return "formPersona";
	}
	
	@RequestMapping(value="/editar", method = RequestMethod.POST)
	public String editarPersona(ModelMap model, @Valid Persona persona, 
			BindingResult result) {
		if(result.hasErrors()) {
			model.clear();
		    List<String> tiposDocumento = new ArrayList<String>();
		    tiposDocumento.add("DNI");
		    tiposDocumento.add("Pasaporte");
		    tiposDocumento.add("Cedula");
		    model.addAttribute("tiposDocumento", tiposDocumento);
			model.addAttribute("persona", persona);
			return "formPersona";
		}
		personaService.editPersona(persona);
	    model.clear();
		return "redirect:buscar";
	}	
	
	@RequestMapping(value="/eliminar", method = RequestMethod.GET)
	public String mostrarEliminar(ModelMap model, @RequestParam int id) {
		personaService.deletePersona(new Long(id));
		return "redirect:personas";
	}

}
