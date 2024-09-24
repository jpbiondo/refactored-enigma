package com.example.inicial1.services;

import com.example.inicial1.entities.Persona;
import com.example.inicial1.repositories.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements BaseService<Persona, Long> {
    //@Autowired tambien permite la inyeccion de dependencia
    private PersonaRepository personaRepository;


    public PersonaService(PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }

    @Override
    @Transactional
    public List<Persona> findAll() throws Exception {
        try{
            return personaRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona findById(Long id) throws Exception {
        try{
            Optional<Persona> personaOptional = personaRepository.findById(id);
            return personaOptional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona save(Persona entity) throws Exception {
        try{
            return personaRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona update(Long id, Persona entity) throws Exception {
        try {
            Optional<Persona> personaOptional = personaRepository.findById(id);
            Persona persona = personaOptional.get();
            return personaRepository.save(entity);
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            if(personaRepository.existsById(id)) {
                personaRepository.deleteById(id);
                return true;
            }

            throw new Exception();

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }
}
