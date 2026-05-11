package org.sid.examjee.dtos;

import java.time.LocalDate;
import org.sid.examjee.enums.StatutVehicule;

public class VehiculeDTO {
    private Long id;
    private String marque;
    private String modele;
    private String matricule;
    private double prixParJour;
    private LocalDate dateMiseEnService;
    private StatutVehicule statut;
    private String typeVehicule; // VOITURE ou MOTO

    // Getters & Setters
}