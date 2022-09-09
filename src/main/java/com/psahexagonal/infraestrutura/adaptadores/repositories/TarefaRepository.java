package com.psahexagonal.infraestrutura.adaptadores.repositories;

import com.psahexagonal.dominio.Tarefa;
import com.psahexagonal.dominio.portas.repositories.TarefaRepositoryPort;
import com.psahexagonal.infraestrutura.adaptadores.entidades.TarefaEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class TarefaRepository implements TarefaRepositoryPort {

	private final SpringTarefaRepository springTarefaRepository;

	public TarefaRepository(SpringTarefaRepository springTarefaRepository) {
			this.springTarefaRepository = springTarefaRepository;
	}

	@Override
	public List<Tarefa> buscarTodos() {
			List<TarefaEntity> TarefaEntities = this.springTarefaRepository.findAll();
			return TarefaEntities.stream().map(TarefaEntity::toTarefa).collect(Collectors.toList());
	}

	@Override
	public Tarefa buscarPelaDescricao(String descricao) {
			Optional<TarefaEntity> TarefaEntity = this.springTarefaRepository.findByDescricao(descricao);

			if (TarefaEntity.isPresent())
					return TarefaEntity.get().toTarefa();

			throw new RuntimeException("Tarefa não existe");
	}

	@Override
	public void salvar(Tarefa tarefa) {
			TarefaEntity tarefaEntity = new TarefaEntity(tarefa);
			
			this.springTarefaRepository.save(tarefaEntity);
	}
}
