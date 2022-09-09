package com.psahexagonal.dominio;

import com.psahexagonal.dominio.dtos.TarefaDTO;

public class Tarefa {

    private String descricao;

    public Tarefa() {
    }

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Tarefa(TarefaDTO TarefaDTO) {
        this.descricao = TarefaDTO.getDescricao();
    }

    public TarefaDTO toTarefaDTO() {
        return new TarefaDTO(this.descricao);
    }
}
