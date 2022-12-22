package market;

public class Memory {
    private String model;
    private int capacity;
    private double frequency;

    public Memory(String model, int capacity, double frequency) {
        this.model = model;
        this.capacity = capacity;
        this.frequency = frequency;
    }

    @Override
    public String toString(){
        return "Memory model: " + this.model +  " capaciry: " + this.capacity + " frequency: " + this.frequency + "||";
    }
}
