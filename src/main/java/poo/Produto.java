package poo;

public class Produto {
    String id;
    String nome;
    double preco;
    String descricao;
    int estoque;

    public Produto(String id, String nome, double preco, String descricao, int estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.estoque = estoque;
    }
    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            estoque += quantidade;
        }
    }
}