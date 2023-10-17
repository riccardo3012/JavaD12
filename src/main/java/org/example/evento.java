package org.example;
import java.util.Date;

public class evento {


    private int ID;
    private String titolo;
    private Date dataEvento;
    private String descrizione;

    private TipoEvento tipoEvento;
    private Integer numeroMassimoPartecipanti;

    public enum TipoEvento {
        PUBBLICO, PRIVATO
    }

    public evento() {
    }

    public evento(String titolo, Date dataEvento, String descrizione, TipoEvento tipoEvento,
                  Integer numeroMassimoPartecipanti) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

}

