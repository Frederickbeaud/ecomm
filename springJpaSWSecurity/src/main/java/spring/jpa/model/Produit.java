package spring.jpa.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
public class Produit {
    @Id
    @GeneratedValue
    private  Long Id;
    @Column(length = 50)
    @NotNull // interdire une valeur null
    @Size(min=3, max=50)//spécifier la taille acceptée
    private String designation;
    @DecimalMin("0.1") // pour spécifier une valeur minimale pour le prix
    private double prix;
    private int quantite;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateAchat;
    @ManyToOne
    private Categorie categorie;
    private boolean actif;
    public boolean isActif() {
        return actif;
    }
    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public Produit() {
    }

    public Produit(Long id, String designation, double prix, int qualite, Date dateAchat, Categorie categorie) {
        Id = id;
        this.designation = designation;
        this.prix = prix;
        this.quantite = qualite;
        this.dateAchat = dateAchat;
        this.categorie = categorie;
    }

    public Produit(String designation, double prix, int qualite, Date dateAchat) {
        this.designation = designation;
        this.prix = prix;
        this.quantite = qualite;
        this.dateAchat = dateAchat;
    }

    public Produit(String designation, double prix, int qualite, Date dateAchat, Categorie categorie) {
        this.designation = designation;
        this.prix = prix;
        this.quantite = qualite;
        this.dateAchat = dateAchat;
        this.categorie = categorie;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int qualite) {
        this.quantite = qualite;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "Id=" + Id +
                ", designation='" + designation + '\'' +
                ", prix=" + prix +
                ", qualite=" + quantite +
                ", dateAchat=" + dateAchat +
                ", categorie=" + categorie +
                '}';
    }
}
