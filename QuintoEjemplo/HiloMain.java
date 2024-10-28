package QuintoEjemplo;

import java.util.SortedMap;

public class HiloMain {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();

        Thread productor = new Thread(() ->{
            try {
                int valor = 1;
                boolean salir = false;

                while (!salir) {
                    almacen.producir(valor);
                    valor++;
                    Thread.sleep(1000);

                    if (valor == 20)
                        salir =true;
                }
            }
            catch (InterruptedException e){
                System.out.println("Error: " + e);
            }
        });
        Thread consumidor = new Thread(() ->{
            try {
                int valor = 1;

                while (true) {
                    almacen.producir(valor);
                    valor++;
                    Thread.sleep(1000);
                }
            }
            catch (InterruptedException e){
                System.out.println("Error: " + e);
            }
        });

        productor.start();
        consumidor.start();
    }

}
