package com.example.demo.services;

import com.example.demo.models.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaInterfaceService {

    public List<Persona> listar();
    public Persona registrar(Persona persona);
    public Persona modificar(Persona persona);
    public Optional<Persona> obtenerPorId(Integer id);
    public void eliminar(Integer id);
}
