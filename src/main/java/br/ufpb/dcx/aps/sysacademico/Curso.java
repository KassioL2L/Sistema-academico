package br.ufpb.dcx.aps.sysacademico;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;

    public Curso(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public boolean isAlunoCadastrado(String matricula) {
        return getAluno(matricula) != null;
    }

    public Aluno getAluno(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }

    public Disciplina criarDisciplina(String codigo, String nome) {
        Disciplina disciplina = new Disciplina(this, codigo, nome);
        disciplinas.add(disciplina);
        return disciplina;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
