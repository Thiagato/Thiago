package br.edu.up.controllers;

import br.edu.up.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public abstract class UsuarioController {
    private static List<Usuario> usuarios = List.of(
            new Usuario(UUID.fromString("d8324a88-18d6-446d-b909-b1d59e388fa9"), "João"),
            new Usuario(UUID.fromString("fa251ebf-e2c0-497c-8a12-960898ba98a4"), "Brito")
    );

    public  static List<Usuario> listar(){
        return usuarios;
    }

    public static Usuario buscarUsuarioPorUUID(UUID uuid){
       Optional<Usuario> usuario = usuarios.stream()
               .filter(u -> u.getUuid().equals(uuid))
               .findFirst();

       return usuario.isPresent() ? usuario.get() : null;


        }


    public static Usuario buscarUsuarioPorUUID(String nome){
        Optional<Usuario> usuario = usuarios.stream()
                .filter(u -> u.getUuid().equals(nome))
                .findFirst();

        return usuario.isPresent() ? usuario.get() : null;
    }
}




