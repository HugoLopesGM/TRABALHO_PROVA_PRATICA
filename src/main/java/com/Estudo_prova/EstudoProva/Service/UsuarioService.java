package com.Estudo_prova.EstudoProva.Service;

import com.Estudo_prova.EstudoProva.Model.UsuarioModel;
import com.Estudo_prova.EstudoProva.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public UsuarioModel adicionar(UsuarioModel usuarioModel){
        return repository.save(usuarioModel);
    }

    public List<UsuarioModel>Listar(){
        return repository.findAll();
    }

    public Optional<UsuarioModel>BuscaPorId(Long id){
        return repository.findById(id);
    }

    public void Deletar(Long id){
        repository.deleteById(id);
    }
}
