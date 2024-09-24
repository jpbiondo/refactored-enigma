package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.envers.Audited;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Audited
@Data
public class Libro {
    private Date fecha;
    private String genero;
    private int paginas;
    private String titulo;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "libro_autor",
            joinColumns = @JoinColumn(name = "libro_id"),
            inverseJoinColumns = @JoinColumn(name = "autor_id")
    )
    private Set<Autor> autor = new HashSet<Autor>();

}
