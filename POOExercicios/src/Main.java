public class Main {
    public static void main(String[] args) {
        System.out.println("========");
        System.out.println("ADMINISTRADOR");
        System.out.println("========");
        Adminstrador adm = new Adminstrador("Mauro Santos", "Rua da Alegria, 250", 1155553333, "12345678900", 30);
        adm.gastosViagem();

        System.out.println(adm.toString());

        System.out.println("========");
        System.out.println("VENDEDOR");
        System.out.println("========");

        Vendedor vend1 = new Vendedor("Paloma Santos", "Rua Cabreuva, 500", 1152346897, "77788899911", 35, 25500.00);
        Vendedor vend2 = new Vendedor("Vinicius Fontes", "Rua Dez, 10", 1185856969, "23456789100", 20, 45000.00);
        Vendedor vend3 = new Vendedor("Carlos Silva", "Rua Quinze, 15", 1187874545, "78945612300", 30, 9000.00);

        System.out.println("==Comissão do Vendedor==");

        vend1.calculaComissao(25500.00);
        vend2.calculaComissao(45000.00);
        vend3.calculaComissao(9000.00);

        System.out.println("==Dados dos Vendedores==");
        System.out.println(vend1.toString());
        System.out.println(vend2.toString());
        System.out.println(vend3.toString());
    }
}
