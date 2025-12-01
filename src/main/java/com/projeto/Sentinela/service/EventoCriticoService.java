package com.projeto.Sentinela.service;

import com.projeto.Sentinela.entity.EventoCritico;
import com.projeto.Sentinela.repository.EventoCriticoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EventoCriticoService {

    private EventoCriticoRepository repository;

    public List<EventoCritico> getAll() {
        return repository.findAll();
    }

    public EventoCritico cadastrarEventoCritico(EventoCritico eventoCritico) {
        return repository.save(eventoCritico);
    }

    public List<EventoCritico> listarEventosEspecificos(long id) {
        return repository.findByTipoEvento(id);
    }
}