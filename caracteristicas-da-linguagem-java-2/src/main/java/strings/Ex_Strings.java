package strings;

public class Ex_Strings {

    public static void main(String[] args) {
        System.out.println("A B C D E F G".toCharArray());
        System.out.println("Aula de Java".split(" "));
        System.out.println("Aula".concat("de Java"));
        System.out.println("1234 asda qw".replaceAll("[0-9]", "#"));
    }
}
