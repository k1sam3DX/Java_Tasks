package printable;

public class Magazine implements Printable{
    String magazineName;

    public Magazine(String magazineName){
        this.magazineName = magazineName;
    }

    @Override
    public void print() {
        System.out.println("Название журнала: " + this.magazineName);
    }
}
