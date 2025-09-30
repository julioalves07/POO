public class PagamentoCartaoCredito implements IPagamento {
    private  String numeroCartao;

    @Override
    public boolean processarPagamento(double valor) {
        if(valor < 200)
            return true;

        return false;
    }
}