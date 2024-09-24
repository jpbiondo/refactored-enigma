package com.example.inicial1.services;

import com.example.inicial1.entities.Persona;
import com.example.inicial1.repositories.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService extends BaseServiceImpl {
    //@Autowired tambien permite la inyeccion de dependencia
    private PersonaRepository personaRepository;


    public PersonaService(PersonaRepository personaRepository){
        super(personaRepository);
    }

}
