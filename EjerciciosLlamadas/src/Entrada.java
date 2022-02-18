import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Entrada {
    public static void main(String[] args) {
        Centralita centralita = new Centralita();
        LlamadasProvidencia llamada1 = new LlamadasProvidencia
                (6445,6646,30);
        LlamadaNacional llamadaNacional = new LlamadaNacional(46746,7987,10, 1 );
        LlamadasProvidencia llamadasProvidencia = new LlamadasProvidencia(46746,7987,20);

       centralita.agragarLlamada(llamada1);
       centralita.agragarLlamada(llamadaNacional);
       centralita.agragarLlamada(llamadasProvidencia);

       centralita.costeTotal();

    }


}
