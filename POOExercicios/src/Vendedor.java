import java.text.NumberFormat;

public class Vendedor extends Pessoa {
    private double valorDasVendas;
    private double comissao;

    public Vendedor(String nome, String endereco, int telefone, String cpf, int idade, double valorDasVendas) {
        super(nome, endereco, telefone, cpf, idade);
        this.valorDasVendas = valorDasVendas;
        this.comissao = comissao;
    }

    public void calculaComissao(double valorDasVendas) {

        if (valorDasVendas < 10000) {
            System.out.println("Prezado(a) " + getNome() + ", suas vendas foram abaixo de R$10.000,00, por esse motivo, não haverá comissão sobre as vendas.");
        }
        if (valorDasVendas <= 20000 && valorDasVendas >= 10000) {
            comissao = valorDasVendas * 0.15;
            System.out.println("Prezado(a) " + getNome() + ", sua comissão será de " + NumberFormat.getCurrencyInstance().format(comissao));
        }
        if (valorDasVendas >20000 && valorDasVendas <= 70000) {
            comissao = valorDasVendas * 0.25;
            System.out.println("Prezado(a) " + getNome() + ", sua comissão será de " + NumberFormat.getCurrencyInstance().format(comissao));
        }
        if (valorDasVendas >70000) {
            comissao = valorDasVendas * 0.4;
            System.out.println("Prezado(a) " + getNome() + ", sua comissão será de " + NumberFormat.getCurrencyInstance().format(comissao));
        }
    }

    public double getValorDasVendas() {
        return valorDasVendas;
    }

    public void setValorDasVendas(double valorDasVendas) {
        this.valorDasVendas = valorDasVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }


    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + getNome() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", telefone=" + getTelefone() +
                ", cpf='" + getCpf() + '\'' +
                ", idade=" + getIdade() +
                "valorDasVendas=" + valorDasVendas +
                ", comissao=" + comissao +
                '}';
    }
}
