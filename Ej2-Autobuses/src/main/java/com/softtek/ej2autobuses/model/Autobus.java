package com.softtek.ej2autobuses.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "autobuses")
public class Autobus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "matricula")
    private String matricula;
    @Column(name = "a_fabricacion")
    private int aFabricacion;
    @JsonIgnoreProperties("autobusVisita")
    @OneToMany(mappedBy = "autobusVisita", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Visita> visitasAutobus;
}
