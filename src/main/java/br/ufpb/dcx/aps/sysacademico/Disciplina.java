package br.ufpb.dcx.aps.sysacademico;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private Curso curso;
    private String codigo;
    private String nome;
    private List<Turma> turmas;

    public Disciplina(Curso curso, String codigo, String nome) {
        this.curso = curso;
        this.codigo = codigo;
        this.nome = nome;
        this.turmas = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public Turma criarTurma() {
        Turma turma = new Turma(turmas.size() + 1, this);
        turmas.add(turma);
        return turma;
    }

    public Turma getTurma(int codigo) {
        for (Turma turma : turmas) {
            if (turma.getCodigo() == codigo) {
                return turma;
            }
        }
        return null;
    }
}