package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.io.Serializable;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Audited
public class Persona extends Base{

    private String nombre;

    private String apellido;

    private int dni;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;
}
