package com.curso.servidor.entidades;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TP_MENSAJE")

public class Mensaje implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String titulo;
    private String contenido;
    private String Contacto;
    private String respuesta;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String contacto) {
        Contacto = contacto;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}



