package br.edu.up.views;

import br.edu.up.controllers.TarefaController;
import br.edu.up.controllers.UsuarioController;
import br.edu.up.models.Tarefa;
import br.edu.up.utils.Util;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.util.UUID;

public class ToDoView {
    private static final Logger logger = LogManager.getLogger();
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
            exibirView(sc,op);
        } while (op != 0);
    }

        private static void exibirView(Scanner sc,int op){
            switch (op) {
                case 0:
                    System.out.println("falou");
                    break;
                case 1:
                    ToDoView.iniciar(sc);
                    break;
                case 99:
                    System.out.println("ta de sacanagem né ");
                    break;
                default:
                    System.out.println("n sabe ler?");
                    break;
            }
        }
        private static void cadastrar (Scanner sc) {
        try {


            System.out.println("Digite o titulo");
            var titulo = sc.nextLine();

            System.out.println("Digite o descricao");
            var descricao = sc.nextLine();

            System.out.println("Digite o prioridade");
            var prioridade = sc.nextLine();

            UsuarioView.exibirDadosUsuarios();
            System.out.println("escolha o usuario por UUID :");
            var uuid = sc.nextLine();


            var usuario = UsuarioController.buscarUsuarioPorUUID(UUID.fromString(uuid));


            var tarefa  = new Tarefa(titulo, descricao, prioridade, usuario);

            TarefaController.cadastrar(tarefa);
        }catch (Exception ex){
            logger.error("deu ruim", ex);
        }

        }
        private static void atualizar () {

        }
        private static void remover () {

        }
        private static void listar () {

        }
    }

