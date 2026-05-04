package isa.factorial.bdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import isa.factorial.Factorial;
import isa.factorial.FactorialImpl;

public class FactorialSteps {

    private Factorial factorial;
    private int input;
    private long resultado;
    private boolean exceptionThrown;
    
    @Given("tengo una calculadora de factorial")
    public void tengo_una_calculadora_de_factorial() {
        factorial = new FactorialImpl();
    }
    @Given("el usuario ingresa el número {int}")
    public void el_usuario_ingresa_el_número(Integer int1) {
        input = int1;
    }

    @When("calculo el factorial")
    public void calculo_el_factorial() {
        try {
            resultado = factorial.fact(input);
            exceptionThrown = false;
        } catch (IllegalArgumentException e) {
            exceptionThrown = true;
        }
    }

    @Then("el resultado debe ser {int}")
    public void el_resultado_debe_ser(long int1) {
        assertEquals(int1, resultado);
    }

    @Then("debe lanzarse una excepción")
    public void debe_lanzarse_una_excepción() {
        assertTrue(exceptionThrown);
    }
}
