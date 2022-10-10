import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Orange o1 = new Orange(1.0, 1.0, 1);
        Orange o2 = new Orange(6.0, 1.0, 1);
        Orange o3 = new Orange(2.0, 1.4, 1);
        Orange[] basket = {o1, o2, o3};
        Arrays.sort(basket);
    System.out.println(Arrays.toString(basket));

    }
}
