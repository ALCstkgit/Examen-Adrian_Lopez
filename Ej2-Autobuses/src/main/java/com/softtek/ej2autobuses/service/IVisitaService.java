package com.softtek.ej2autobuses.service;

import com.softtek.ej2autobuses.model.Visita;

import java.util.List;

public interface IVisitaService {
    List<Visita> findAll();

    Visita insertVisita(Visita v);
}
