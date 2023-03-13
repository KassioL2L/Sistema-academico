package br.ufpb.dcx.aps.sysacademico;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {


    private Curso curso;
    @BeforeEach
    void setUp() {

        curso = new Curso("SILCC");
    }

    @Test
    void testNome(){
        assertEquals("SILCC",curso.getNome());
    }


    @Test
    void cadastrarAluno() {
        assertTrue(curso.getAlunos().isEmpty());
        Aluno aluno1 = new Aluno("123","Joao");
        curso.cadastrarAluno(aluno1);
        assertEquals(aluno1,curso.getAluno(aluno1.getMatricula()));

        assertTrue(curso.isAlunoCadastrado(String.valueOf(aluno1)));

    }

    @Test
    void testCriarDisciplina(){
        assertTrue(curso.getDisciplinas().isEmpty(),
                "Um curso novo não tem disciplinas cadastradas.");

        Disciplina aps = curso.criarDisciplina("aps","Análise e Projeto de Software");
        assertEquals("aps",aps.getCodigo());
        assertEquals("Análise e Projeto de Software",aps.getNome());


    }

}