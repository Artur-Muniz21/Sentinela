package com.projeto.Sentinela.entity;

import com.projeto.Sentinela.enums.EventoEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventoSincrono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Column(name = "hora_evento")
    private LocalDateTime horaEvento;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "evento")
    private EventoEnum tipoEvento;

    @Column(name = "valor_evento")
    private Double valorEvento;

    @Column(name = "unidade")
    private String unidade;

    @ManyToOne()
    private Dispositivo dispositivo;
}