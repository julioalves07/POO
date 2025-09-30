public class SistemaPedidos {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 29.99);
        Produto produto2 = new Produto("Calça", 49.99);
        
        produto1.adicionarEstoque(100);
        produto2.adicionarEstoque(50);
        
        Cliente cliente = new Cliente("João Silva", "joaosilva@email.com");

        System.out.println(produto1.getNome() + " - Preço: R$" + produto1.getPreco() + " - Estoque: " + produto1.getEstoque());
        System.out.println(cliente.getNome() + " - Email: " + cliente.getEmail());
    }
}