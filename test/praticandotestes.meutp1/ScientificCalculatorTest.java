package praticandotestes.meutp1;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class ScientificCalculatorTest {
    private ScientificCalculator calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new ScientificCalculator();
        System.out.println("Iniciando teste...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Concluindo teste...");
        calculadora = null;
    }

    @DisplayName("Testando o método de soma")
    @Test
    void testAddition() {
        double resultado = calculadora.add(1,2);;

        assertEquals(3, resultado);
    }

    @DisplayName("Testando o método de subtração")
    @Test
    void testSubtraction() {
        // 1. Setup: configuração do cenário de teste
        // Removi a instância da calculadora, pois ela já é criada no método setUp()

        // 2. Execution: chamada do método a ser testado
        double resultado = calculadora.subtract(5, 3);

        // 3. Assertion: comparação do resultado esperado com o resultado obtido
        assertEquals(2, resultado);

        // 4. Cleanup: não é necessário neste caso, pois o método tearDown() já é chamado após cada teste
    }

    @DisplayName("Testando o método de raiz quadrada com número positivo")
    @Test
    void testSquareRootPositive() {
        double resultado = calculadora.squareRoot(16);

        assertEquals(4, resultado);
    }

    @DisplayName("Testando o método de raiz quadrada com número negativo")
    @Test
    void testSquareRootNegative() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.squareRoot(-4);
        });

        assertEquals("Negative number", exception.getMessage());
    }

    @DisplayName("Testando divisão por zero")
    @Test
    void testDivideByZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.divide(9, 0);
        });
        assertEquals("Division by zero", exception.getMessage());
    }

}