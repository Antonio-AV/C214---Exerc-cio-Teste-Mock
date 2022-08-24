import org.junit.Test;

import static org.junit.Assert.*;

public class TesteBuscaProfessor {

    //Testes com Sucesso
    @Test
    public void testeBuscaProfessorChris(){
        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);

        Professor chris = buscaProfessor.buscaProfessor(10);

        assertEquals("Chris", chris.getNome());
        assertEquals("17:30", chris.getHda());
        assertEquals("Noturno", chris.getPeriodo());

    }

    @Test
    public void testeBuscaProfessorPadrao(){
        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);

        Professor padrao = buscaProfessor.buscaProfessor(78);

        assertEquals("Antonio", padrao.getNome());
        assertEquals("13:30", padrao.getHda());
        assertEquals("Integral", padrao.getPeriodo());

    }

    @Test
    public void testeBuscaProfessorSetters(){
        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);

        Professor auxiliar = buscaProfessor.buscaProfessor(11);

        auxiliar.setNome("Pedro");
        auxiliar.setHda("10:00");
        auxiliar.setPeriodo("Noturno");


        assertEquals("Pedro", auxiliar.getNome());
        assertEquals("10:00", auxiliar.getHda());
        assertEquals("Noturno", auxiliar.getPeriodo());

    }


    //Testes com falha
    @Test
    public void testeBuscaProfessorInexistente(){
        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);

        Professor inexistente = buscaProfessor.buscaProfessor(7);

        assertEquals("Glauber", inexistente.getNome());
        assertEquals("00:00", inexistente.getHda());
        assertEquals("Dia e noite", inexistente.getPeriodo());
    }

    @Test
    public void testeMudandoProfessorExistente(){
        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);

        Professor novo = buscaProfessor.buscaProfessor(10);

        novo.setNome("Não é mais Chris");
        novo.setHda("A hora que ela quiser");
        novo.setPeriodo("Das 18:00 às 18:01");

        assertEquals("Chris", novo.getNome());
        assertEquals("17:30", novo.getHda());
        assertEquals("Noturno", novo.getPeriodo());

    }

    @Test
    public void testeProfsIguais(){
        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);

        Professor prof1 = buscaProfessor.buscaProfessor(99);
        Professor prof2 = buscaProfessor.buscaProfessor(10);

        assertSame(prof1, prof2);

    }






}
