package com.example.inicial1.controllers;

import com.example.inicial1.entities.Persona;
import com.example.inicial1.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl {
    private PersonaServiceImpl personaServiceImpl;
    public PersonaController(PersonaServiceImpl personaServiceImpl) {
        this.personaServiceImpl = personaServiceImpl;
    }

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(personaServiceImpl.findAll());
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("\"error\":\"Error, por favor intente más tarde.\"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(personaServiceImpl.findById(id));
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("\"error\":\"Error, por favor intente más tarde.\"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Persona persona) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(personaServiceImpl.save(persona));
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("\"error\":\"Error, por favor intente más tarde.\"}");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Persona persona) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(personaServiceImpl.update(id, persona));
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("\"error\":\"Error, por favor intente más tarde.\"}");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(personaServiceImpl.delete(id));
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("\"error\":\"Error, por favor intente más tarde.\"}");
        }
    }
}