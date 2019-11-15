package repaso_examen;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author dam2
 */
public class Repaso_Examen extends Thread {

    String nome;

    public Repaso_Examen(String nome) {
        super(nome);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 8; i++) {
            System.out.println(i + ": " + getName());
            int tiempo=(int)(Math.random() * 1000 + 1);
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(Repaso_Examen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Repaso_Examen h1 = new Repaso_Examen("A");
        Repaso_Examen h2 = new Repaso_Examen("B");
        Repaso_Examen h3 = new Repaso_Examen("C");
        h1.start();
        h1.join();
        h2.start();
        h2.join();
        h3.start();
        h3.join();

        System.out.println("Thread main terminated");
    }

}