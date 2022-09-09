package com.psahexagonal.dominio.portas.repositories;

import com.psahexagonal.dominio.Tarefa;

import java.util.List;

public interface TarefaRepositoryPort {
    List<Tarefa> buscarTodos();

    Tarefa buscarPelaDescricao(String descricao);

    void salvar(Tarefa tarefa);
}
