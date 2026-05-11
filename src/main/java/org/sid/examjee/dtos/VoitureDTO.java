package org.sid.examjee.dtos;

import org.sid.examjee.enums.TypeCarburant;
import org.sid.examjee.enums.BoiteVitesse;

public class VoitureDTO extends VehiculeDTO {
    private int nombrePortes;
    private TypeCarburant typeCarburant;
    private BoiteVitesse boiteVitesse;

    public int getNombrePortes() { return nombrePortes; }
    public void setNombrePortes(int nombrePortes) { this.nombrePortes = nombrePortes; }

    public TypeCarburant getTypeCarburant() { return typeCarburant; }
    public void setTypeCarburant(TypeCarburant typeCarburant) { this.typeCarburant = typeCarburant; }

    public BoiteVitesse getBoiteVitesse() { return boiteVitesse; }
    public void setBoiteVitesse(BoiteVitesse boiteVitesse) { this.boiteVitesse = boiteVitesse; }

    public String getTypeVehicule() { return typeVehicule; }
    public void setTypeVehicule(String typeVehicule) { this.typeVehicule = typeVehicule; }
}
