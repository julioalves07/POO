import java.time.LocalDate;

public class Pedido {
    private int numero;
    private String status;
    private LocalDate data;

    public Pedido(int numero, String status, LocalDate data) {
        this.numero = numero;
        this.status = status;
        this.data = data;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}