package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    int codice = newCodice();
    String nome;
    String descrizione;
    double prezzo;
    int iva;

    public Prodotto(String nome, String descrizione, double prezzo, int iva) {
    this.codice = newCodice(); 
    this.nome = nome;
    this.descrizione = descrizione != null ? descrizione : "";
    this.prezzo = prezzo;
    this.iva = iva;
}

    public int newCodice() {
        Random random = new Random();
        int codiceGenerato = random.nextInt(Integer.MAX_VALUE);
        return codiceGenerato;
     }


     public double prezzoBase (){
       
       return this.prezzo / (1 + iva / 100.00);

     }

    public double importoIva () {
        return this.prezzo - prezzoBase();
    }

    public double prezzoIva (){
        return prezzoBase() * (1 + iva / 100.00);
    }

    public String nomeEsteso() {
    return codice + "-" + nome;
}


}



