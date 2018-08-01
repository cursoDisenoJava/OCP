package code.gfalbarracinr.tienda;

import code.gfalbarracinr.entrega.Entrega;
import code.gfalbarracinr.entrega.FabricaTienda;

import java.util.Objects;

public class Tienda {

    public double calcularCosto(Orden orden){

        Objects.requireNonNull(orden);
        Entrega entrega = FabricaTienda.getInstance().obtener(orden.obtenerPais());
        return entrega.calcularCosto(orden);
    }
}
