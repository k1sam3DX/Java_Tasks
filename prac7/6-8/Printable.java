interface Printable{
    void print();

    public static void printBook(Printable printable){
        if (printable.getClass() == Book.getClass()){
            System.out.println("Книга: " + printable.toString());
        }
        else{
            System.out.println("Это не книга");
        }
    }

    public static void printMagazines(Printable printable){
        if (printable.getClass() == Magazine.getClass()){
            System.out.println("Журнал: " + printable.toString());
        }
        else{
            System.out.println("Это не журнал");
        }
    }

}

