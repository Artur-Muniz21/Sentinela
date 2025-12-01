package com.projeto.Sentinela.resource;

import com.projeto.Sentinela.entity.EventoSincrono;
import com.projeto.Sentinela.service.EventoSincronoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sincrono")
public class EventoSincronoResource {

    private final EventoSincronoService service;

    @GetMapping
    public List<EventoSincrono> getAll() {
        return service.getAll();
    }

    @GetMapping("/especificos/{evento}")
    public List<EventoSincrono> getEspecifico(@PathVariable Long evento) {
        return service.listarEventosEspecificos(evento);
    }

    @GetMapping("/media/{evento}")
    public Double getMedia(@PathVariable Long evento ) {
        return service.mediaEventosEspecificos(evento);
    }

    @PostMapping
    public EventoSincrono cadastrarEvento(@RequestBody EventoSincrono eventoSincrono) {
        return service.cadastrarEventoSincrono(eventoSincrono);
    }
}
