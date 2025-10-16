public class Produto {
    String nome;
    double preco;
    int estoque = 0;
    String id;
    String descricao;

    public Produto(String id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getId(){
        return id;
    }

    void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            estoque += quantidade;
        }
    }
}