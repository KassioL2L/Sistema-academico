package br.ufpb.dcx.aps.sysacademico;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {


    Aluno aluno;
    @BeforeEach
    void setUp() {
        aluno = new Aluno();
    }

    @Test
    void testMatricula() {
        assertNull(aluno.getMatricula());
        aluno.setMatricula("877733");
        assertEquals("877733",aluno.getMatricula());


    }

    @Test
    void testNome() {
        assertEquals("",aluno.getNome(),"O nome deve ser inicializado com String vazio");
        aluno.setNome("Joao");
        assertEquals("Joao",aluno.getNome());
    }

    @Test
    void testEquals(){
        assertEquals(new Aluno("123","Joao"), new Aluno("123","Joao dois"),
                "Dois alunos são iguais se suas matriculas são iguais, mesmo com nomes diferentes");
    }

}