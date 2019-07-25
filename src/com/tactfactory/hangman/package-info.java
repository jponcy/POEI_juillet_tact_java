/**
 * Le but de ce TP sera de créer un jeu du pendu en mode console (1 joueur).
 *
 * Nous allons procéder par étapes :
 * <ol>
 * <li>mot mystère :
 * <ul>
 * <li>définir une variable contenant le mot à deviner (toujours le même
 * mot)</li>
 * <li>demander à l'utilisateur de saisir un mot</li>
 * <li>annoncer à l'utilisateur si le mot qu'il a saisi était bien le mot à
 * deviner</li>
 * </ul>
 * </li>
 * <li>le mot mystère sera maintenant tiré au sort à partir d'un tableau
 * contenant la liste des mots possibles</li>
 * <li>le joueur pourra maintenant retenter sa chance jusqu'à ce qu'il ait
 * trouvé le mot mystère</li>
 * <li>le joueur aura maintenant 5 chances pour trouver le mot</li>
 * <li>l'utilisateur pourra maintenant saisir soit un mot, soit une lettre. S'il
 * saisie un mot, il perd une vie si ce n'est pas le bon mot (sans avoir
 * d'indice). S'il saisie une lettre, on lui dit si cette lettre fait partie du
 * mot (si cette lettre ne fait pas partie du mot, alors le joueur perds une
 * vie)</li>
 * <li>on affichera maintenant un résumé du mot à trouver. Par exemple, si le
 * mot à trouver et "aimer", alors on lui affichera "_____" au début de la
 * partie. S'il tente 'T' au premier tour, il perds une vie puis on lui affiche
 * de nouveau l'indice (valant toujours "_____"). S'il tente a, il ne perd pas
 * de vie puis on lui re-affiche l'indice qui vaudra maintenant "a____"</li>
 * <li>avant chaque tentative de l'utilisateur, nous lui rappelerons les mots et
 * lettres qu'il a déjà tenté (avec échec)</li>
 * <li>l'utilisateur ne perdra plus de vie s'il propose une lettre ou un mot
 * (incorrect) qu'il avait déjà tenté avant</li>
 * <li>si ce n'est pas déjà fait, séparer le programme de manière cohérente en
 * plusieurs classes. Par exemple on pourrait avoir :
 * <ul>
 * <li>HangmanApplication => permet de lancer le programme (méthode main)</li>
 * <li>HangmanWritter => centralise les fonctions System.out.println</li>
 * <li>HangmanReader => centralise toutes les utilisation de Scannner (scanner
 * sera un attribut)</li>
 * <li>HangmanGame => contient les données/algorithmes relatifs à la partie en
 * cours</li>
 * </ul>
 * </ol>
 * </li>
 */
package com.tactfactory.hangman;
