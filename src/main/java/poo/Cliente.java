package poo;

public abstract class Cliente {
    String nome;
    String email;
    String id;
    String telefone;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId(){
        return this.id;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public abstract String getIdentificadorUnico();
}