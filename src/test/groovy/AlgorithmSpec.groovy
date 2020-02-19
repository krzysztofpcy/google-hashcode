import spock.lang.Specification

import java.nio.file.Path
import java.nio.file.Paths

import static java.lang.ClassLoader.getSystemResource

class AlgorithmSpec extends Specification {
    
    static TestData loadTest(String filename) {
        Path filePath = Paths.get(getSystemResource(filename).toURI());
        Scanner scanner = new Scanner(filePath);
        
        int maxSlices = scanner.nextInt()
        int pizzas = scanner.nextInt()
        
        Collection<Integer> slices = new ArrayList<>(pizzas)
        pizzas.times { slices.add(scanner.nextInt()) }
        
        Collection<Integer> expectedPizzas = new ArrayList<>()
        while (scanner.hasNext()) {
            expectedPizzas.add(scanner.nextInt());
        }
        
        return new TestData().tap {
            it.name = filename
            it.maxSlices = maxSlices
            it.slices = slices
            it.expectedPizzas = expectedPizzas
        }
    }
    
    static class TestData {
    
        String name
        int maxSlices
        Collection<Integer> slices
        Collection<Integer> expectedPizzas
    
    }
    
}
