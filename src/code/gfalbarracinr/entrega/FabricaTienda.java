package code.gfalbarracinr.entrega;

import code.gfalbarracinr.tienda.Pais;

import java.util.HashMap;

public class FabricaTienda {



    public static FabricaTienda getInstance() {

        return ourInstance;
    }

    public Entrega obtener(Pais pais){
        if (paises.containsKey(pais)){
            return paises.get(pais);
        }
        return EntregaVacia.getInstance();
    }


    private FabricaTienda() {

        paises = new HashMap<>();
        paises.put(Pais.Mexico, new EntregaAMexico());
        paises.put(Pais.Colombia, new EntregaAColombia());

    }


    private final static FabricaTienda ourInstance  = new FabricaTienda();

    private HashMap <Pais, Entrega> paises;
}
