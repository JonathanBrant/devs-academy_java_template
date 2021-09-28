public class Cliente {
    private int id;
    private String  nome;
    private String sobrenome;
    private String RG;
    private String CPF;

    public Cliente(int id, String nome, String sobrenome, String rg, String cpf) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.RG = rg;
        this.CPF = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }


}
