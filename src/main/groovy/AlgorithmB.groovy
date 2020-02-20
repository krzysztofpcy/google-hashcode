import java.util.stream.Collectors

class AlgorithmB implements Algorithm {
    
    @Override
    String getName() {
        return 'improved sort'
    }
    
    @Override
    List<Library> getLibraries(List<Library> libraries, int days) {
        return libraries.stream()
                .map { it.sorted() }
                .sorted(new SimpleComparator())
                .collect(Collectors.toList())
    }
    
    class SimpleComparator implements Comparator<Library> {
        
        @Override
        int compare(Library a, Library b) {
    
            int aScore = a.books.subList(0, Math.min(a.books.size(), a.booksPerDay)).sum { it.score } as int
            int bScore = b.books.subList(0, Math.min(b.books.size(), b.booksPerDay)).sum { it.score } as int
            
            return Integer.compare(bScore, aScore)
        }
    }
    
}
