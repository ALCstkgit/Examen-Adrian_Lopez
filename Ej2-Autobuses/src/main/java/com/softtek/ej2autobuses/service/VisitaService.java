package com.softtek.ej2autobuses.service;

import com.softtek.ej2autobuses.model.Visita;
import com.softtek.ej2autobuses.repository.IVisitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitaService implements IVisitaService{
    @Autowired
    IVisitaRepository visitaRepository;

    @Override
    public List<Visita> findAll() {
        return visitaRepository.findAll();
    }

    @Override
    public Visita insertVisita(Visita v) {
        return visitaRepository.save(v);
    }
}
