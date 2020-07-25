package fulbito.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fulbito.app.models.entity.Persona;
import fulbito.app.models.services.IPersonaService;

@RestController
@RequestMapping("/api")
public class PersonaRestController {
	
	@Autowired
	private IPersonaService personaService;
	
	@GetMapping("/persona")
	public List<Persona> listar(){
		return personaService.listar();		
	}
	/*
	 * INSERT INTO public.persona(
	nombre, apellido, tipo_dni, dni, sexo, fecha_nacimiento)
	VALUES ('pepe', 'pateatraseros', 'DNI', '33460632', 'si por favor', '19/07/1988');
	 */
	
	/*
	 * prueba
	 * */
}
