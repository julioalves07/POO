import java.time.LocalDate;

public class SistemaPedidos {
    public static void main(String[] args) {
        Produto teclado = new Produto("Fortrek Teclado Gamer BLACK EAGLE", 79.10);
        Produto mousePad = new Produto("Mouse Pad Preto", 8.90);
        Produto mouse = new Produto("Mouse Dell sem fio - WM118", 69);

        ItemPedido[] itens = {
                new ItemPedido(teclado, 1),
                new ItemPedido(mousePad, 2),
                new ItemPedido(mouse, 2)
        };

        Pedido pedido = new Pedido(1, LocalDate.now(), "novo", itens);

        System.out.printf("Valor total do pedido: R$%.02f\n", pedido.calcularTotal());
    }
}