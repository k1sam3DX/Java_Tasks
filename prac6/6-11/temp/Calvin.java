package temp;

public class Calvin implements Convertable{
    double celsium;
    public Calvin(double celsium){
        this.celsium = celsium;
    }
    public double convert(){
        double c = this.celsium;
        return c + 273.15;
    }
}
