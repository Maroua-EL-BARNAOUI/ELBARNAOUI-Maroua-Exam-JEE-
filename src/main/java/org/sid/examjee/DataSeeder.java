package org.sid.examjee;

import org.sid.examjee.entities.*;
import org.sid.examjee.enums.*;
import org.sid.examjee.repositories.AgenceRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private AgenceRepository agenceRepository;

    @Override
    public void run(String... args) throws Exception {


        Agence agence = new Agence();
        agence.setNom("Agence Casablanca");
        agence.setAdresse("Bd Hassan II");
        agence.setVille("Casablanca");
        agence.setTelephone("0522123456");


        Voiture voiture = new Voiture();
        voiture.setMarque("Toyota");
        voiture.setModele("Corolla");
        voiture.setMatricule("123-ABC");
        voiture.setPrixParJour(300);
        voiture.setDateMiseEnService(LocalDate.of(2020,5,10));
        voiture.setStatut(StatutVehicule.DISPONIBLE);
        voiture.setNombrePortes(4);
        voiture.setTypeCarburant(TypeCarburant.ESSENCE);
        voiture.setBoiteVitesse(BoiteVitesse.MANUELLE);
        voiture.setAgence(agence);


        Moto moto = new Moto();
        moto.setMarque("Yamaha");
        moto.setModele("R3");
        moto.setMatricule("456-XYZ");
        moto.setPrixParJour(150);
        moto.setDateMiseEnService(LocalDate.of(2021,3,15));
        moto.setStatut(StatutVehicule.DISPONIBLE);
        moto.setCylindree(321);
        moto.setTypeMoto(TypeMoto.SPORTIVE);
        moto.setCasqueInclus(true);
        moto.setAgence(agence);


        agence.setVehicules(Arrays.asList(voiture, moto));


        agenceRepository.save(agence);

        System.out.println("Données insérées avec succès !");
    }
}