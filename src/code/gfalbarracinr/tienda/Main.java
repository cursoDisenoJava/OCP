package code.gfalbarracinr.tienda;

public class Main {

    public static void main(String args []){

        Tienda miTienda = new Tienda();

        Orden miOrden = new Orden.Constructor()
                        .cambiarPais(Pais.Colombia)
                        .cambiarPeso(10)
                        .cambiarTotal(100000)
                        .construir();

        Orden otraOrden = new Orden.Constructor()
                        .cambiarPais(Pais.Mexico)
                        .cambiarPeso(1)
                        .cambiarTotal(8000)
                        .construir();


        System.out.println("Los costos son: Para "
                + miOrden.obtenerPais().toString()
                + " " + miTienda.calcularCosto(miOrden));

        System.out.println("Los costos son: Para "
                + otraOrden.obtenerPais().toString()
                + " " + miTienda.calcularCosto(otraOrden));
    }

}
