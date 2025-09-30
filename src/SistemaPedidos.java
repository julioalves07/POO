public class SistemaPedidos {
    public static void main(String[] args) {
        Cliente cliente = new ClientePF("Julio", "julio@email.com", "123.456.789-09");

        Produto mousePad = new Produto("Mouse Pad Preto", 10);
        Produto mouse = new Produto("Mouse Dell sem fio - WM118", 70);
        Produto teclado = new Produto("Fortrek Teclado Gamer BLACK EAGLE", 80);

        Pedido pedido1 = new Pedido(1,cliente);
        pedido1.adicionarItem(mousePad, 1);
        pedido1.adicionarItem(mouse, 2);
        pedido1.setMetodoPagamento(new PagamentoCartaoCredito());
        pedido1.finalizar();

        Pedido pedido2 = new Pedido(2, cliente);
        pedido2.adicionarItem(mousePad, 5);
        pedido2.adicionarItem(mouse, 3);
        pedido2.adicionarItem(teclado, 3);
        pedido2.setMetodoPagamento(new PagamentoCartaoCredito());
        pedido2.finalizar();

        Pedido pedido3 = new Pedido(3, cliente);
        pedido3.adicionarItem(teclado, 10);
        pedido3.setMetodoPagamento(new PagamentoBoleto());
        pedido3.finalizar();

        Pedido pedido4 = new Pedido(4, cliente);
        pedido4.adicionarItem(mouse, 10);
        pedido4.adicionarItem(teclado, 10);
        pedido4.setMetodoPagamento(new PagamentoBoleto());
        pedido4.finalizar();
    }
}