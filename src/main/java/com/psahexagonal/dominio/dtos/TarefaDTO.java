package com.psahexagonal.dominio.dtos;

public class TarefaDTO {
    private String descricao;

    public TarefaDTO(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
