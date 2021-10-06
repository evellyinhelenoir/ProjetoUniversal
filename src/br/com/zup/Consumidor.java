package br.com.zup;

public class Consumidor {

    private String nome;
    private String email;

    public Consumidor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Consumidor() {
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

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome do consumidor: "+nome);
        retorno.append("Email do consumidor: "+email);
        return retorno.toString();
    }
}