package eficiencia1;

public class Ordenar1Vector implements OrdenarVector{
    private static final String NOMBRE_METODO = "Burbuja";
    @Override
    public String nombreMetodo() {
        return NOMBRE_METODO;
    }

    @Override
    public  void ordena(int[] v, DatosEstadisticos de) {
        
        long inicio = System.currentTimeMillis();
        
        int alta=1;
        int baja =v.length-1;
        while(alta<=baja){
            int k=baja;
            for (int j = baja; j >=alta; j--) {
                if(v[j-1]>v[j]){
                    int valor=v[j];
                    v[j]=v[j-1];
                    v[j-1]=valor;
                    k=j;
                
                }
            }
            alta=k+1;
            if(alta<=baja){
                k=baja;
                for (int j = alta; j <= baja; j++) {
                    if(v[j-1]>v[j]){
                        int valor=v[j];
                        v[j]=v[j-1];
                        v[j-1]=valor;
                        k=j;
                    }
                    
                }
                baja=k-1;
            }
        }
        
        long fin = System.currentTimeMillis();
        
        de.añadeTiempo((fin - inicio)/1000d);
        
    }
    
}