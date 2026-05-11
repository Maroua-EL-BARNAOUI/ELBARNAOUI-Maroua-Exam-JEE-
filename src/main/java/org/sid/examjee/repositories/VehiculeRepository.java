package org.sid.examjee.repositories;

import org.sid.examjee.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculeRepository  extends JpaRepository<Vehicule, Long> {
}
