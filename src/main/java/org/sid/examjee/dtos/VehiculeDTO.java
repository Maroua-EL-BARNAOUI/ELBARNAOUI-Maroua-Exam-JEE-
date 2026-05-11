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
    String typeVehicule; // VOITURE ou MOTO

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getMarque() { return marque; }
    public void setMarque(String marque) { this.marque = marque; }
    public String getModele() { return modele; }
    public void setModele(String modele) { this.modele = modele; }
    public String getMatricule() { return matricule; }
    public void setMatricule(String matricule) { this.matricule = matricule; }
    public double getPrixParJour() { return prixParJour; }
    public void setPrixParJour(double prixParJour) { this.prixParJour = prixParJour; }
    public LocalDate getDateMiseEnService() { return dateMiseEnService; }
    public void setDateMiseEnService(LocalDate dateMiseEnService) { this.dateMiseEnService = dateMiseEnService; }
    public StatutVehicule getStatut() { return statut; }
    public void setStatut(StatutVehicule statut) { this.statut = statut; }
    public String getTypeVehicule() { return typeVehicule; }
    public void setTypeVehicule(String typeVehicule) { this.typeVehicule = typeVehicule; }
}
