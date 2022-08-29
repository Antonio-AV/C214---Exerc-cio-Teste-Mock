public class MockProfessorService implements ProfessorService {

    @Override
    public String busca(int id) {
        if(id == 10){
            return ProfessorConst.CHRIS;
        }
        else if(id == 11){
            return ProfessorConst.INCOMPLETO;
        }
        else if(id < 10){
            return ProfessorConst.PADRAO;
        }
        else {
            return ProfessorConst.INEXISTENTE;
        }
    }
}
