package br.ufpb.dcx.aps.sysacademico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void testSiape() {
        Professor professor = new Professor("123","João");
        assertEquals("123",professor.getSiape());

    }

    @Test
    void testNome() {
        Professor professor = new Professor("123","João");
        assertEquals("João",professor.getNome());
    }

    @Test
    void testEquals(){
        Professor prof1 = new Professor("123","Joao A");
        Professor prof2 = new Professor("123", "Joao B");

        assertEquals(prof1,prof2,"Dois professores são iguais quando têm o mesmo siape, mesmo que tenham nomes diferentes.");
    }
}