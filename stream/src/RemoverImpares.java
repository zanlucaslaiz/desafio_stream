import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RemoverImpares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = new ArrayList<>(numeros);

        numerosPares.removeIf(n -> n % 2 !=0);
        System.out.println(numerosPares);
    }
}
