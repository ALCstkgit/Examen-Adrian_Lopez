package com.softtek.ej2autobuses.model;

import net.minidev.json.annotate.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "conductores")
public class Conductor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dni")
    private String dni;
    @Column(name = "nombre")
    private String nombre;
    @JsonIgnoreProperties("conductorVisita")
    @OneToMany(mappedBy = "conductorVisita", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Visita> visitasConductor;
}
