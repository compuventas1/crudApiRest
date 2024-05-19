package com.example.demo.controllers;

import com.example.demo.models.Persona;
import com.example.demo.services.PersonaInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/persona")
public class PersonaController {

    @Autowired
    private PersonaInterfaceService service;

    @GetMapping("/listar")
    public List<Persona> listar(){
        return service.listar();
    }

    @PostMapping("/registrar")
    public Persona registrar(@RequestBody Persona persona){
        return service.registrar(persona);
    }

    @PutMapping("/modificar")
    public Persona modificar(@RequestBody Persona persona) {
        return service.modificar(persona);
    }

    @GetMapping("/obtenerPorId/{id}")
    public Optional<Persona> obtenerPorId(@PathVariable("id") Integer id){
        return service.obtenerPorId(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        service.eliminar(id);
    }
}
