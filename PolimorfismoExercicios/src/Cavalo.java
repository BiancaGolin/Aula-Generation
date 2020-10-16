public class Cavalo extends Animal {

    public Cavalo(String nome, int idade, String somEmitido, String locomocao) {
        super(nome, idade, somEmitido, locomocao);
    }

    public String som () {
        return "*Som de cavalo relinchando*";
    }

    @Override
    public String locomover() {
        return "Trotando";
    }

    @Override
    public String toString() {
        return "Cavalo{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
