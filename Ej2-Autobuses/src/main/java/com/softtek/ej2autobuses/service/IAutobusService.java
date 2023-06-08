package com.softtek.ej2autobuses.service;

import com.softtek.ej2autobuses.model.Autobus;

import java.util.List;

public interface IAutobusService {
    List<Autobus> findAll();
    Autobus findAutobus(String matricula);
}
