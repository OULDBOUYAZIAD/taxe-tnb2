package projectver2.bean.bean;


import javax.persistence.*;

@Entity
public class VenteTerrain {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    Long id ;
    String dateVente ;
    @ManyToOne
    Terrain local ;
    @ManyToOne
    Redevable ancienProprietaire ;
    @ManyToOne
    Redevable nouveauProprietaire ;


    public Terrain getLocal() {
        return local;
    }

    public void setLocal(Terrain terrain) {
        this.local = terrain;
    }

    public Redevable getAncienProprietaire() {
        return ancienProprietaire;
    }

    public void setAncienProprietaire(Redevable ancienProprietaire) {
        this.ancienProprietaire = ancienProprietaire;
    }

    public Redevable getNouveauProprietaire() {
        return nouveauProprietaire;
    }

    public void setNouveauProprietaire(Redevable nouveauProprietaire) {
        this.nouveauProprietaire = nouveauProprietaire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDateVente() {
        return dateVente;
    }

    public void setDateVente(String dateVente) {
        this.dateVente = dateVente;
    }
}
