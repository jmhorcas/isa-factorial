package isa.factorial.design_patterns;

import isa.factorial.Factorial;

public class ProxyFactorial implements Factorial {

    private Factorial f;
    private int executionCount;
    
    public ProxyFactorial(Factorial factorial) {
        this.f = factorial;
        this.executionCount = 0;
    }

    @Override
    public long fact(int n) {
        executionCount++;
        return f.fact(n);
    }

    public int getExecutionCount() {
        return executionCount;
    }

}
