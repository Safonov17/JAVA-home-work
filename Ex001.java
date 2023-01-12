import java.util.Arrays;
import java.util.HashSet;

public class Ex001 {
    public static void main(String[] args) {
        Notebook nb1 = new Notebook();
        nb1.id = 1;
        nb1.BrandName = "MacBook Air";
        nb1.price = 2200;
        nb1.ram = 8;
        nb1.mem = 512;
        nb1.os = "M1";
        nb1.color = "grey";

        Notebook nb2 = new Notebook();
        nb2.id = 2;
        nb2.BrandName = "Xiaomi Book";
        nb2.price = 1327;
        nb2.ram = 16;
        nb2.mem = 512;
        nb2.os = "Windows";
        nb2.color = "white";

        Notebook nb3 = new Notebook();
        nb3.id = 3;
        nb3.BrandName = "Asus Chromebook";
        nb3.price = 1224;
        nb3.ram = 8;
        nb3.mem = 512;
        nb3.os = "Windows";
        nb3.color = "grey";

        Notebook nb4 = new Notebook();
        nb4.id = 4;
        nb4.BrandName = "Lenovo Idea Pad";
        nb4.price = 1991;
        nb4.ram = 4;
        nb4.mem = 512;
        nb4.os = "Windows";
        nb4.color = "black";

        System.out.println(nb1.toString());
        System.out.println(nb2.toString());
        System.out.println(nb3.toString());
        System.out.println(nb4.toString());

        System.out.println(nb1 == nb4);
        System.out.println(nb1.equals(nb4));
        var laptops = new HashSet<Notebook>(Arrays.asList(nb1, nb2, nb3, nb4));
        System.out.println(laptops.contains(nb4));
    }
}
