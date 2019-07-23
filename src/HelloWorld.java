import java.util.Arrays;
import java.util.Scanner;

/**
 * Je fais de la JavaDoc
 */
public class HelloWorld {
    public static void main(String[] args) {
//        enVrac();
//        partie1Exo1();
//        partie1Exo2();
//        partie1Exo3();
//        partie1Exo4();

//        variantesIncrementation();
//
//        bouclePourEcritureEquivalentes();
//        bouclePourAutreEcrituresPossibles();
//
//        declarationTableau();

        int tab[][] = {
                {1, 2, 3, 4, 5},
                {1, 2},
                {1},
                {}
        };

        for (int i = 0; i < tab.length; i ++) {
            System.out.println(
                    "La valeur n°" + (i + 1) + " (de la première dimension) contient " + tab[i].length + " valeurs");
        }
    }
    public static void maFonction(int a, int b) {
    }
    public static void maFonction(int titi) {
        maFonction(titi, 42);
    }

    public static int max(int a, int b) {
        int result;

        if (a > b) {
            result = a;
        } else {
            result = b;
        }

        return result;
//        return a > b ? a : b;
    }

    public static void declarationTableau() {
        int[] tab  = {1, 2, 3};
        int[] tab2 = new int[]{1, 2, 3};

        for (int valeur : tab) { /* code .. */ }
        for (int valeur : new int[] {1, 2, 3}) { /* code .. */ }

        // Ecritures strictement équivalentes :
        int[] a;
        int [] b;
        int []c;
        int[]d;
        int e[];  // La syntaxe la plus commune en Java.
        int f [];
    }

    private static void bouclePourAutreEcrituresPossibles() {
        for (int i = 0, j = 0; i < 10; i++, j = i ^ 2) {
            System.out.println(i + " au carré vaut " + j);
        }
        // ~Equivalent de:
        for (byte i = 0; i < 10; i++) {
            short j = (short) (i + 0x1); // La seule différence c'est qu'ici on redeclare la variable à chaque itération
            System.out.println(i + " au carré vaut " + j);
        }
        // ~Equivalent de (très mauvais code ici):
        int i = 0, j = 0;
        for (;;) {
            j = i ^ 2;
            System.out.println(i + " au carré vaut " + j);
            if (++i >= 10) {
                break;
            }
        }
    }

    private static void bouclePourEcritureEquivalentes() {
        // for ([<declarations>][<initialisations>];[<condition de fin (comme dans TANTQUE)];[<changements de valeurs>]) { }
        for (int i = 0; i < 10; ++ i) { }
        for (int i = 0; i < 10; i ++) { }
        for (int i = 0; i < 10; i += 1) { }
        for (int i = 0; i < 10; i = i + 1) { }

        // for (;;) { } => valide, mais autant faire un while (true)

        int i;

        // Sans redéclarer la variable.
        for (i = 0; i < 10; ++ i) { }

        // Quelques écritures un peu rares en Java (jugées abusives voire illisibles)
        for (; i < 10; ++ i) { }
        for (i = 0;; ++ i) {
            // code...
            if (i >= 10) {
                break; // Utilisation de break déconseillé pour sortir d'une boucle, surtout d'un for
            }
        }
        for (i = 0; i < 10;) {
            // code...
            ++ i;
        }
        i = 0;
        for (;;) {
            if (++ i >= 10) { // pre-incrementation + condition de fin.
                break;
            }
        }
    }

    private static void variantesIncrementation() {
        int i = 0;

        i = i + 1;
        i += 1;
        i ++;
        ++ i;
    }

    public static void partie1Exo1() {
        int a;
        int b;
        int c;

        a = 5;
        b = 3;
        c = a + b;
        a = 2;
        c = b - a;

        System.out.println("a vaut " + a + ", b vaut " + b + ", c vaut " + c);
    }

    public static void partie1Exo2() {
        int a = 2;
        int b = 432;
        int temporaire;

        temporaire = a;
        a = b;
        b = temporaire;
    }

    public static void partie1Exo3() {
        String a = "423";
        String b = "12";
//        String c = a / b; // => Error
        System.out.println("The operator / is undefined for the argument type(s) java.lang.String, java.lang.String");
    }

    public static void partie1Exo4() {
        String a = "423";
        String b = "12";
        String c = a + b;
        System.out.println("a + b = " + c); // 42312
    }

