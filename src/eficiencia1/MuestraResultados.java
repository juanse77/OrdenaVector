package eficiencia1;

public class MuestraResultados {

    public static void main(String[] args) {

        int tam[] = {1000, 2000, 4000, 8000, 16000, 32000};
        OrdenarVector or = new Ordenar1Vector();
        System.out.println(or.nombreMetodo());
        
        DatosEstadisticos da[][] = CalculadorEstadisticas.estadisticasOrdenaVectores(or, tam);

        System.out.println("            Orden inverso     Orden aleatorio");
        for (int j = 0; j < da.length; j++) {
            System.out.printf("%6d    |    %5.6f    |    %5.6f\n", tam[j], da[j][0].dameTiempo(), da[j][1].dameTiempo());
        }

    }

}
