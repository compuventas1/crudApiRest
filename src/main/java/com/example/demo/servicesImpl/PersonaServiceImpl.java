package com.example.demo.servicesImpl;

import com.example.demo.models.Persona;
import com.example.demo.repository.PersonaRepository;
import com.example.demo.services.PersonaInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaInterfaceService {

    @Autowired
    private PersonaRepository repo;

    @Override
    public List<Persona> listar() {
        return repo.findAll();
    }

    @Override
    public Persona registrar(Persona persona) {
        return repo.save(persona);
    }

    @Override
    public Persona modificar(Persona persona) {
        return repo.save(persona);
    }

    @Override
    public Optional<Persona> obtenerPorId(Integer id) {
        return repo.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        repo.deleteById(id);
    }
}
