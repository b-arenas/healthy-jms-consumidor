package com.curso.servidor.negocio;

import javax.transaction.Transactional;


import com.curso.servidor.entidades.Mensaje;
import com.curso.servidor.repositorio.MensajeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Negocio {
	@Autowired
	private MensajeRepositorio mensajeRepositorio;

	@Transactional
	public Mensaje grabar(Mensaje mensaje)
   {	   
	  return mensajeRepositorio.save(mensaje);
   }
}
