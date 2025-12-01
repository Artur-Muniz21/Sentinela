package com.projeto.Sentinela.resource;

import com.projeto.Sentinela.entity.EventoCritico;
import com.projeto.Sentinela.service.EventoCriticoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/critico")
public class EventoCriticoResource {

    private final EventoCriticoService service;

    @GetMapping
    public List<EventoCritico> getAll() {
        return service.getAll();
    }

    @GetMapping("/especificos/{evento}")
    public List<EventoCritico> getEspecificos(@PathVariable Long evento) {
        return service.listarEventosEspecificos(evento);
    }

    @PostMapping
    public EventoCritico cadastrarEvento(@RequestBody EventoCritico eventoCritico) {
        return service.cadastrarEventoCritico(eventoCritico);
    }
}
