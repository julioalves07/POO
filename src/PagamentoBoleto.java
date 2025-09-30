public class PagamentoBoleto implements IPagamento {
    private String codigoBarras;

    @Override
    public boolean processarPagamento(double valor) {
        if(valor < 1000)
            return true;

        return false;
    }
}