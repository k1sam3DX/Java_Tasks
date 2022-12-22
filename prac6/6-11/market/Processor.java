package market;

public class Processor {
    private String model;
    private int year;
    private double frequency;

    public Processor(String model, int year, double frequency) {
        this.model = model;
        this.year = year;
        this.frequency = frequency;
    }

    @Override
    public String toString(){
        return "Processor model: " + this.model +  " year: " + this.year + " frequency: " + this.frequency + "||";
    }
}
