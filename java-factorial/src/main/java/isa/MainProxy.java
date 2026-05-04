package isa;

import isa.factorial.Factorial;
import isa.factorial.design_patterns.*;

public class MainProxy {

    public static void main(String[] args) {

        System.out.println("=== CALCULADORA DE FACTORIAL ===");

        if (args.length != 1) {
            System.err.println("Uso: java Main <numero>");
            System.exit(1);
        }

        try {
            int n = Integer.parseInt(args[0]);

            Factorial factorial = FactorialImplSingleton.getInstance();
            ProxyFactorial factProxy = new ProxyFactorial(factorial);
            
            long result = factProxy.fact(n);

            System.out.println(n + "! = " + result);
            System.out.println("Número de ejecuciones: " + factProxy.getExecutionCount());

        } catch (NumberFormatException e) {
            System.err.println("Error: Debe introducir un número entero.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}