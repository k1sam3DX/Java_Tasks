package market;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Processor processor1 = new Processor("Ryzen 7", 2019, 6000);
        Processor processor2 = new Processor("Ryzen 5", 2020, 4500);
        Processor processor3 = new Processor("icore i5", 2021, 4000);
        Memory memory1 = new Memory("hx-400", 16, 3000);
        Memory memory2 = new Memory("m100", 8, 2444);
        Memory memory3 = new Memory("hx-200", 16, 2900);
        Monitor monitor1 = new Monitor("MagicSinc 17", 21);
        Monitor monitor2 = new Monitor("l-400", 27);
        Monitor monitor3 = new Monitor("ns2", 23);

        Computer computer1 = new Computer(processor2, memory2, monitor3, "Acer", "hh12");
        Computer computer2 = new Computer(processor1, memory3, monitor1, "Msi", "Alpha");
        Computer computer3 = new Computer(processor3, memory1, monitor1, "Lenovo", "ThinkPad 2");
        Computer computer4 = new Computer(processor2, memory2, monitor2, "Apple", "Macbook Pro 15");

        shop.add(computer1);
        shop.add(computer2);
        shop.add(computer3);
        shop.add(computer4);

       

        System.out.println(shop.find("Acer", "hh12").toString());

        shop.delete(computer1);


        System.out.println(shop.find("Msi", "Alpha").toString()); 
        
        System.out.println(Computers.values().toString());
        System.out.println(computer1.toString());
    }   
}
