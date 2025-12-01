package com.projeto.Sentinela.repository;

import com.projeto.Sentinela.entity.EventoCritico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventoCriticoRepository extends JpaRepository<EventoCritico, Long> {
    List<EventoCritico> findByTipoEvento(long tipoEvento);
}
