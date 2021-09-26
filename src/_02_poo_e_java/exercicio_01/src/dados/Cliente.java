package dados;

public class Cliente {
    private String nome;
    private String sobrenome;

    public Cliente() {
        this.setNome("");
        this.setSobrenome("");
    }

    public Cliente (String nome, String sobrenome)  {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getSobrenome() {

        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {

        this.sobrenome = sobrenome;
    }
}
