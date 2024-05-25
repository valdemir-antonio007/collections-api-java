package map.ordenacao;

import java.time.LocalDate;
import java.util.Objects;

public class Evento implements Comparable<Evento> {

    private String nomeEvento;
    private LocalDate data;
    private String nomeAtracao;

    public Evento(String nomeEvento, String nomeAtracao, String data) {
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
        this.data = FormataData.formataData(data);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Evento evento = (Evento) o;
        return Objects.equals(nomeEvento, evento.nomeEvento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeEvento);
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nomeEvento='" + nomeEvento + '\'' +
                ", data=" + data +
                ", nomeAtracao='" + nomeAtracao + '\'' +
                '}';
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }

    public void setNomeAtracao(String nomeAtracao) {
        this.nomeAtracao = nomeAtracao;
    }

    @Override
    public int compareTo(Evento o) {
        return this.getData().compareTo(o.getData());
    }


}
