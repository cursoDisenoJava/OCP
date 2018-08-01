package code.gfalbarracinr.entrega;

import code.gfalbarracinr.tienda.Orden;

public class EntregaAMexico implements Entrega {

    @Override
    public double calcularCosto(Orden orden) {
        return 9800;
    }

    @Override
    public boolean estaVacio() {
        return false;
    }
}
