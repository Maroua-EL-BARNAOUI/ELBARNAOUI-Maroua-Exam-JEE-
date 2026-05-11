package org.sid.examjee.dtos;

import java.util.List;

public class AgenceDTO {
    private Long id;
    private String nom;
    private String adresse;
    private String ville;
    private String telephone;
    private List<Long> vehiculesIds; // Liste des ids des véhicules

}