package temp;
public class Farngate {
    double celsium;
    public Farngate(double celsium){
        this.celsium = celsium;
    }
    public double convert(){
        double c = this.celsium;
        return (c * 1.8) + 32;
}
}
