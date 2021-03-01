package projectver2.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CategorieTerrain {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String ref;

    private String libelle ;


    public Long getId() {
        return id;
    }

    public String getRef() {
        return this.ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


}