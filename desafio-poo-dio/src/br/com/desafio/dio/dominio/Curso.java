package br.com.desafio.dio.dominio;

import java.time.LocalDate;

public class Curso {
    protected String curso;
    protected String descricao;
    protected int cargaHoraria;


    public Curso(String curso, String descricao, int cargaHoraria) {
        this.curso = curso;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "curso='" + curso + '\'' +
                ", cargaHoraria='" + cargaHoraria + '\'' +
                '}';
    }

    public String getCurso() {
        return curso;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
