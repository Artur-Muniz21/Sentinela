package com.projeto.Sentinela.entity;

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
public class EventoCritico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Column(name = "hora_evento")
    private LocalDateTime horaEvento;

    @Column(name = "evento")
    private Long tipoEvento;

    @Column(name = "valor_evento")
    private String valorEvento;

    @ManyToOne()
    private Dispositivo dispositivo;
}