import spock.lang.Unroll

class PizzaSpec extends AlgorithmSpec {
    
    static def testData = [
            loadTest('a_example.in'),
            loadTest('b_small.in')
    ]
    
    static def algorithms = [
            new PizzaAlgorithmA(),
            new PizzaAlgorithmB()
    ]
    
    @Unroll
    def '#algorithm.name - #data.name'() {
        when:
            def pizzas = algorithm.getPizzas(data.slices, data.maxSlices)
        
        then:
            pizzas == data.expectedPizzas
    
        where:
            data << testData
            algorithm << algorithms
    }
    
}
