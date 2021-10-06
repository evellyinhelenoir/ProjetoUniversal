package br.com.zup;

public class Main {

    public static void main(String[] args) {
	Consumidor consumidor = new Consumidor("André", "andré");
	Fatura fatura = new Fatura(8000,"24/05/2000" , consumidor);
        System.out.println(fatura);
    }
}
