import spock.lang.Unroll

class BooksSpec extends AlgorithmSpec {

    static def testData = [
            loadTest('a_example.txt'),
            loadTest('b_read_on.txt'),
            loadTest('c_incunabula.txt'),
            loadTest('d_tough_choices.txt'),
            loadTest('e_so_many_books.txt'),
            loadTest('f_libraries_of_the_world.txt')
    ]

    static def algorithms = [
            new AlgorithmA(),
            new AlgorithmB(),
            new AlgorithmC(),
//            new AlgorithmD(),
    ]

    @Unroll
    def '#algorithm.name - #data.days'() {
        when:
            List<Library> libraries = algorithm.getLibraries(data.libraries, data.days)

        then:
            println "${algorithm.name.substring(0, 4)}:\t${score(libraries, data, filename)}"

        where:
            data            | algorithm     | filename
            testData[0]     | algorithms[2] | 'a_result_example.txt'
            testData[1]     | algorithms[2] | 'b_result_read_on.txt'
            testData[2]     | algorithms[2] | 'c_result_incunabula.txt'
            testData[3]     | algorithms[2] | 'd_result_tough_choices.txt'
            testData[4]     | algorithms[2] | 'e_result_so_many_books.txt'
            testData[5]     | algorithms[2] | 'f_result_libraries_of_the_world.txt'
//            testData[0]     | algorithms[0]
//            testData[0]     | algorithms[1]
//            testData[0]     | algorithms[2]
//            testData[0]     | algorithms[3]
//            testData[1]     | algorithms[0]
//            testData[1]     | algorithms[1]
//            testData[1]     | algorithms[2]
//            testData[1]     | algorithms[3]
//            testData[2]     | algorithms[0]
//            testData[2]     | algorithms[1]
//            testData[2]     | algorithms[2]
//            testData[2]     | algorithms[3]
//            testData[3]     | algorithms[0]
//            testData[3]     | algorithms[1]
//            testData[3]     | algorithms[2]
//            testData[3]     | algorithms[3]
//            testData[4]     | algorithms[0]
//            testData[4]     | algorithms[1]
//            testData[4]     | algorithms[2]
//            testData[4]     | algorithms[3]
    }

}
