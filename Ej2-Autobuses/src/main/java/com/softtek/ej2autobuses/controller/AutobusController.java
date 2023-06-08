package com.softtek.ej2autobuses.controller;

import com.softtek.ej2autobuses.model.Autobus;
import com.softtek.ej2autobuses.model.Visita;
import com.softtek.ej2autobuses.service.IAutobusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/autobuses")
public class AutobusController {
    @Autowired
    IAutobusService autobusService;

    @GetMapping
    public ResponseEntity<List<Autobus>> findAll(){
        return new ResponseEntity<>(autobusService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{matricula}")
    public ResponseEntity<Autobus> findAutobus(@PathVariable String matricula){
        return new ResponseEntity<>(autobusService.findAutobus(matricula), HttpStatus.OK);
    }
}
