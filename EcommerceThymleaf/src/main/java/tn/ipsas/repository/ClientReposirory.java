package tn.ipsas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.ipsas.model.Client;

public interface ClientReposirory extends JpaRepository<Client,Long> {
}
