package eficiencia1;

public class DatosEstadisticos{
    private double time;
    private int nTiempos;
    
    public DatosEstadisticos() {
        time = 0;
        nTiempos = 0;
    }
    public void añadeTiempo(double time){
        this.time+=time;
        nTiempos++;
    }
    public void estableceTiempo(double time){
        this.time=time;
    }
    public double dameTiempo(){
        return time/nTiempos;
    }
}