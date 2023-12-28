package tn.ipsas.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.ipsas.ecommerce.model.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {}