package modelo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import servicios.busqueda;

@EqualsAndHashCode(callSuper = true)
@Data
public class vehiculo extends busqueda {
    public int precio, ruedas, asientos, puertas;
    public String color, marca, traccion;

    public vehiculo() {
    }

    public String datos() {
        return "Precio:" + getPrecio() + " ruedas:" + getRuedas() + " asientos:" + getAsientos() + " traccion:" + getTraccion() + " puertas:" + getPuertas() + " color:" + getColor() + " marca:" + getMarca();
    }

    public vehiculo(int precio, int ruedas, int asientos, String traccion, int puertas, String color, String marca) {
        this.precio = precio;
        this.ruedas = ruedas;
        this.asientos = asientos;
        this.traccion = traccion;
        this.puertas = puertas;
        this.color = color;
        this.marca = marca;
    }

}