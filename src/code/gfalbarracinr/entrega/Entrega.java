package code.gfalbarracinr.entrega;

import code.gfalbarracinr.tienda.Orden;

public interface Entrega {

     double calcularCosto(Orden orden);

     boolean estaVacio();
}
