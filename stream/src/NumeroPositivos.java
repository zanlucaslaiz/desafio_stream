import java.util.Arrays;
import java.util.List;

public class NumeroPositivos {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosPositivos = numeros.stream().filter(n -> n > 0).toList();
        System.out.println(numerosPositivos); 
    }
    
}