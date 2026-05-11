package org.sid.examjee.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.examjee.enums.TypeMoto;

@Entity
@DiscriminatorValue("MOTO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Moto extends Vehicule {

    private int cylindree;

    @Enumerated(EnumType.STRING)
    private TypeMoto typeMoto;

    private boolean casqueInclus;

    public int getCylindree() { return cylindree; }
    public void setCylindree(int cylindree) { this.cylindree = cylindree; }

    public TypeMoto getTypeMoto() { return typeMoto; }
    public void setTypeMoto(TypeMoto typeMoto) { this.typeMoto = typeMoto; }

    public boolean isCasqueInclus() { return casqueInclus; }
    public void setCasqueInclus(boolean casqueInclus) { this.casqueInclus = casqueInclus; }
}