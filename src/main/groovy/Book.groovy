class Book implements Comparable<Book> {
    
    int id
    int score
    
    @Override
    int compareTo(Book o) {
        return Integer.compare(o.score, score)
    }
}
