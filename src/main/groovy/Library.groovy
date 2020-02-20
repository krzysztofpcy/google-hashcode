class Library {

    int id
    int signupDays
    int booksPerDay
    List<Book> books
    
    Library sorted() {
        new Library(
                id: id,
                signupDays: signupDays,
                booksPerDay: booksPerDay,
                books: books.sort()
        )
    }
    
    int score(days) {
        int daysToScore = booksPerDay * (days / 10)
        int booksScore = books.subList(0, Math.min(books.size(), daysToScore)).sum { it.score } as int
        return booksScore / signupDays
    }
    
}
