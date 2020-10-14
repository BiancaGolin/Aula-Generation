public class Main {
    public static void main(String[] args) {
        System.out.println("==EXERCICIO 1==");
        Cliente cliente1 = new Cliente("Ana Lucia","999.999.999-00", 25);
        Cliente cliente2 = new Cliente("Roberto da Silva","123.456.789-00", 40);
        cliente1.resumoPedido();
        cliente2.resumoPedido();
        cliente1.fazerAniversario();
        cliente2.fazerAniversario();
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());

        System.out.println("==EXERCICIO 2==");
        Aviao av = new Aviao("Azul","Lisboa","São Paulo");
        av.assentos();
        av.roteiro();

        System.out.println(av.toString());
    }
}
