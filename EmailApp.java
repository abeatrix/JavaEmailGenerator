package emailapp;

public class EmailApp {
    public static void main(String[] args){
        Email em1 = new Email("John", "Smith");

        em1.setAlternateEmail("beatrix@gmail.com");
        System.out.println(em1.getAlternateEmail())
    }
}
