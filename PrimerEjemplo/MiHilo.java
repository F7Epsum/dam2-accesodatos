package PrimerEjemplo;

public class MiHilo extends Thread {

    //run() funcion que ejecuta lo del hilo
    //sleep() --> hay que pasarle variable en segundos. 1000ms (1s)
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hilo " + i);

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("Error: " +e);
            }

        }
    }

}