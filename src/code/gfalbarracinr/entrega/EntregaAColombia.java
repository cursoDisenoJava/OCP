package code.gfalbarracinr.entrega;

import code.gfalbarracinr.tienda.Orden;

public class EntregaAColombia implements Entrega{


    @Override
    public double calcularCosto(Orden orden) {
        double costo = orden.obtenerTotal() * 0.1;
        return orden.obtenerPeso() <= 2 ?
                costo + 9900
                : costo + (orden.obtenerPeso() * 5000);
    }

    @Override
    public boolean estaVacio() {
        return false;
    }
}
