/*Las clases (hijas) pueden cambiar la funcionalidad de los metodos de las clases
  (padre)
 */
package puno;

/**
 *
 * @author paranoidandroid
 */
public class Reti extends Eresismo {

    /*se sobre escribe*/
    @Override
    public void Tra() {
        System.out.print("Cuanto vaz a retirar");
        Ret();

        if (v2 <= getv5()) {
            v1 = getv5();
            setv5(v1 - v2);
            System.out.println("retiro:" + v2);
            System.out.println("Tu saldo es de: " + getv5());

        } else {
            System.out.println("------------------");
            System.out.println("Saldo insuficiente");
            System.out.println("------------------");
        }

    }

}
