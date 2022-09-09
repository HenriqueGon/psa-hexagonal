package com.psahexagonal.dominio.portas.interfaces;

import com.psahexagonal.dominio.dtos.TarefaDTO;

import java.util.List;

public interface TarefaServicePort {

    List<TarefaDTO> buscarTarefas();

    void criarTarefa(TarefaDTO tarefaDTO);
}
