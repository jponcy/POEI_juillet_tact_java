/**
 * Le but de ce TP va être de simuler quelques aspects basiques d'un RPG
 * classique tour/tour. Il faudra faire les questions dans l'ordre, sans lire
 * les suivantes (ne pas en prendre en compte).
 *
 * 1) Créer une classe Personnage ayant pour attributs :
 * <ul>
 * <li>nom</li>
 * <li>un nombre de PM (Points de Mouvement)</li>
 * <li>un nombre de PA (Points d'Action)</li>
 * <li>un nombre de PV (Points de Vie)</li>
 * </ul>
 *
 * 2) Créer une classe GreedIslandApplication (point d'entré du programme) qui
 * affichera un message de bienvenue à l'utilisateur après lui avoir demandé son
 * pseudo (nom du personnage)
 *
 * 3) Dans la classe GreedIslandApplication, initialiser une variable Personnage
 * avec tous les champs de renseignés (Personnage perso = new ...)
 *
 * 4) Modifier GreedIslandApplication pour vérifier si le pseudo saisi par
 * l'utilisateur au début du programme correspond à celui du personnage créé
 * dans la question précedente. Si le pseudo est le même on lui annonce
 * (connexion réussie), sinon échec
 *
 * 5) Si la connexion est réussie, le joueur pourra déplacer son personnage de 1
 * à plusieurs cases. On demandera à l'utilisateur de combien de cases il
 * souhaite se déplacer. Nous arrêterons de lui demander de se déplacer si son
 * nombre de PM atteint 0 ou qu'il demande de se déplacer de 0 case (souhaite
 * s'immobiliser). A chaque saisie, on validera que le nombre de cases demandé
 * est positif et que le personnage a encore assez de PM pour effectuer ce
 * déplacement
 *
 * 6) Nous allons maintenant modifier la question 3. Notre variable n'est plus
 * directement un personnage, mais un tableau de plusieurs personnages. Adapter
 * tout ce qui est nécessaire
 *
 * 7) Dorénavent, un utilisateur pourra faire différentes actions après s'être
 * connecté avec succès :
 * <ul>
 * <li>se déplacer</li>
 * <li>frapper (dans le vide)</li>
 * <li>se désonnecter</li>
 * <li>se reposer</li>
 * </ul>
 * Si l'utilisateur se déplace, il perdra (comme avant) 1 PM par case de
 * déplacement. S'il frappe, il perds 5PA. S'il se repose, il regagne 1PA + 1PM.
 *
 * 8) Nous allons maintenant mettre en place un système de combo. Le fait de
 * faire un combo, va réduire la consomation en PA des coups. La première frappe
 * coûte 5PA, la deuxième (d'affilé si aucune autre action n'est réalisée entre
 * deux) coûte 4PA, puis 3PA, puis 2PA. Toutes les attaques suivantes couterons
 * 2PA.
 */

package com.tactfactory.rpg;
