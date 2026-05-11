package org.sid.examjee.dtos;

import java.time.LocalDate;

public class LocationDTO {

    private Long id;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private double montantTotal;
    private Long vehiculeId;   // référence au véhicule
    private String vehiculeType; // VOITURE ou MOTO
    private String vehiculeMarque;
    private String vehiculeModele;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getDateDebut() { return dateDebut; }
    public void setDateDebut(LocalDate dateDebut) { this.dateDebut = dateDebut; }

    public LocalDate getDateFin() { return dateFin; }
    public void setDateFin(LocalDate dateFin) { this.dateFin = dateFin; }

    public double getMontantTotal() { return montantTotal; }
    public void setMontantTotal(double montantTotal) { this.montantTotal = montantTotal; }

    public Long getVehiculeId() { return vehiculeId; }
    public void setVehiculeId(Long vehiculeId) { this.vehiculeId = vehiculeId; }

    public String getVehiculeType() { return vehiculeType; }
    public void setVehiculeType(String vehiculeType) { this.vehiculeType = vehiculeType; }

    public String getVehiculeMarque() { return vehiculeMarque; }
    public void setVehiculeMarque(String vehiculeMarque) { this.vehiculeMarque = vehiculeMarque; }

    public String getVehiculeModele() { return vehiculeModele; }
    public void setVehiculeModele(String vehiculeModele) { this.vehiculeModele = vehiculeModele; }
}