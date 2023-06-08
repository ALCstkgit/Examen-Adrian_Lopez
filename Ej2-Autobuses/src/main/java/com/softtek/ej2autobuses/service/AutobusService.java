package com.softtek.ej2autobuses.service;

import com.softtek.ej2autobuses.model.Autobus;
import com.softtek.ej2autobuses.repository.IAutobusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutobusService implements IAutobusService{
    @Autowired
    IAutobusRepository autobusRepository;

    @Override
    public List<Autobus> findAll() {
        return autobusRepository.findAll();
    }

    @Override
    public Autobus findAutobus(String matricula) {
        return autobusRepository.findAutobusByMatricula(matricula);
    }
}
