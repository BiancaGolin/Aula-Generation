public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Totó", 2, "Auau", "Correndo");
        Cavalo horse = new Cavalo("Bartolomeu", 5, "*Som de cavalo*", "Trotando");
        Preguica preguica = new Preguica("Janaina", 1, "*Som de preguiça*", "Subindo árvores");

        System.out.println(cachorro.som());
        System.out.println(cachorro.locomover());
        System.out.println(horse.som());
        System.out.println(horse.locomover());
        System.out.println(preguica.som());
        System.out.println(preguica.locomover());

        System.out.println(cachorro.toString());
        System.out.println(horse.toString());
        System.out.println(preguica.toString());
    }
}
