public class ClientePJ extends Cliente{
    private String cnpj;
    private String razaoSocial;
    private String inscricaoEstadual;

    public ClientePJ(String nome, String email, String cnpj){
        super(nome, email);
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return this.cnpj;
    }

    public String getIdentificadorUnico(){
        return this.cnpj;
    }
}
