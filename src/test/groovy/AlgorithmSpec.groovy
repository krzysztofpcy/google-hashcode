import spock.lang.Specification

import java.nio.file.Path
import java.nio.file.Paths

import static java.lang.ClassLoader.getSystemResource

class AlgorithmSpec extends Specification {
    
    static Input loadTest(String filename) {
        Path filePath = Paths.get(getSystemResource(filename).toURI());
        Scanner scanner = new Scanner(filePath);
        
        int booksCount = scanner.nextInt()
        int librariesCount = scanner.nextInt()
        int daysToScan = scanner.nextInt()
        
        List<Book> books = new ArrayList<>(booksCount)
        booksCount.times { books.add(new Book(id: it, score: scanner.nextInt()))}
        
        List<Library> libraries = new ArrayList<>(librariesCount)
        librariesCount.times { libraries.add(loadLibrary(scanner, books)) }
        
        return new Input(libraries: libraries, days: daysToScan)
    }
    
    static Library loadLibrary(Scanner scanner, List<Book> books) {
        int booksCount = scanner.nextInt()
        int signupDays = scanner.nextInt()
        int booksPerDay = scanner.nextInt()
    
        List<Book> booksInLibrary = new ArrayList<>(booksCount)
        booksCount.times { booksInLibrary.add(books.get(scanner.nextInt())) }
        
        return new Library().tap {
            it.signupDays = signupDays
            it.booksPerDay = booksPerDay
            it.books = booksInLibrary
        }
    }
    
    static int score(List<Library> libraries) {
        return 0
    }
    
    
}
