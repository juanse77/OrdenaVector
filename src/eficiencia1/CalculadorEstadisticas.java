package eficiencia1;

public class CalculadorEstadisticas {

    public static DatosEstadisticos[] estadisticasOrdenaVector(OrdenarVector m, int tam_vector) {
        DatosEstadisticos datos[] = new DatosEstadisticos[2];
        datos[0] = new DatosEstadisticos();
        datos[1] = new DatosEstadisticos();

        int v[] = GeneraCaso.generaVector(tam_vector, false);
        m.ordena(v, datos[0]);
        CompruebaCaso.compruebaVector(v, tam_vector);

        for (int i = 0; i < 10; i++) {
            v = GeneraCaso.generaVector(tam_vector, true);
            m.ordena(v, datos[1]);
            CompruebaCaso.compruebaVector(v, tam_vector);
        }

        return datos;
    }

    public static DatosEstadisticos[][] estadisticasOrdenaVectores(OrdenarVector m, int[] tam_vectores) {
        DatosEstadisticos da[][] = new DatosEstadisticos[tam_vectores.length][];
        
        for (int i = 0; i < tam_vectores.length; i++) {
            da[i] = CalculadorEstadisticas.estadisticasOrdenaVector(m, tam_vectores[i]);            
        }
        
        return da;
    }

}
