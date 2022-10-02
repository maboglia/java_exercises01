package week4;

import java.util.ArrayList;

/**
 * Created by mauro on 29/06/16.
 */

class Persona {

    private String nome;
    private String cognome;
}

public class ClasseDoppia {

    public static void main(String[] args) {

        ArrayList alObject = new ArrayList();

        alObject.add("peperino");
        alObject.add(new Persona());

        int x  = 5;
        Integer ix = x;//boxing

        int y = ix;//unboxing

        alObject.add(x);//x è stato trasformato automaticamente in un oggetto Integer (auto-boxing)

        Object oggetto = alObject.get(0);
        Persona p = null;

        for (int i = 0; i < alObject.size(); i++) {

            if (alObject.get(i) instanceof Persona){
                p = (Persona) alObject.get(i);
                System.out.println(p+ " è una persona");
            }
            else if (alObject.get(i) instanceof String){
                String s = (String) alObject.get(i);
                if (s.contains("ape"))
                System.out.println(s + " contiene ape");
            }
            else
                System.out.println(alObject.get(i) + " non è una persona");
        }





    }




}
