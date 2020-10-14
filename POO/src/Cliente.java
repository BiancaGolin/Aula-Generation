import java.util.Scanner;

public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private String pagouConta;

    public Cliente(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public void fazerAniversario() {
        System.out.println("Parabéns pelo seu aniversário " + this.nome);
        this.idade++;
    }

    public void resumoPedido() {
        System.out.println("Prezado(a) " + this.nome + ", realizou o pagamento do último boleto? \n- Sim\n- Não");
        Scanner sc = new Scanner(System.in);
        pagouConta = sc.nextLine();
        if (pagouConta.equals("Sim")) {
            System.out.println("Pagamento realizado, não há pendências.");
        }
        if (pagouConta.equals("Não")) {
            System.out.println("Pagamento atrasado. Contatar o time de finanças.");
        }
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                '}';
    }
}
