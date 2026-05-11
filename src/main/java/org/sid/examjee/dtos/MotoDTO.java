package org.sid.examjee.dtos;

import org.sid.examjee.enums.TypeMoto;

public class MotoDTO extends VehiculeDTO {
    private int cylindree;
    private TypeMoto typeMoto;
    private boolean casqueInclus;

    public int getCylindree() { return cylindree; }
    public void setCylindree(int cylindree) { this.cylindree = cylindree; }

    public TypeMoto getTypeMoto() { return typeMoto; }
    public void setTypeMoto(TypeMoto typeMoto) { this.typeMoto = typeMoto; }

    public boolean isCasqueInclus() { return casqueInclus; }
    public void setCasqueInclus(boolean casqueInclus) { this.casqueInclus = casqueInclus; }

    public String getTypeVehicule() { return typeVehicule; }
    public void setTypeVehicule(String typeVehicule) { this.typeVehicule = typeVehicule; }

}