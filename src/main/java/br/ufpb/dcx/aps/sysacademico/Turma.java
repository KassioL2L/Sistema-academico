package br.ufpb.dcx.aps.sysacademico;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private int codigo;
    private List<Aluno> alunos = new ArrayList<>();
    private Professor professor;
    private Disciplina disciplina;

    public Turma(int codigo, Disciplina disciplina) {
        this.codigo = codigo;
        this.disciplina = disciplina;
    }

    public int getCodigo() {
        return codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public Aluno matricularAluno(Aluno aluno) {
        if (alunos.contains(aluno)) {
            return null;
        }

        alunos.add(aluno);
        return aluno;
    }
}

