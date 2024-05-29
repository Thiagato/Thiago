package br.edu.up.views;

import br.edu.up.controllers.UsuarioController;

public class UsuarioView {

    public static void exibirDadosUsuarios(){
        var usuarios = UsuarioController.listar();
        System.out.println("################   LISTA DE USUARIO #####################");
        usuarios.forEach(usuario ->{
            System.out.println("UUID: " + usuario.getUuid());
            System.out.println("NOME: " + usuario.getNome());
            System.out.println("-------------------------------");
        });
        System.out.println("#####################################");
    }

}
