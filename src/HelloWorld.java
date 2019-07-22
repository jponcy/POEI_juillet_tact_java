import java.util.Scanner;

/**
 * Je fais de la JavaDoc
 */
@SuppressWarnings("all")
public class HelloWorld {
    public static void main(String[] args) {
        int a = 3;
        int b, c;

        // System.out.println(b); // Plantage (error: variable b might not have been
        // initialized).

        b = a * 2;
        c = b;

        System.out.println(b);

        // Je commente une ligne.
        /*
         * La, j'ai beaucoup de choses a dire
         *
         * et j'ai envie d'a e re r
         *
         * donc j'ai fais du multi-lignes.
         */
        System.out.println("Hello world!");

        System.out.print("Hello");
        System.out.print(" ");
        // System.out.println("world!");
        // ou
        System.out.print("world!\n");

        System.out.println(12L / 7L);
        System.out.println(12L / 7f);
        System.out.println(12.0 / 7L);

        System.out.println(32 + 40); // 72
        System.out.println(032 + 040); // 58
        System.out.println(011 + 024); // 29
        System.out.println(010); // 8
        System.out.println(0x14 + 0x10); // 36
        System.out.println(0b10 + 0b11); // 5
        System.out.println(0x1A / 0b10); // 13

        // Saisies.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir votre nom : ");
        String nom = scanner.nextLine();
        System.out.print("Saisir votre prénom : ");
        String prenom = scanner.nextLine();
        System.out.println("Bonjour " + prenom + " " + nom.toUpperCase());
        scanner.close();

        // Integer i = new Integer(5);
        Integer i = 5;
        i = null;

        String s1 = "a", s2 = "a";

        boolean egaux;

        egaux = s1 == s2; // Test si s1 et s2 pointent vers la même valeurs en RAM.
        egaux = s1.equals(s2); // Test si s1 et s2 ont la même valeur ("a").

        if (egaux)
            // Une seule ligne, donc écriture sans accolades permise.
            System.out.println("s1 et s2 sont égaux");
        else
            System.out.println("s1 et s2 sont différents");

        // Ecriture a privilegier.
        if (egaux) {
            System.out.println("s1 et s2 sont égaux");
        } else {
            System.out.println("s1 et s2 sont différents");
        }

        a = 3;

        if (a > 0) {
            System.out.println("> 0");
        } else {
            if (a == 0) {
                System.out.println("= 0");
            } else {
                System.out.println("< 0");
            }
        }
        // Strict equivalent.
        if (a > 0) {
            System.out.println("> 0");
        } else if (a == 0) {
            System.out.println("= 0");
        } else {
            System.out.println("< 0");
        }
    }
}
