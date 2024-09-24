package com.example.inicial1.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

@Entity
@Audited
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Localidad extends Base {
    private String denominacion;
}
