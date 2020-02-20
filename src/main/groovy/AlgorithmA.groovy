import java.util.stream.Collectors

class AlgorithmA implements Algorithm {

    @Override
    String getName() {
        return 'simple sort'
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
            return Integer.compare(b.books.first().score, a.books.first().score)
        }
    }

}
