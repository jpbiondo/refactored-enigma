package com.example.inicial1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Autor extends Base{

    private String nombre;

    private String apellido;

    @Column(length = 1500)
    private String biografia;
}
