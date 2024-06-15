package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo{
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private LocalDateTime data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data.format(fmt) +
                '}';
    }
}
