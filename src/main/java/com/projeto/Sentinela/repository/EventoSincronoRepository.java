package com.projeto.Sentinela.repository;

import com.projeto.Sentinela.entity.EventoSincrono;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EventoSincronoRepository extends JpaRepository<EventoSincrono, Long> {

    List<EventoSincrono> findByEvento(Long id);

    @Query("SELECT AVG(e.valorEvento) FROM EventoSincrono e WHERE e.id = :id")
    Double mediaValorEvento(long id);
}