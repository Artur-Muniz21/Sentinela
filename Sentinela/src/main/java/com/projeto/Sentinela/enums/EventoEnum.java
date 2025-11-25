package com.projeto.Sentinela.enums;

import lombok.Getter;

@Getter
public enum EventoEnum {

    REDE(0),
    ENERGIA(1),
    TEMPERATURA(2),
    UMIDADE(3);

    private final int valor;

    EventoEnum(int valor) {
        this.valor = valor;
    }


    public static EventoEnum fromValor(int valor) {
        for (EventoEnum tipo : EventoEnum.values()) {
            if (tipo.getValor() == valor) {
                return tipo;
            }
        }

        return null;
    }
}