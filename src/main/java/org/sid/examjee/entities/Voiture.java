package org.sid.examjee.entities;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.examjee.enums.TypeCarburant;
import org.sid.examjee.enums.BoiteVitesse;

@Entity
@DiscriminatorValue("VOITURE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Voiture extends Vehicule {

    private int nombrePortes;

    @Enumerated(EnumType.STRING)
    private TypeCarburant typeCarburant;

    @Enumerated(EnumType.STRING)
    private BoiteVitesse boiteVitesse;

    public int getNombrePortes() { return nombrePortes; }
    public void setNombrePortes(int nombrePortes) { this.nombrePortes = nombrePortes; }

    public TypeCarburant getTypeCarburant() { return typeCarburant; }
    public void setTypeCarburant(TypeCarburant typeCarburant) { this.typeCarburant = typeCarburant; }

    public BoiteVitesse getBoiteVitesse() { return boiteVitesse; }
    public void setBoiteVitesse(BoiteVitesse boiteVitesse) { this.boiteVitesse = boiteVitesse; }
}