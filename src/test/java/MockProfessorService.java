public class MockProfessorService implements ProfessorService {

    @Override
    public String busca(int id) {
        if(id == 10){
            return ProfessorConst.CHRIS;
        }
        return ProfessorConst.PADRAO;
    }
}
