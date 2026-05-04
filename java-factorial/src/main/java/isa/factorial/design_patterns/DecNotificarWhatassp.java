package isa.factorial.design_patterns;

import isa.factorial.Factorial;

public class DecNotificarWhatassp extends BaseDecorator {

    public DecNotificarWhatassp(Factorial factorial) {
        super(factorial);
    }

    @Override
    public void execute(long resultado) {
       System.out.println("Enviar por WhatsApp resultado " + resultado);
    }

}
