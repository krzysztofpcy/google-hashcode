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
        int daysToScore = booksPerDay * Math.max(1, (days / 5) as int) as int
        int booksScore = books.subList(0, Math.min(books.size(), daysToScore)).sum { it.score } as int
        return booksScore / signupDays
    }
    
}
