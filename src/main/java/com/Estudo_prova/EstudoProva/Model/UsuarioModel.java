package com.Estudo_prova.EstudoProva.Model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;

    @Enumerated(EnumType.STRING)
    private UserRole role;
}
