package com.softtek.ej2autobuses.repository;

import com.softtek.ej2autobuses.model.Autobus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAutobusRepository extends JpaRepository<Autobus,String> {
    Autobus findAutobusByMatricula(String matricula);
}
