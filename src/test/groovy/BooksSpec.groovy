import spock.lang.Unroll

class BooksSpec extends AlgorithmSpec {

    static def testData = [
            loadTest('a_example.txt'),
            loadTest('c_incunabula.txt'),
            loadTest('f_libraries_of_the_world.txt')
    ]

    static def algorithms = [
            new AlgorithmA(),
            new AlgorithmB(),
            new AlgorithmC(),
    ]

    @Unroll
    def '#algorithm.name - #data.name'() {
        when:
            List<Library> libraries = algorithm.getLibraries(data.libraries, data.days)

        then:
            println score(libraries, data)

        where:
            data            | algorithm
            testData[1]     | algorithms[0]
            testData[1]     | algorithms[1]
            testData[1]     | algorithms[2]
    }

}
