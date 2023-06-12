package tn.esprit.ms1gestioncandidat.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.ms1gestioncandidat.entities.Candidat;
import tn.esprit.ms1gestioncandidat.services.CandidatService;

import java.util.List;

@RequestMapping(value = "/API/GestionCandidat")
@RestController
public class CandidatController {
    @Autowired
    CandidatService candidatService ;
    @GetMapping("/getAll")
    public List<Candidat> getAll (){
        return candidatService.getAll() ;
    }
}
