package com.Estudo_prova.EstudoProva.Repository;

import com.Estudo_prova.EstudoProva.Model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel , Long> {
}
