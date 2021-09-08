package mundopc;

import com.mundopc.*;

public class MundoPC {

    public static void main(String[] args) {

        Monitor monitor1 = new Monitor("Samsung", 23);
        Raton raton1 = new Raton("USB", "Razer");
        Teclado teclado1 = new Teclado("USB", "Microsoft");
        Computadora computadora1 = new Computadora("Computadora Personalizada", monitor1, teclado1, raton1);

        Monitor monitor2 = new Monitor("HP", 34);
        Raton raton2 = new Raton("USB", "HyperX");
        Teclado teclado2 = new Teclado("USB", "Samsung");
        Computadora computadora2 = new Computadora("Computadora Personalizada 2", monitor2, teclado2, raton2);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);

        orden1.mostrarOrden();
    }
}
