package com.psahexagonal.infraestrutura.adaptadores.entidades;

import com.psahexagonal.dominio.Tarefa;

import javax.persistence.*;

@Entity
@Table(name = "tarefas")
public class TarefaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String descricao;

    public TarefaEntity() {
    }

    public TarefaEntity(Tarefa tarefa) {
        this.descricao = tarefa.getDescricao();
    }

    public Tarefa toTarefa() {
        return new Tarefa(this.descricao);
    }
}
