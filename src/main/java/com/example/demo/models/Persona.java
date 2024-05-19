package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="persona")
@Data
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nombres")
    private String nombres;

    @Column(name="apellidoPaterno")
    private String apellidoPaterno;

    @Column(name="apellidoMaterno")
    private String apellidoMaterno;

    @Column(name="sexo")
    private String sexo;

}
