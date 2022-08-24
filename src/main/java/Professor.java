public class Professor {

    private String nome;
    private String hda;
    private String periodo;

    public Professor(String nome, String hda, String periodo) {
        this.nome = nome;
        this.hda = hda;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHda() {
        return hda;
    }

    public void setHda(String hda) {
        this.hda = hda;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
