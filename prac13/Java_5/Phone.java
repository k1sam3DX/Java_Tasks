package Java_5;

public class Phone {
    private String code, city, triplet, quadruple;

    public Phone(String phone){
        if(phone.startsWith("8")){
            code = "+7";
        }else{
            code = phone.substring(0, phone.length()-10);
        }
        city = phone.substring(phone.length()-10, phone.length()-7);
        triplet = phone.substring(phone.length()-7, phone.length()-4);
        quadruple = phone.substring(phone.length()-4);
    }

    @Override
    public String toString() {
        return code + city + "-" + triplet + "-" + quadruple;
    }

    public static void main(String[] args) {
        System.out.println(new Phone("+79607771337"));
        System.out.println(new Phone("894513451020"));
        System.out.println(new Phone("+123666999013"));
        System.out.println(new Phone("+131000769696"));
    }
}
