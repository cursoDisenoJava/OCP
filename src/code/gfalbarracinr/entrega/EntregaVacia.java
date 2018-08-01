package code.gfalbarracinr.entrega;


import code.gfalbarracinr.tienda.Orden;

public class EntregaVacia implements Entrega{



    public static EntregaVacia  getInstance(){
        return INSTANCE;
    }


    @Override
    public double calcularCosto(Orden orden) {
        return 0;
    }

    @Override
    public boolean estaVacio() {
        return true;
    }



    private EntregaVacia(){}
    private static final EntregaVacia INSTANCE = new EntregaVacia();

}
