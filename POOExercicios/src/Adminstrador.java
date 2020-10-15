import java.text.NumberFormat;
import java.util.Scanner;

public class Adminstrador extends Pessoa {
    private double ajudaDeCusto;

    Scanner sc = new Scanner(System.in);

    public Adminstrador(String nome, String endereco, int telefone, String cpf, int idade) {
        super(nome, endereco, telefone, cpf, idade);
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public void gastosViagem() {
        float passagem, hotel, refeicao;
        System.out.println("==GASTOS==");
        System.out.println("Por favor, insira os custos referente: \n* Passagem: \n* Hotel: \n* Refeição: ");
        passagem=sc.nextFloat();
        hotel=sc.nextFloat();
        refeicao=sc.nextFloat();
        double total = passagem + hotel + refeicao;
        System.out.println("O reembolso é de 70% do valor total gasto, logo...");
        System.out.println("Valor total: " + NumberFormat.getCurrencyInstance().format(total));
        System.out.println("Valor de reembolso: " + NumberFormat.getCurrencyInstance().format(total*0.70));
    }


    @Override
    public String toString() {
        return "Adminstrador{" +
                "nome='" + getNome() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", telefone=" + getTelefone() +
                ", cpf='" + getCpf() + '\'' +
                ", idade=" + getIdade() +
                "ajudaDeCusto=" + ajudaDeCusto +
                '}';
    }
}
