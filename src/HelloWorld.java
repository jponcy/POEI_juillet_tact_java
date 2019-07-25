import java.util.Scanner;

import com.tactfactory.example.Voiture;

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

//        tableauLength();
//        prediction();
//        max();

//        System.out.println(purge("Bonjour", "jour"));
//        System.out.println(purge("J'ai horreur des espaces", " "));
//        System.out.println(purge("Immortel/invincible/nonMutable/brefLeMeilleur", "y"));
//
//        System.out.println(replace("Bonjour", "jour", "soir"));
//        System.out.println(replace("J'ai horreur des espaces", " ", "_"));
//        System.out.println(replace("Immortel/invincible/nonMutable/brefLeMeilleur", "y", "impossible"));

        Voiture voitures[] = new Voiture[] {
                new Voiture("Titine", "Mogito"),
                new Voiture("Tutur", "Mogito"),
                new Voiture()
        };

        for (Voiture v : voitures) {
            v.changerCouleur("rouge pomme fluo");
            v.afficherNbPortes();
        }

        // TODO: Créer la class K7
        // TODO: Essayer d'en manipuler 1
        // ...
    }

    public static void tableauLength() {
        int tab[][] = {
                {1, 2, 3, 4, 5},
                {1, 2},
                {1},
                {}
        };

        int max = 5;
        int tab3[] = new int[max];

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

    /**
     * Determination categorie avec un if (solution correcte).
     */
    public static void categorieEnfantV1() {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Quel âge à l'enfant ?");
        String ageSaisie = scanner.nextLine();
        scanner.close();
        int age = Integer.parseInt(ageSaisie);
        String categorie;

        if (age >= 6 && age <= 7) {
            categorie = "Poussin";
        } else if (age >= 8 && age <= 9) {
            categorie = "Pupille";
        } else if (age >= 10 && age <= 11) {
            categorie = "Minime";
        } else if (age >= 12) {
            categorie = "Cadet";
        } else {
            categorie = "Indéfinie";
        }

        System.out.println("L'enfant de " + age + " ans fait parti de la catégorie " + categorie);
    }

    /**
     * Determination categorie avec un switch (solution a privilegier dans le cas present).
     */
    public static void categorieEnfantV2() {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Quel âge à l'enfant ?");
        String ageSaisie = scanner.nextLine();
        scanner.close();
        int age = Integer.parseInt(ageSaisie);
        String categorie;

        if (age > 5) {
            switch (age) {
            case 6:
            case 7:
                categorie = "Poussin";
                break;
            case 8:
            case 9:
                categorie = "Pupille";
                break;
            case 10:
            case 11:
                categorie = "Minime";
                break;
            default:
                categorie = "Cadet";
                break;
            }
        } else {
            categorie = "Indéfinie";
        }

        System.out.println("L'enfant de " + age + " ans fait parti de la catégorie " + categorie);
    }

    /**
     * Determination categorie avec ternaire (abus des ternaires dans le cas present => complique a lire, pour rien).
     */
    public static void categorieEnfantV3() {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Quel âge à l'enfant ?");
        String ageSaisie = scanner.nextLine();
        scanner.close();
        int age = Integer.parseInt(ageSaisie);

        System.out.println("L'enfant de " + age + " ans fait parti de la catégorie "
                + (age <= 5
                    ? "Indéfinie"
                    : (age >= 6 && age <= 7
                        ? "Poussin"
                        : (age >= 8 && age <= 9
                            ? "Pupille"
                            : (age >= 10 && age <= 11
                                ? "Minime"
                                : "Cadet")))));
    }

    public static void prediction() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quelle heure est-il ?");
        int heures = scanner.nextInt();
        System.out.println("Combien de minutes ?");
        int minutes = scanner.nextInt();
        scanner.close();

        minutes ++;

        if (minutes >= 60) {
            heures ++;
            minutes = 0;

            if (heures >= 24) {
                heures = 0;
            }
        }

        // System.out.println("Dans 1 minute il sera " + heures + "h" + minutes);
        // String val = (heures < 10 ? "0" : "") + heures;

        String message = String.format("Dans 1 minute il sera %02dh%02d", heures, minutes);
        System.out.println(message);

//        System.out.println(String.format("%06.2f -- %g", 10000.3049, 10.3));
//        double i = 451515458541.78545848548485;
//        System.out.println(String.format("%f -- %g", i, i));
    }

    public static void validationDate() {
        int jour;
        int mois;
        int annee;
        boolean valide;
        Scanner scanner = new Scanner(System.in);

        // Saisies
        System.out.print("Saisir jour : ");
        jour = scanner.nextInt();
        System.out.print("Saisir mois : ");
        mois = scanner.nextInt();
        System.out.print("Saisir année : ");
        annee = scanner.nextInt();

        // Verifications.
        if (jour < 1 || mois < 1 || mois > 12) {
            valide = false;
        } else {
            if ((mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12)
                    && jour <= 31) {
                valide = true;
            } else if ((mois == 4 || mois == 6 || mois == 9 || mois == 11) && jour <= 30) {
                valide = true;
//            } else if (mois == 2 && annee % 4 == 0 && (!(annee % 100 == 0) || annee % 400 == 0) && jour <= 29) {
//                valide = true;
//            } else {
//                valide = mois == 2 && jour <= 28;
//            }
            // OU
            } else if (mois == 2) {
//                if (annee % 4 == 0 && (!(annee % 100 == 0) || annee % 400 == 0) && jour <= 29) {
//                    valide = true;
//                } else if (jour <= 28) {
//                    valide = true;
//                } else {
//                    valide = false;
//                }
                // OU.
                valide = (annee % 4 == 0 && (!(annee % 100 == 0) || annee % 400 == 0) && jour <= 29) || jour <= 28;
            }
        }

//    // OU "simplement"
//    valide <- jour >= 1 ET mois >= 1 ET mois <= 12 ET (
//        ((mois = 1 OU mois = 3 OU mois = 5 OU mois = 7 OU mois = 8 OU mois = 10 OU mois = 12) ET jour <= 31) OU
//        ((mois = 4 OU mois = 6 OU mois = 9 OU mois = 11) ET jour <= 30) OU
//        (mois = 2 ET annee % 4 = 0 ET (NON annee % 100 = 0 OU annee % 400 = 0)))
//
//    // Affichage
//    SI valide ALORS
//        Ecrire("Valide")
//    SINON
//        Ecrire("Invalide")
//    FINSI
//FIN
    }

    public static void saisieChiffreBorne() {
        Scanner scanner = new Scanner(System.in);
        int nb;

        do {
            System.out.print("Saisir un nombre entre 1 et 3 : ");
            nb = Integer.parseInt(scanner.nextLine());
        } while (nb < 1 || nb > 3);

        scanner.close();
    }

    public static void afficheMult(int valeur) {
        for (int i = 0; i <= 10; i ++) {
            System.out.println(String.format("%d x %d = %d", valeur, i, valeur * i));
        }
    }

    public static void afficheMult() {
        System.out.println("Quel chiffre vous intéresse ?");
        Scanner scanner = new Scanner(System.in);

        afficheMult(scanner.nextInt());

        scanner.close();
    }

    public static void afficheTablesDeMultiplications() {
        for (int i = 0; i <= 10; i ++) {
            afficheMult(i);
            System.out.println();
        }
    }

    public static void max() {
        Scanner scanner = new Scanner(System.in);
//        Integer max = null;
        long max = Long.MIN_VALUE;
        long saisie;

        for (int i = 0; i < 20; i ++) {
            System.out.println(String.format("Saisir le chiffre n°%d", i + 1));
            saisie = scanner.nextLong();

            if (saisie > max) {
                max = saisie;
            }
        }

        scanner.close();

        System.out.println(String.format("La plus grande valeur saisie est %d", max));
    }

    public static Integer maxGen(int ...valeurs) {
        Integer resultat = null;
        int max;
//        max(new int[] {1, 2, 3});
//        max(1, 2, 3);

        if (valeurs.length > 0) {
            max = valeurs[0];

            for (int i = 1; i < valeurs.length; i ++) {
                if (valeurs[i] > max) {
                    max = valeurs[i];
                }
            }
        }

        return resultat;
    }

    public static void sommeVecteurs() {
        int tab1[] = {1,  2, 3, 4};
        int tab2[] = {4, 16, 3, 9};
        int tab3[] = new int[tab1.length];

        for (int i = 0; i < tab1.length; i ++) {
            tab3[i] = tab1[i] + tab2[i];
        }
    }

    public static void schtroumpf() {
        short tab1[] = {1,  2, 3, 4};
        short tab2[] = {4, 16, 3, 9};
        long schtroumpf = 0;

//        for (int i = 0; i < tab1.length; i ++) {
//            for (int j = 0; j < tab2.length; j ++) {
//                schtroumpf += tab1[i] * tab2[j];
        for (short val1 : tab1) {
            for (short val2 : tab2) {
                schtroumpf += val1 * val2;
            }
        }

        System.out.println("Grand schtroumpf vaut : " + schtroumpf);
    }

    public static void caesarConcat() {
        String alphabet;
        String messageOriginal;
        String messageTransforme = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel sera l'alphabet à utiliser");
        alphabet = scanner.nextLine();
        System.out.println("Quel est le message ?");
        messageOriginal = scanner.nextLine();

        scanner.close();

        for (char lettre : messageOriginal.toCharArray()) {
            messageTransforme += alphabet.charAt(lettre - 'a');
        }

        System.out.println(String.format("Le message a envoyer est : %s", messageTransforme));
    }

    public static void caesarStringBuilder() {
        String alphabet;
        String messageOriginal;
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel sera l'alphabet à utiliser");
        alphabet = scanner.nextLine();
        System.out.println("Quel est le message ?");
        messageOriginal = scanner.nextLine();

        scanner.close();

        for (char lettre : messageOriginal.toCharArray()) {
            sb.append(alphabet.charAt(lettre - 'a'));
        }

        System.out.println(String.format("Le message a envoyer est : %s", sb));
    }

    public static String replaceSimple(String origine, String recherche, String remplacement) {
        return origine.replaceAll(recherche, remplacement);
    }
    public static String purgeSimple(String origine, String recherche) {
        return origine.replaceAll(recherche, "");
    }

    /**
     * La fonction replaceAll présente dans Java sera plus performante.
     */
    public static String replace(String origine, String recherche, String remplacement) {
        // ALGO   => Java
        // Trouve => indexOf()
        // Mid    => substring

        StringBuilder sb = new StringBuilder();
        int pos;

        while ((pos = origine.indexOf(recherche)) != -1) {
            if (pos > 0) {
                sb.append(origine.substring(0, pos));
            }

            sb.append(remplacement);
            origine = origine.substring(pos + recherche.length());
        }

//        if (!origine.equals("")) {
        sb.append(origine);
//        }

        return sb.toString();
    }

    public static String purge(String origine, String recherche) {
        return replace(origine, recherche, "");
    }

    int fact(int n) {
        int retour;

        if (n == 1) {
            retour = n;
        } else {
            retour = n * fact(n - 1);
        }

        return retour;
    }
    int factTern(int n) {
        return n == 1 ? 1 : n * factTern(n - 1);
    }
}
