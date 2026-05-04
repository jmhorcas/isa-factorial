package isa.factorial.design_patterns;

import java.math.BigInteger;

import isa.factorial.Factorial;

public class AdapterFactorial implements FactCalc {
    
    private int n;
    private Factorial f;

    public AdapterFactorial(Factorial fact) {
        this.f = fact;
    }

    @Override
    public BigInteger compute() {
        long res = f.fact(n);
        return BigInteger.valueOf(res);
    }

    @Override
    public void setNumber(int n) {
        this.n = n;
    }
}
