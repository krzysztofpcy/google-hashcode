class AlgorithmA implements Algorithm {
    
    @Override
    String getName() {
        return 'A'
    }
    
    @Override
    List<LibraryOutput> getLibraries(List<Library> libraries, int days) {
        return []
    }
}
