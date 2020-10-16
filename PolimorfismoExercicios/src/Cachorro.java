public class Cachorro extends Animal {

    public Cachorro(String nome, int idade, String somEmitido, String locomocao) {
        super(nome, idade, somEmitido, locomocao);
    }

    public String som () {
        return "Auau";
    }

    @Override
    public String locomover() {
        return "Correndo";
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
