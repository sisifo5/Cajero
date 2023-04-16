package puno;

/**
 *
 * @author paranoidandroid
 */
public class Depos extends Eresismo {

    @Override
    public void Tra() {
        System.out.println("Deposita tu dinero");
        System.out.println("Cuanto deseas depositar:");
        Dep();
        
        v1 = getv5();
        setv5(v1 + v3);
        System.out.println("Depositaste:" + v3);
        System.out.println("Tu saldo es " + getv5());
        

    }

}
