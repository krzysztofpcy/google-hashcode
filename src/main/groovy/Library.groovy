class Library {
    
    int signupDays
    int booksPerDay
    List<Book> books
    
    Library sorted() {
        new Library(
                signupDays: signupDays,
                booksPerDay: booksPerDay,
                books: books.sort()
        )
    }
    
}
