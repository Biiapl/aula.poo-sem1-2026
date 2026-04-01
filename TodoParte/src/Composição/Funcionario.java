package Composição;


public class Funcionario {
    private int id;
    private String nome, cpf, funcao;
    public Funcionario() {
    }

    public Funcionario(String funcao, String cpf, String nome, int id) {
        this.funcao = funcao;
        this.cpf = cpf;
        this.nome = nome;
        this.id = id;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", funcao='" + funcao + '\'' +
                '}';
    }
}
