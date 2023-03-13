package br.ufpb.dcx.aps.sysacademico;

public class Aluno {
    private String matricula;
    private String nome;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Aluno() {
        this.matricula = null;
        this.nome = "";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Aluno) {
            Aluno aluno = (Aluno) obj;
            return matricula.equals(aluno.getMatricula());
        }
        return false;
    }

}
