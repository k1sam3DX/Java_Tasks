public class test {
    public static void main(String[] args){
        Printable[] books = new Printable[4];
        books[0] = new Magazine("Forbes");
        books[1] = new Magazine("Time");
        books[2] = new Book("Николай Гоголь - Мёртвые души");
        books[3] = new Book("Лев Толстой - Война и мир");
        for (int i = 0; i<4; i++){
            books[i].print();
        }


        Printable.printBook();

    

        
    }
}
