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

        Professor padrao = buscaProfessor.buscaProfessor(7);

        assertEquals("Antonio", padrao.getNome());
        assertEquals("13:30", padrao.getHda());
        assertEquals("Integral", padrao.getPeriodo());

    }

    @Test
    public void testeBuscaProfessorSetters(){
        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);

        Professor auxiliar = buscaProfessor.buscaProfessor(4);

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

        Professor inexistente = buscaProfessor.buscaProfessor(88);

        assertEquals("None", inexistente.getNome());
        assertEquals("None", inexistente.getHda());
        assertEquals("None", inexistente.getPeriodo());
    }

    @Test
    public void testeChrisValoresInválidos(){
        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);

        Professor novo = buscaProfessor.buscaProfessor(10);

        novo.setNome("12:00");
        novo.setHda("A hora que ele quiser");
        novo.setPeriodo("Batata Frita");

        assertEquals("12:00", novo.getNome());
        assertEquals("A hora que ele quiser", novo.getHda());
        assertEquals("Batata Frita", novo.getPeriodo());

    }

    @Test
    public void testeFaltandoInfo(){
        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);

        Professor prof = buscaProfessor.buscaProfessor(11);

        assertEquals("Cláudio", prof.getNome());
        assertEquals("15:30", prof.getHda());
        assertEquals("None", prof.getPeriodo());

    }






}
