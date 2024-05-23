package br.edu.up;

import br.edu.up.utils.Util;

import java.util.Scanner;

public class ToDoView {
    public static void iniciar(Scanner sc) {
        int op;

        do {
            System.out.println("################");
            System.out.println("##   TO DO LIST   ##");
            System.out.println("################");
            System.out.println("0- sair");
            System.out.println("1- cadastrar");
            System.out.println("2- alterar");
            System.out.println("3- remover");
            System.out.println("4- listar");

            op = Util.lerOpcaoMenu(sc);
        } while (op != 0);

    }
}
