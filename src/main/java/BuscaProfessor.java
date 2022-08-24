import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaProfessor {

    ProfessorService professorService;

    public BuscaProfessor (ProfessorService professorService){
        this.professorService = professorService;
    }

    public Professor buscaProfessor(int id){

        String professorJson = professorService.busca(id);
        JsonObject jsonObject = JsonParser.parseString(professorJson).getAsJsonObject();
        return new Professor(jsonObject.get("nome").getAsString(),
                jsonObject.get("hda").getAsString(),
                jsonObject.get("periodo").getAsString());

    }

}
