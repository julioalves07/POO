package poo;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private StatusPedido statusPedido;
    private LocalDate data;
    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<>();
    private IPagamento metodoPagamento;

    public Pedido(Cliente cliente){
        this.data = LocalDate.now();
        this.cliente = cliente;
        this.statusPedido = StatusPedido.PENDENTE;
    }

    public LocalDate getData(){
        return data;
    }

    public void setData(LocalDate data){
        this.data = data;
    }

    public StatusPedido getStatus(){
        return statusPedido;
    }

    public void setStatus(StatusPedido statusPedido){
        this.statusPedido = statusPedido;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public IPagamento getMetodoPagamento(){
        return metodoPagamento;
    }

    public void setMetodoPagamento(IPagamento metodoPagamento){
        this.metodoPagamento = metodoPagamento;
    }

    public List<ItemPedido> getItens(){
        return itens;
    }

    public void adicionarItem(Produto produto, int quantidade){
        for(ItemPedido item : getItens()){
            if(item.getProduto().getId().equals(produto.getId())){
                item.setQuantidade(item.getQuantidade() + quantidade);
                return;
            }
        }

        getItens().add(new ItemPedido(produto, quantidade));
    }

    public void removerItem(ItemPedido item){
        getItens().remove(item);
    }

    public double calcularTotal(){
        double total = 0;

        for(ItemPedido item : getItens()){
            total += item.getSubtotal();
        }

        return total;
    }

    public void aplicarDesconto(double desconto){
        getItens().forEach(item -> item.setPrecoUnitario(item.getPrecoUnitario()*(1-desconto)));
    }

    public boolean confirmarPedido(){
        if(getStatus() != StatusPedido.PENDENTE) return false;
        if(getMetodoPagamento() == null) return false;

        boolean pagamentoAprovado = metodoPagamento.processarPagamento(calcularTotal());

        if(pagamentoAprovado)
            setStatus(StatusPedido.PROCESSANDO);
        else
            setStatus(StatusPedido.PENDENTE);

        return pagamentoAprovado;
    }
}