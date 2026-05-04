package isa.factorial.design_patterns;

import isa.factorial.Factorial;

public class FactorialImplSingleton implements Factorial {

    private static FactorialImplSingleton instance;
    
    private FactorialImplSingleton() {

    }

    public static FactorialImplSingleton getInstance() {
        if (instance == null) {
            instance = new FactorialImplSingleton();
        }
        return instance;
    }

    @Override
    public long fact(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Error: n negativo. El número debe ser >= 0.");
        }

        return (n > 0) ? n * fact(n - 1) : 1;
    }
}