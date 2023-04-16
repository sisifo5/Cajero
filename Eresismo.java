package puno;

import java.util.Scanner;

public abstract class Eresismo {

    //FUNCIONES PRINCIPALES
    //v1=transacciones, v2=retiro, v3=depopsito 
    protected int v1, v2, v3;

    //alucion al saldo 
    private static int v5;
    Scanner in = new Scanner(System.in);

    public void Op() {

        int flag = 0;
        int sele = 0;

        //haz
        do {
            do {
                System.out.println("---------------------");
                System.out.println("    Selecionar opcion");
                System.out.println(" 1.Consulta          ");
                System.out.println(" 2.Retiro            ");
                System.out.println(" 3.Deposito          ");
                System.out.println(" 4.Salir             ");
                System.out.println("---------------------");
                sele = in.nextInt();
                //menu 
                if (sele >= 1 && sele <= 4) {
                    flag = 1;

                } else {

                    System.out.println("----------------");
                    System.out.println("No abable option");
                    System.out.println("   e r r o r    ");
                    System.out.println("----------------");

                }
                //mientras haces esto
            } while (flag == 0);
            //validamos la eleción del usuario

            if (sele == 1) {

                Eresismo msj = new Consult();
                msj.Tra();
            } else if (sele == 2) {

                Eresismo msj = new Reti();
                msj.Tra();
            } else if (sele == 3) {

                Eresismo msj = new Depos();
                msj.Tra();
            } else if (sele == 4) {

                System.out.println("-------");
                System.out.println("-Adios-");
                System.out.println("-------");
                flag = 2;

            }
        } while (flag != 2);
    }

    //creacion de metodo retiro
    public void Ret() {

        v2 = in.nextInt();

    }

    //creacion del metodo deposito
    public void Dep() {

        v3 = in.nextInt();

    }

    public abstract void Tra();

    //este metodo nos permitre el acceso a una variable encapsulada
    public int getv5() {

        return v5;
    }

    /*variable de ambito local tiene el mismo nombre define el comportamiento de 
    los parametros*/
    public void setv5(int v5) {

        this.v5 = v5;

    }
}
