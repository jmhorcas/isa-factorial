package isa;

import isa.factorial.Factorial;
import isa.factorial.design_patterns.FactorialImplSingleton;

public class MainSingleton {

    public static void main(String[] args) {

        System.out.println("=== CALCULADORA DE FACTORIAL ===");

        if (args.length != 1) {
            System.err.println("Uso: java Main <numero>");
            System.exit(1);
        }

        try {
            int n = Integer.parseInt(args[0]);

            Factorial factorial = FactorialImplSingleton.getInstance();
            long result = factorial.fact(n);

            System.out.println(n + "! = " + result);

        } catch (NumberFormatException e) {
            System.err.println("Error: Debe introducir un número entero.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}