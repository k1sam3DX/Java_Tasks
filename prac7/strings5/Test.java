package strings5;

public class Test {
    public static void main(String[] args) {
        interfaceStrings objStrings = new StringOperations();
        int a = objStrings.countOfSymbols("hello world");
        System.out.println(a);
        System.out.println(objStrings.oddSymbols("hello world"));
        System.out.println(objStrings.invertString("hello world"));
    }


}
