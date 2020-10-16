public class Preguica extends Animal {

    public Preguica(String nome, int idade, String somEmitido, String locomocao) {
        super(nome, idade, somEmitido, locomocao);
    }

    public String som () {
        return "*Som de preguiça*";
    }

    @Override
    public String locomover() {
        return "Subir em árvores";
    }

    @Override
    public String toString() {
        return "Preguica{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
