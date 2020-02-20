interface Algorithm {
    
    String getName()
    List<Library> getLibraries(List<Library> libraries, int days);
    
}