import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String endereco;
    private int telefone;
    private String cpf;
    private int idade;

    public Pessoa(String nome, String endereco, int telefone, String cpf, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public int getTelefone() {
        return telefone;
    }


    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void validarCpf()
    {
        if(getCpf().length()!=11)
        {
            System.out.println("--CPF inválido!!!");
        }
        else
        {
            System.out.println("--CPF válido!!!");
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone=" + telefone +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                '}';
    }
}
