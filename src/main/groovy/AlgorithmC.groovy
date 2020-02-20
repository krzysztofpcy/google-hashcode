import java.util.stream.Collectors

class AlgorithmC implements Algorithm {
    
    @Override
    String getName() {
        return 'cool'
    }
    
    @Override
    List<Library> getLibraries(List<Library> libraries, int days) {
        return libraries.stream()
                .map { it.sorted() }
                .sorted(new SimpleComparator(days: days))
                .collect(Collectors.toList())
    }
    
    class SimpleComparator implements Comparator<Library> {
        
        int days
        
        @Override
        int compare(Library a, Library b) {
            return Integer.compare(b.score(days), a.score(days))
        }
    }
    
}
