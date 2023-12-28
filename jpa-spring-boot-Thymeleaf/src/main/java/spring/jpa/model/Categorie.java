package spring.jpa.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Categorie {
    @Id
    @GeneratedValue
    private Long id;
    @Column(length = 50)
    private String code;
    @Column(length = 50)
    private String libelle;
    @OneToMany(mappedBy = "categorie",cascade = {CascadeType.REMOVE,CascadeType.MERGE,CascadeType.PERSIST})
    private Collection<Produit> produits = new ArrayList<Produit>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }
    public Categorie(){}

    public Categorie(Long id, String code, String libelle, Collection<Produit> produits) {
        this.id = id;
        this.code = code;
        this.libelle = libelle;
        this.produits = produits;
    }

    public Categorie(String code, String libelle, Collection<Produit> produits) {
        this.code = code;
        this.libelle = libelle;
        this.produits = produits;
    }

    public Categorie(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }


}
