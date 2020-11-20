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

import com.trimix.model.Persona;
import com.trimix.model.PersonaBuscar;
import com.trimix.service.PersonaService;

@Controller
public class NuevaPersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	@RequestMapping(value="/nuevaPersona", method = RequestMethod.GET)
	public String buscarPersonaPage(ModelMap model) {
		model.addAttribute("persona", new Persona());
	    List<String> tiposDocumento = new ArrayList<String>();
	    tiposDocumento.add("DNI");
	    tiposDocumento.add("Pasaporte");
	    tiposDocumento.add("Cedula");
	    model.addAttribute("tiposDocumento", tiposDocumento);
		return "formPersona";
	}
	
	@RequestMapping(value="/nuevaPersona", method = RequestMethod.POST)
	public String guardarPersona(ModelMap model, @Valid Persona persona, 
			BindingResult result) {
		if(result.hasErrors()) {
		    List<String> tiposDocumento = new ArrayList<String>();
		    tiposDocumento.add("DNI");
		    tiposDocumento.add("Pasaporte");
		    tiposDocumento.add("Cedula");
		    model.addAttribute("tiposDocumento", tiposDocumento);
			return "formPersona";
		}
		personaService.savePersona(persona);
		model.clear();
		model.addAttribute("personaBuscar", new PersonaBuscar("",""));
	    List<String> tiposDocumento = new ArrayList<String>();
	    tiposDocumento.add("DNI");
	    tiposDocumento.add("Pasaporte");
	    tiposDocumento.add("Cedula");
	    model.addAttribute("tiposDocumento", tiposDocumento);
		return "buscar";
	}
	
}
