package TercerEjemplo;

public class HiloMain {

    public static void main(String[] args) {
        Thread hilo1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hilo 1: " + i);
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    System.out.println("Error: " + e);
                }
            }
        });
        Thread hilo2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hilo 2: " + i);
                try {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e){
                    System.out.println("Error: " + e);
                }
            }
        });

        hilo1.start();
        hilo2.start(); //Hasta aqui van a la par.

        try {
            hilo1.join();
            hilo2.join();
        }
        catch (InterruptedException e){
            System.out.println("Error: " + e);
        }


    }
}