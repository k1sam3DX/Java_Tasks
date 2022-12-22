package math4;

public class MathFunc implements MathCalculable{
    @Override
    public double powF(double a, int b) {
        if (b < 0) {
            a = 1 / a;
            b = -b;
        }
        double res = 0;
        double temp = 1;
        for(int i = 0; i < b; i++){
            res = temp*a;
            temp = res;
        }
        return res;
    }

    @Override
    public double absComplex(double x, double z) {
        return Math.sqrt(powF(x, 2) + powF(z, 2));
    }
}
