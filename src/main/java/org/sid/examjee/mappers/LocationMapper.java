package org.sid.examjee.mappers;

import org.sid.examjee.entities.Location;
import org.sid.examjee.dtos.LocationDTO;
import org.sid.examjee.entities.Voiture;

public class LocationMapper {

    public static LocationDTO toDto(Location location) {
        LocationDTO dto = new LocationDTO();
        dto.setId(location.getId());
        dto.setDateDebut(location.getDateDebut());
        dto.setDateFin(location.getDateFin());
        dto.setMontantTotal(location.getMontantTotal());

        if (location.getVehicule() != null) {
            dto.setVehiculeId(location.getVehicule().getId());
            dto.setVehiculeMarque(location.getVehicule().getMarque());
            dto.setVehiculeModele(location.getVehicule().getModele());
            dto.setVehiculeType(location.getVehicule() instanceof Voiture ? "VOITURE" : "MOTO");
        }
        return dto;
    }
}