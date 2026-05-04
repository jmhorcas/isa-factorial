package isa.factorial.design_patterns;

import isa.factorial.Factorial;

public abstract class BaseDecorator implements Factorial {

    private Factorial f;
    
    public BaseDecorator(Factorial factorial) {
        this.f = factorial;
    }

    @Override
    public long fact(int n) {
        long result = f.fact(n);
        execute(result);
        return result;
    }

    public abstract void execute(long resultado);

    
    

}
