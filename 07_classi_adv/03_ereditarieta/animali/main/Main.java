package week4.animali.main;

import week4.animali.mammiferi.Cane;
import week4.animali.mammiferi.Gatto;

import java.util.Scanner;

/**
 * Created by mauro on 30/06/16.
 */
public class Main {

    public static void main(String[] args) {
        Cane kant = new Cane();
        Gatto mau = new Gatto();

        Scanner sc = new Scanner(System.in);

        kant.setGenere("canis");
        kant.setSpecie("lupus");

        mau.setGenere("felinux");
        mau.setSpecie("bastardus");
        System.out.println();
        System.out.println("di che razza è il cane?");
        kant.setRazza(sc.nextLine());

        System.out.println("dove è nato il cane?");
        kant.setProvenienza(sc.nextLine());

        System.out.println("quando è nato il cane?");
        kant.setAnno(Integer.parseInt(sc.next()));
        System.out.println("---------");
        System.out.println("I dati del tuo cane:");
        System.out.println(kant.getGenere());
        System.out.println(kant.getSpecie());
        System.out.println(kant.getRazza());
        System.out.println(kant.getProvenienza());
        System.out.println(kant.getAnno());
        System.out.println(kant.partorisce());
        System.out.println(kant.emetteSuoni());

        System.out.println("I dati del tuo gatto:");
        System.out.println(mau.getGenere());
        System.out.println(mau.getSpecie());
        System.out.println(mau.partorisce());
        System.out.println(mau.emetteSuoni());
    }


}
