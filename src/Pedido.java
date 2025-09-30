import java.time.LocalDate;

public class Pedido {
    private int numero;
    private LocalDate data;
    private String status;
    private ItemPedido[] itens;

    public Pedido(int numero, LocalDate data, String status, ItemPedido[] itens) {
        this.numero = numero;
        this.data = data;
        this.status = status;
        this.itens = itens;
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

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }

        return total;
    }
}