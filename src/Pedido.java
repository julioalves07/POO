import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private int numero;
    private LocalDate data;
    private String status;
    private List<ItemPedido> itens = new ArrayList<>();
    private Cliente cliente;

    public Pedido(int numero, Cliente cliente) {
        this.numero = numero;
        this.data = LocalDate.now();
        this.status = "novo";
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }

        return total;
    }

    public void adicionarItem(Produto produto, int quantidade){
        this.itens.add(new ItemPedido(produto, quantidade));
    }
}