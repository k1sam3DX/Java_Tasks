package market;

public class Monitor {
    private String model;
    private int diagonal;

    public Monitor(String model, int diagonal) {
        this.model = model;
        this.diagonal = diagonal;
    }

    @Override
    public String toString(){
        return "Monitor model: " + this.model +  " diagonal: " + this.diagonal + "||";
    }
}
