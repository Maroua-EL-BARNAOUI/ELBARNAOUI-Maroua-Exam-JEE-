package org.sid.examjee.services;

import org.sid.examjee.entities.Vehicule;

import java.util.List;

public interface VehiculeService {
    List<Vehicule> findAll();
    Vehicule findById(Long id);
    Vehicule save(Vehicule vehicule);
    void delete(Long id);
}
