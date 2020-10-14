import java.util.Scanner;

public class Aviao {
    private int quantidadePassageiros;
    private String companhia;
    private String destino;
    private String origem;
    private int modelo;

    public Aviao(String companhia, String destino, String origem) {
        this.companhia = companhia;
        this.destino = destino;
        this.origem = origem;
    }

    Scanner sc = new Scanner(System.in);

    public void assentos() {

        System.out.println("Escolha o modelo da aeronave para verificar a quantidade de assentos: 1-A320\n2-Boeing 737\n3-ATR");
        modelo = sc.nextInt();

        switch(modelo) {
            case 1:
                System.out.println("Seja bem vindo(a) ao avião A320. Capacidade 156 passageiros.");
                break;
            case 2:
                System.out.println("Seja bem vindo(a) ao avião Boeing 737. Capacidade 95 passageiros.");
                break;
            case 3:
                System.out.println("Seja bem vindo(a) ao avião ATR. Capacidade 72 passageiros.");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    public void roteiro() {
        String vet[] = {"9:25h", "14:30h", "22:40h"};
        String cia[] = {"American Airlines", "Azul", "Gol", "Latam"};
        int hora;

        System.out.print("Cidade de origem: ");
        origem = sc.next();
        System.out.print("\nCidade de destino: ");
        destino = sc.next();

        //System.out.println("Horários disponíveis: ");
        for (int i=0; i< vet.length; i++) {
            System.out.println((i+1) + " - " + vet[i]);
        }
        hora = sc.nextInt();
        System.out.println("Companhias disponíveis: ");
        for (int i=0; i< cia.length; i++) {
            System.out.println((i+1) + " - " + cia[i]);
        }
        companhia = sc.next();

        System.out.println("=============");
        System.out.println("ROTEIRO");
        System.out.println("=============");
        System.out.println("Prezado(a) passageiro, obrigada por escolher a " + cia[Integer.parseInt(companhia)-1]);
        System.out.println("Seu voo sai de: " + origem + "\nDestino: " + destino + "\nHorário de embarque: " + vet[hora-1] + "\nPor favor chegar com 2h de antecedência. Obrigada!");
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }


    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "quantidadePassageiros=" + quantidadePassageiros +
                ", companhia='" + companhia + '\'' +
                ", destino='" + destino + '\'' +
                ", origem='" + origem + '\'' +
                ", modelo=" + modelo +
                '}';
    }
}
