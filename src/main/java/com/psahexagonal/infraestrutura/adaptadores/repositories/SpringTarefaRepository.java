package com.psahexagonal.infraestrutura.adaptadores.repositories;

import com.psahexagonal.infraestrutura.adaptadores.entidades.TarefaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SpringTarefaRepository extends JpaRepository<TarefaEntity, String> {
    Optional<TarefaEntity> findByDescricao(String descricao);
}
