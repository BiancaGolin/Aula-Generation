public class Animal implements Acoes {
    public String nome;
    public int idade;
    public String somEmitido;
    public String locomocao;

    public Animal(String nome, int idade, String somEmitido, String locomocao) {
        this.nome = nome;
        this.idade = idade;
        this.somEmitido = somEmitido;
        this.locomocao = locomocao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSomEmitido() {
        return somEmitido;
    }

    public void setSomEmitido(String somEmitido) {
        this.somEmitido = somEmitido;
    }

    public String getLocomocao() {
        return locomocao;
    }

    public void setLocomocao(String locomocao) {
        this.locomocao = locomocao;
    }

    @Override
    public String som() {
        return null;
    }

    @Override
    public String locomover() {
        return null;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
