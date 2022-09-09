package com.psahexagonal.dominio.adaptadores.services;

import com.psahexagonal.dominio.Tarefa;
import com.psahexagonal.dominio.dtos.TarefaDTO;
import com.psahexagonal.dominio.portas.interfaces.TarefaServicePort;
import com.psahexagonal.dominio.portas.repositories.TarefaRepositoryPort;

import java.util.List;
import java.util.stream.Collectors;

public class TarefaServiceImp implements TarefaServicePort {

    private final TarefaRepositoryPort tarefaRepository;

    public TarefaServiceImp(TarefaRepositoryPort tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    @Override
    public void criarTarefa(TarefaDTO tarefaDTO) {
        Tarefa tarefa = new Tarefa(tarefaDTO);
        this.tarefaRepository.salvar(tarefa);
    }

    @Override
    public List<TarefaDTO> buscarTarefas() {
        List<Tarefa> tarefas = this.tarefaRepository.buscarTodos();
        List<TarefaDTO> tarefaDTOS = tarefas.stream().map(Tarefa::toTarefaDTO).collect(Collectors.toList());
        return tarefaDTOS;
    }
}
