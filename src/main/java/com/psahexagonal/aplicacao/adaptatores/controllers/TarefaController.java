package com.psahexagonal.aplicacao.adaptatores.controllers;

import com.psahexagonal.dominio.dtos.TarefaDTO;
import com.psahexagonal.dominio.portas.interfaces.TarefaServicePort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tarefas")
public class TarefaController {

    private final TarefaServicePort tarefaServicePort;

    public TarefaController(TarefaServicePort tarefaServicePort) {
        this.tarefaServicePort = tarefaServicePort;
    }

    @PostMapping
    void criarProdutos(@RequestBody TarefaDTO tarefaDTO) {
        tarefaServicePort.criarTarefa(tarefaDTO);
    }

    @GetMapping
    List<TarefaDTO> getTarefas() {
        return tarefaServicePort.buscarTarefas();
    }
}
