package com.curso.servidor.repositorio;

import com.curso.servidor.entidades.Mensaje;
import org.springframework.data.repository.CrudRepository;

public interface MensajeRepositorio extends  CrudRepository<Mensaje, Long> {
}




