package com.example.inicial1.services;

import com.example.inicial1.entities.Persona;
import com.example.inicial1.repositories.BaseRepository;
import com.example.inicial1.repositories.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService extends BaseServiceImpl {
    @Autowired
    private PersonaRepository personaRepository;


    public PersonaService(BaseRepository<Persona, Long> baseRepository){
        super(baseRepository);
    }

}
