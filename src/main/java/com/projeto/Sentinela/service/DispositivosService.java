package com.projeto.Sentinela.service;

import com.projeto.Sentinela.entity.Dispositivo;
import com.projeto.Sentinela.repository.DispositivoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DispositivosService {

    private final DispositivoRepository dispositivoRepository;

    public Dispositivo getDispositivosPorId(Long id) {
        return dispositivoRepository.findById(id).orElse(null);
    }

}
