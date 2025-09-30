public class SistemaPedidos {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.nome = "Camiseta";
        produto1.preco = 29.99;
        produto1.estoque = 100;

        produto2.nome = "Calça";
        produto2.preco = 49.99;
        produto2.estoque = 50;
        
        Cliente cliente = new Cliente();
        cliente.nome = "João Silva";
        cliente.email = "joaosilva@email.com";

        System.out.println(produto1.nome + " - Preço: R$" + produto1.preco + " - Estoque: " + produto1.estoque);
        System.out.println(cliente.nome + " - Email: " + cliente.email);
    }
}