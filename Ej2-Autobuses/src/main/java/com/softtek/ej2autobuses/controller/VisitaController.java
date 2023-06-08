package com.softtek.ej2autobuses.controller;

import com.softtek.ej2autobuses.model.Visita;
import com.softtek.ej2autobuses.service.IVisitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/visitas")
public class VisitaController {
    @Autowired
    IVisitaService visitaService;

    @GetMapping
    public ResponseEntity<List<Visita>> findAll(){
        return new ResponseEntity<>(visitaService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Visita> insertVisita(@RequestBody Visita visita){
        return new ResponseEntity<>(visitaService.insertVisita(visita),HttpStatus.CREATED);
    }
}
