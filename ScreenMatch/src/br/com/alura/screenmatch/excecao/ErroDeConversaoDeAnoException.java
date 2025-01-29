package br.com.alura.screenmatch.excecao;

import java.io.UncheckedIOException;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String msg;

    public ErroDeConversaoDeAnoException(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return this.msg;
    }
}
