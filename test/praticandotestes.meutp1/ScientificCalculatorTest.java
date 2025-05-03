package praticandotestes.meutp1;
import org.junit.jupiter.api.*;

class ScientificCalculatorTest {

    @DisplayName("Testando o método de soma")
    @Test
    void testAddition() {
        ScientificCalculator calculadora = new ScientificCalculator();
        double resultado = calculadora.add(1,2);;
        Assertions.assertEquals(3, resultado);
    }

    @DisplayName("Testando o método de subtração")
    @Test
    void testSubtraction() {
        // 1. Preparação: Configuração do ambiente de teste
        ScientificCalculator calculadora = new ScientificCalculator();

        // 2. Execução: Chamada do método a ser testado
        double resultado = calculadora.subtract(5,3);

        // 3. Verificação: Comparação do resultado esperado com o resultado obtido
        Assertions.assertEquals(2, resultado);
    }
}