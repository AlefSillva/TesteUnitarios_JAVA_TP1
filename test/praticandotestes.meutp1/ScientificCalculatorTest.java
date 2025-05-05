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

    //------------------------ Testes de operações matemáticas básicas ------------------------//

    @DisplayName("Testando o método de soma")
    @Test
    void deveRetornarSomaCorretaQuandoAdicionarDoisNumeros() {
        double resultado = calculadora.add(1,2);;

        assertEquals(3, resultado);
    }

    @DisplayName("Testando o método de subtração")
    @Test
    void deveRetornarSubtracaoCorretaQuandoAdicionarDoisNumeros() {
        // 1. Setup: configuração do cenário de teste
        // Removi a instância da calculadora, pois ela já é criada no método setUp()

        // 2. Execution: chamada do método a ser testado
        double resultado = calculadora.subtract(5, 3);

        // 3. Assertion: comparação do resultado esperado com o resultado obtido
        assertEquals(2, resultado);

        // 4. Cleanup: não é necessário neste caso, pois o método tearDown() já é chamado após cada teste
    }

    //------------------------ Testes de operações matemáticas avançadas ------------------------//

    @DisplayName("Testando o método de raiz quadrada com número positivo")
    @Test
    void deveRetornarARaizQuadradaCorretaQuandoNumeroForPositivo() {
        double resultado = calculadora.squareRoot(16);

        assertEquals(4, resultado, 0.0001);
    }

    @DisplayName("Testando o método de Log() com número positivo")
    @Test
    void deveRetornarLogCorretoQuandoNumeroForPositivo() {
        double resultado = calculadora.log(10);
        double resultEsperado = Math.log(10);
        assertEquals(resultEsperado, resultado, 0.0001);

    }

    //------------------------ Testes de exceções e erros ------------------------//

    @DisplayName("Testando o método de raiz quadrada com número negativo")
    @Test
    void deveLancarExcecaoQuandoNumeroForNegativo() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.squareRoot(-4);
        });

        assertEquals("Negative number", exception.getMessage());
    }

    @DisplayName("Testando divisão por zero")
    @Test
    void deveLancarExcecaoQuandoDivisorForZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.divide(9, 0);
        });
        assertEquals("Division by zero", exception.getMessage());
    }


    //------------------------ Testes de funções trigonométricas ------------------------//

    @DisplayName("Testando o método sin() com número positivo")
    @Test
    void deveRetornarSenoCorretoQuandoNumeroForPositivo() {
        double seno = calculadora.sin(30);
        double resultEsperado = Math.sin(Math.toRadians(30));
        assertEquals(resultEsperado, seno, 0.0001);
    }


}