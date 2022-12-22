package math4;

public class Test {
    public static void main(String[] args) {
        MathCalculable obj = new MathFunc();
        int r = 4;
        double len = 2 * obj.PI * r;
        System.out.println(len);
        System.out.println(obj.powF(2, 3));
    }
}
