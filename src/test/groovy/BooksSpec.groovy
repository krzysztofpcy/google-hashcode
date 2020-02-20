import spock.lang.Unroll

class BooksSpec extends AlgorithmSpec {

    static def testData = [
            loadTest('a_example.txt')
    ]

    static def algorithms = [
            new AlgorithmA()
    ]

    @Unroll
    def '#algorithm.name - #data.name'() {
        when:
            List<Library> libraries = algorithm.getLibraries(data.libraries, data.days)

        then:
        println score(libraries, data)

        where:
            data << testData
            algorithm << algorithms
    }

}
