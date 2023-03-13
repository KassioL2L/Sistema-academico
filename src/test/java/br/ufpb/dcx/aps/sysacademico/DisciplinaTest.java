package br.ufpb.dcx.aps.sysacademico;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisciplinaTest {

    Disciplina disciplina;
    Curso curso;

    @BeforeEach
    void setup(){
        this.curso = new Curso("SILCC");
        this.disciplina = new Disciplina(curso,"123","APS");
    }


    @Test
    void testNome(){
        assertEquals("APS",disciplina.getNome());

    }

    @Test
    void testCodigo(){
        assertEquals("123",disciplina.getCodigo());
    }


    @Test
    void testTurma() {
        assertTrue(disciplina.getTurmas().isEmpty());
        Turma turma1 = disciplina.criarTurma();
        assertEquals(turma1,disciplina.getTurma(1));
        assertEquals(1,turma1.getCodigo());

        disciplina.criarTurma();
        assertEquals(2,disciplina.getTurmas().size());

    }

    @Test
    void testeCurso() {
        assertEquals(curso, disciplina.getCurso());
    }

    @Test
    void testMetodosProibidos(){
        assertThrows(NoSuchMethodException.class, () -> Disciplina.class.getMethod("setCodigo", String.class),
                "A classe Disciplina não deve ter o método `setCodigo`");
        assertThrows(NoSuchMethodException.class, () -> Disciplina.class.getMethod("setCurso", Curso.class),
                "A classe Disciplina não deve ter o método `setCurso`");

    }
}