# 🧪 Projeto: Testes Unitários com JUnit - Calculadora Científica

Este repositório contém um projeto Java simples que implementa uma **calculadora científica** e seus respectivos **testes automatizados utilizando JUnit 5**.

O objetivo principal é aplicar boas práticas de testes unitários, como:

- Nomeação clara e descritiva dos testes
- Organização dos testes por comportamento
- Separação de cenários de sucesso (Happy Path) e exceções
- Uso de anotações como `@BeforeEach`, `@AfterEach`, `@DisplayName`
- Cobertura de diferentes tipos de funções: básicas, científicas e trigonométricas

---

## 🛠 Tecnologias utilizadas

- Java 21
- JUnit 5 (Jupiter)
- IntelliJ IDEA 

---

## 📁 Estrutura do projeto

📦 src
┣ 📂 praticandotestes
┃ ┗ 📜 ScientificCalculator.java
┣ 📂 test
  ┗ 📜 ScientificCalculatorTest.java

---

## ✅ Funcionalidades testadas

### 🧮 Operações Matemáticas Básicas
- Soma (`add`)
- Subtração (`subtract`)

### 📐 Funções Científicas
- Raiz quadrada (`squareRoot`)
- Logaritmo natural (`log`)

### 🧭 Funções Trigonométricas
- Seno (`sin`)

### ⚠️ Tratamento de Erros
- Exceção para raiz quadrada de número negativo
- Exceção para divisão por zero

---

## 🧪 Exemplos de testes

```
@Test
void deveRetornarARaizQuadradaCorretaQuandoNumeroForPositivo() {
    double resultado = calculadora.squareRoot(16);
    assertEquals(4, resultado, 0.0001);
}

@Test
void deveLancarExcecaoQuandoDivisorForZero() {
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        calculadora.divide(9, 0);
    });
    assertEquals("Division by zero", exception.getMessage());
}
````

---

## 📌 Organização dos testes
Os testes foram agrupados conforme seu comportamento, utilizando comentários seccionais para facilitar a leitura e manutenção:

Testes de operações matemáticas básicas

Testes de funções ciêntificas (como raiz quadrada e logaritmo)

Testes de exceções

Testes trigonométricos

---

## 🚀 Como executar os testes

### 1. Clone o repositório:
```
git clone https://github.com/AlefSillva/TesteUnitarios_JAVA_TP1.git
```
### 2. Abra o projeto em sua IDE preferida.

### 3. Execute os testes da classe ScientificCalculatorTest.

---

## 🧠 Autor
Feito por Alef Silva Santos, como parte do trabalho prático da disciplina de **Desenvolvimento de Serviços Web e Testes com Java** do curso de **Análise e Desenvolvimento de Sistemas** no **Instituto Infnet**.



