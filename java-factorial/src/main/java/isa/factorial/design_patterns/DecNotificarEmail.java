package isa.factorial.design_patterns;

import isa.factorial.Factorial;

public class DecNotificarEmail extends BaseDecorator {

    public DecNotificarEmail(Factorial factorial) {
        super(factorial);
    }

    @Override
    public void execute(long resultado) {
       System.out.println("Enviar por email resultado " + resultado);
    }

}