    public static void partie2Exo1() {
        float valeur;
        float valeurDouble;

        valeur = 231f;
        valeurDouble = valeur * 2;

        System.out.println(valeur);
        System.out.println(valeurDouble);

        // Affiche 231.0 puis (ligne suivante) 462.0
    }

    public static void partie2Exo2() {
        System.out.print("Saisir votre nom : ");

        Scanner scanner = new Scanner(System.in);
        String nom = scanner.nextLine();
        scanner.close();

        System.out.println("\nBonjour " + nom);
    }

    public static void partie3Exo1() {
        System.out.print("Saisir un nombre : ");
        Scanner scanner = new Scanner(System.in);
        float valeur = scanner.nextFloat();
        scanner.close();

        if (valeur < 0) {
            System.out.println("Négatif");
        } else if (valeur == 0) {
            System.out.println("Nul");
        } else {
            System.out.println("Positif");
        }
    }

    public static void partie3Exo2() {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        scanner.close();
        String categorie = "inconnue";

        switch (age) {
        case 6:
        case 7:
            categorie = "Poussin";
            break;
        }

        System.out.println("L'enfant fait partie de la catégorie " + categorie);
    }

    public static void enVrac() {
        int a = 3;
        int b, c;

        // System.out.println(b); // Plantage (error: variable b might not have been
        // initialized).

        b = a * 2;
        c = b;

        System.out.println(b);
        System.out.println(c);

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



    public static void rpgUneDimension() {
        int PVM = 0;
        int PVC = 1;
        int MM = 2;
        int MC = 3;

        int mesJoueurs[] = {
            // PVM, PVC,  MM,  MC
               200, 130, 120,  30, // Joueur 1
               220, 200,  20,  20, // Joueur 2
               160, 100, 200,  80  // Joueur 3
        };

        int nbAtt = 4;
        int jNb = 3;

        for (int jNum = 0; jNum < (jNb * nbAtt); jNum += nbAtt) {
            System.out.println(mesJoueurs[jNum + PVM]);
            System.out.println(mesJoueurs[jNum + PVC]);
            System.out.println(mesJoueurs[jNum + MM]);
            System.out.println(mesJoueurs[jNum + MC]);
        }
        // Ou (moins performant).
        for (int jNum = 0; jNum < jNb; jNum ++) {
            System.out.println(mesJoueurs[jNum * nbAtt + PVM]);
            System.out.println(mesJoueurs[jNum * nbAtt + PVC]);
            System.out.println(mesJoueurs[jNum * nbAtt + MM]);
            System.out.println(mesJoueurs[jNum * nbAtt + MC]);
        }
        // Ou (entre les deux).
        for (int jNum = 0, indice1InfoJoueur = 0; jNum < jNb; jNum ++, indice1InfoJoueur = jNum * nbAtt) {
            System.out.println(mesJoueurs[indice1InfoJoueur + PVM]);
            System.out.println(mesJoueurs[indice1InfoJoueur + PVC]);
            System.out.println(mesJoueurs[indice1InfoJoueur + MM]);
            System.out.println(mesJoueurs[indice1InfoJoueur + MC]);
        }
    }

    public static void rpgMultiDimension() {
        int PVM = 0;
        int PVC = 1;
        int MM = 2;
        int MC = 3;

        int mesJoueurs[][] = {
           // PVM, PVC,  MM,  MC
           {  200, 130, 120,  30 }, // Joueur 1
           {  220, 200,  20,  20 }, // Joueur 2
           {  160, 100, 200,  80 }  // Joueur 3
        };

        int nbAtt = 4;
        int jNb = 3;

        for (int joueur = 0; joueur < jNb; joueur ++) {
            for (int attribut = 0; attribut < nbAtt; attribut ++) {
                System.out.println(mesJoueurs[joueur][attribut]);
            }
        }
        // Ou (moins performant).
        for (int compteur = 0, joueur = 0, attribut = 0;
                joueur < jNb;
                compteur ++, joueur = compteur / jNb, attribut = compteur % jNb) {
            System.out.println(mesJoueurs[joueur][attribut]);
        }
        // Ou ("stupide" mais efficace).
        for (int joueur = 0; joueur < jNb; joueur ++) {
            System.out.println(mesJoueurs[joueur + PVM]);
            System.out.println(mesJoueurs[joueur + PVC]);
            System.out.println(mesJoueurs[joueur + MM]);
            System.out.println(mesJoueurs[joueur + MC]);
        }
    }
}
