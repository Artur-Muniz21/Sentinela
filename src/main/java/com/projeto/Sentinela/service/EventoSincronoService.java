package com.projeto.Sentinela.service;


import com.projeto.Sentinela.entity.EventoSincrono;
import com.projeto.Sentinela.repository.EventoSincronoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EventoSincronoService {

    private final EventoSincronoRepository repository;

    public List<EventoSincrono> getAll() {
        return repository.findAll();
    }

    public EventoSincrono cadastrarEventoSincrono(EventoSincrono eventoSincrono) {
        return repository.save(eventoSincrono);
    }

}
