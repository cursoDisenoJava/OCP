package code.gfalbarracinr.tienda;

public class Orden {


     public static class Constructor {

        public Constructor cambiarPeso (double Peso){

            this.peso = peso;
            return this;
        }

        public Constructor cambiarTotal (double total){

            this.total = total;
            return this;
        }

        public Constructor cambiarPais (Pais pais){

            this.pais = pais;
            return this;
        }

        public Orden construir (){

            return new Orden(peso, total, pais);
        }

        private double peso;
        private double total;
        private Pais pais;

    }

    public Pais obtenerPais() {
        return pais;
    }

    public double obtenerPeso() {
        return peso;
    }

    public double obtenerTotal() {
        return total;
    }

    private Orden(double peso, double total, Pais pais ){
        this.peso = peso;
        this.total = total;
        this.pais = pais;
    }

    private Pais pais;
    private double peso;
    private double total;

}
