package com.dis.disney.service;

import java.util.List;


import com.dis.disney.dto.PersonajeDto;
import com.dis.disney.model.Personaje;


public interface PersonajeService {
	
	public List<Personaje> get();
	
	public Personaje savePersonaje(PersonajeDto p);
	
	public void deletPersonae(Integer id);
	
	public Personaje updatePersonaje(Integer id,PersonajeDto p);
	
	
}