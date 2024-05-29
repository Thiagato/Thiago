package br.edu.up.controllers;

import br.edu.up.daos.TarefaDao;
import br.edu.up.models.Tarefa;

public abstract class TarefaController {

    public static void cadastrar(Tarefa tarefa) {
        TarefaDao.salvar(tarefa);
    }

}
