import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class SomaDePares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        BinaryOperator<Integer> somar = Integer::sum;
        int resultado = numeros.stream().filter(n -> n % 2 == 0).reduce(0,somar);

        System.out.println(resultado);
    }
}
