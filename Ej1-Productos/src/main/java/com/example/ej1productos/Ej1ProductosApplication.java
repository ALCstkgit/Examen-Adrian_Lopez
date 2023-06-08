package com.example.ej1productos;

import com.example.ej1productos.model.IImpuesto;
import com.example.ej1productos.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ej1ProductosApplication implements CommandLineRunner {
    @Autowired
    @Qualifier("ivaGeneral")
    public IImpuesto impuestoGeneral;

    @Autowired
    @Qualifier("ivaSuperReducido")
    public IImpuesto impuestoReducido;

    public static void main(String[] args) {
        SpringApplication.run(Ej1ProductosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Producto p = new Producto("Coche",10.000);
        System.out.println("IVA General del producto"+p.getNombre()+" :");
        System.out.println(impuestoGeneral.calcularImpuesto(p));
        System.out.println("IVA Reducido del producto"+p.getNombre()+" :");
        System.out.println(impuestoReducido.calcularImpuesto(p));
    }
}
