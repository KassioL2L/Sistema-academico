package br.ufpb.dcx.aps.sysacademico;

import java.util.Objects;

public class Professor {
    private String siape;
    private String nome;

    public Professor(String siape, String nome) {
        this.siape = siape;
        this.nome = nome;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Professor professor = (Professor) obj;
        return siape.equals(professor.siape) && nome.equals(professor.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siape, nome);
    }
}
