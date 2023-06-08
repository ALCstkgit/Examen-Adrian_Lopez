package com.softtek.ej2autobuses.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "visitas")
public class Visita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "f_visita")
    private Date fVisita;

    @JsonIgnoreProperties("visitasAutobus")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "matricula")
    private Autobus autobusVisita;

    @JsonIgnoreProperties("visitasConductor")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dni")
    private Conductor conductorVisita;

    @JsonIgnoreProperties("visitasLugar")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_lugar")
    private Lugar lugarVisita;
}
