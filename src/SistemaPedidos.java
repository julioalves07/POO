public class SistemaPedidos {
    public static void main(String[] args){
        Cliente clientePf = new ClientePF("Julio", "julio@email.com", "123.456.789-09");
        Cliente clientePj = new ClientePJ("Tech SA", "julio@tech.com", "00.000.000/0001-91");

        Produto mousePad = new Produto("1", "Mouse Pad Preto", 10);
        Produto mouse = new Produto("2", "Mouse Dell sem fio - WM118", 70);
        Produto teclado = new Produto("3", "Fortrek Teclado Gamer BLACK EAGLE", 80);

        Pedido pedido1 = new Pedido(clientePf);
        pedido1.adicionarItem(mousePad, 1);
        pedido1.adicionarItem(mouse, 2);
        pedido1.setMetodoPagamento(new PagamentoCartaoCredito());
        pedido1.confirmarPedido();
        System.out.println(pedido1.getStatus());

        Pedido pedido2 = new Pedido(clientePj);
        pedido2.adicionarItem(mousePad, 5);
        pedido2.adicionarItem(mouse, 3);
        pedido2.adicionarItem(teclado, 300);
        pedido2.setMetodoPagamento(new PagamentoCartaoCredito());
        pedido2.confirmarPedido();
        System.out.println(pedido2.getStatus());

        Pedido pedido3 = new Pedido(clientePf);
        pedido3.adicionarItem(teclado, 10);
        pedido3.setMetodoPagamento(new PagamentoBoleto());
        pedido3.confirmarPedido();
        System.out.println(pedido3.getStatus());

        Pedido pedido4 = new Pedido(clientePj);
        pedido4.adicionarItem(mouse, 100);
        pedido4.adicionarItem(teclado, 10);
        pedido4.setMetodoPagamento(new PagamentoBoleto());
        pedido4.confirmarPedido();
        System.out.println(pedido4.getStatus());
    }
}