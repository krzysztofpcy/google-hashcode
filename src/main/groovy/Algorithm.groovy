interface Algorithm {
    
    String getName()
    List<LibraryOutput> getLibraries(List<Library> libraries, int days);
    
}