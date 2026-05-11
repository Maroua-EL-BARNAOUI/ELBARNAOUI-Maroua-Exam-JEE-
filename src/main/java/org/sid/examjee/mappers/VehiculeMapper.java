package org.sid.examjee.mappers;

import org.sid.examjee.entities.*;
import org.sid.examjee.dtos.*;

import org.sid.examjee.entities.*;
import org.sid.examjee.dtos.*;

public class VehiculeMapper {

    public static VehiculeDTO toDto(Vehicule v) {
        if (v instanceof Voiture voiture) {
            VoitureDTO dto = new VoitureDTO();
            dto.setNombrePortes(voiture.getNombrePortes());
            dto.setTypeCarburant(voiture.getTypeCarburant());
            dto.setBoiteVitesse(voiture.getBoiteVitesse());
            dto.setTypeVehicule("VOITURE");
            copyCommonFields(voiture, dto);
            return dto;
        } else if (v instanceof Moto moto) {
            MotoDTO dto = new MotoDTO();
            dto.setCylindree(moto.getCylindree());
            dto.setTypeMoto(moto.getTypeMoto());
            dto.setCasqueInclus(moto.isCasqueInclus());
            dto.setTypeVehicule("MOTO");
            copyCommonFields(moto, dto);
            return dto;
        }
        return null;
    }

    private static void copyCommonFields(Vehicule entity, VehiculeDTO dto) {
        dto.setId(entity.getId());
        dto.setMarque(entity.getMarque());
        dto.setModele(entity.getModele());
        dto.setMatricule(entity.getMatricule());
        dto.setPrixParJour(entity.getPrixParJour());
        dto.setDateMiseEnService(entity.getDateMiseEnService());
        dto.setStatut(entity.getStatut());
    }
}