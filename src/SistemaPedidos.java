public class SistemaPedidos {
    public static void main(String[] args) {
        Produto teclado = new Produto("Fortrek Teclado Gamer BLACK EAGLE", 79.10);
        Produto mousePad = new Produto("Mouse Pad Preto", 8.90);
        Produto mouse = new Produto("Mouse Dell sem fio - WM118", 69);
        
        ClientePF cliente1 = new ClientePF("Joao Silva", "joaosilva@email.com", "123.456.789-09");
    
        Pedido pedido1 = new Pedido(1, cliente1);
        pedido1.adicionarItem(teclado, 1);
        pedido1.adicionarItem(mousePad, 2);
        pedido1.adicionarItem(mouse, 2);

        System.out.println("Cliente: " + pedido1.getCliente().getNome());
        System.out.printf("Valor total do pedido 1: R$%.02f\n", pedido1.calcularTotal());


        ClientePJ cliente2 = new ClientePJ("Joao Silva SA", "joaosilva@silvasa.com.br", "12.345.678/0001-95");
    
        Pedido pedido2 = new Pedido(2, cliente2);
        pedido2.adicionarItem(teclado, 2);
        pedido2.adicionarItem(mousePad,1);
        pedido2.adicionarItem(mouse, 1);

        System.out.println("Cliente: " + pedido2.getCliente().getNome());
        System.out.printf("Valor total do pedido 2: R$%.02f\n", pedido2.calcularTotal());
    }
}