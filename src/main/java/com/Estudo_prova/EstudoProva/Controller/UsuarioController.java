package com.Estudo_prova.EstudoProva.Controller;


import com.Estudo_prova.EstudoProva.Model.UsuarioModel;
import com.Estudo_prova.EstudoProva.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @PostMapping
    public UsuarioModel adicionar(@RequestBody UsuarioModel usuarioModel){
        return service.adicionar(usuarioModel);
    }

    @GetMapping
    public List<UsuarioModel>Listar(){
        return service.Listar();
    }

    @GetMapping("/{id}")
    public Optional<UsuarioModel>BuscaPorId(@PathVariable Long id){
        return service.BuscaPorId(id);
    }

    @DeleteMapping("/{id}")
    public void Deletar(@PathVariable Long id){
        service.Deletar(id);
    }
}
