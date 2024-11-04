import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Main class that provides a method to generate all unique combinations of a
 * specified length
 * from a list of strings. The main method demonstrates this by calling the
 * combinar method
 * with various lengths.
 */
public class Main {

    /**
     * Generates all unique combinations of the specified length from a list of
     * strings.
     * Each combination consists of unique elements from the input list, avoiding
     * repetition
     * of any single element within a combination.
     *
     * @param longitud The desired length of each combination.
     * @param numeros  The list of strings to combine.
     * @return A list of all unique combinations of the specified length, using the
     *         input elements.
     */
    static List<String> combinar(int longitud, List<String> numeros) {
        List<String> result = new ArrayList<>();

        // Base case: return an empty list if the desired length is zero
        if (longitud == 0) {
            return result;
        }
        // Base case: if the length is one, simply return the original list of elements
        if (longitud == 1) {
            return numeros;
        }

        // Recursive call to get all combinations of the specified length minus one
        List<String> sublista = combinar(longitud - 1, numeros);

        // Iterate over each element in the original list and append unique combinations
        for (String numero : numeros) {
            X: for (String numeroCombinado : sublista) {
                // Check each character to ensure no repetition of elements within the
                // combination
                for (int i = 0; i < numeroCombinado.length(); i++) {
                    if (numero.charAt(0) == numeroCombinado.charAt(i)) {
                        continue X; // Skip combinations containing duplicate elements
                    }
                }
                result.add(numero + numeroCombinado); // Add valid combination to the result
            }
        }
        return result;
    }

    /**
     * Main method that demonstrates the combination generation by calling the
     * combinar method
     * with different lengths and printing the results.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        List<String> numeros = Arrays.asList("0", "1", "2");

        // Generate and print combinations of various lengths
        System.out.println(combinar(3, numeros)); // Length 3 combinations
        System.out.println(combinar(2, numeros)); // Length 2 combinations
        System.out.println(combinar(4, numeros)); // Length 4 combinations (exceeds input size)
        System.out.println(combinar(1, numeros)); // Length 1 combinations
        System.out.println(combinar(0, numeros)); // Length 0 combinations (empty)
    }
}
