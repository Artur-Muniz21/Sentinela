package com.projeto.Sentinela.resource;

import com.projeto.Sentinela.entity.Dispositivo;
import com.projeto.Sentinela.service.DispositivosService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dispositivo")
public class DispositivoResource {

    private final DispositivosService service;

    @GetMapping("/{id}")
    public Dispositivo getDispositivoPorId(@PathVariable Long id) {
        return service.getDispositivosPorId(id);
    }
}
