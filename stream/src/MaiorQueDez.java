import java.util.Arrays;
import java.util.List;

public class MaiorQueDez {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean maiorDez = numeros.stream().anyMatch(n -> n > 10);
        System.out.println(maiorDez);
    }
}
