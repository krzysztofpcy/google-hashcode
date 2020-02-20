import java.util.stream.Collectors

class AlgorithmD implements Algorithm {
    
    @Override
    String getName() {
        return 'cool'
    }
    
    @Override
    List<Library> getLibraries(List<Library> libraries, int days) {
        List<Library> sorted = libraries.stream()
                .map { it.sorted() }
                .sorted(new SimpleComparator(days: days))
                .collect(Collectors.toList())
    
    
        Set<Book> books = new HashSet<>()
        sorted.forEach { books.addAll(it.books) }
    
//        books.forEach {
//            boolean found = false;
//            for(int i = 0; i < Integer.MAX_VALUE; i++) {
//                for(int j = 0; j < sorted.size(); j++) {
//                    if(sorted[j].books.size() < i) {
//                        if(sorted[j].books[i].id == it.id) {
//                            if(found) {
//                                sorted[j].books.remove(i)
//                            } else {
//                                found = true;
//                            }
//                        }
//                    }
//                }
//            }
//        }
        
        return sorted
    }
    
    class SimpleComparator implements Comparator<Library> {
        
        int days
        
        @Override
        int compare(Library a, Library b) {
            return Integer.compare(b.score(days), a.score(days))
        }
    }
    
}
