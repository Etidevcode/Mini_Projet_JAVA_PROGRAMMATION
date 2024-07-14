# Étoile diagonale

+ Écrivez une méthode nommée printSquareStar avec un paramètre de type int nommé number.

+ Si le nombre est <5, la méthode doit imprimer "Valeur invalide".

+ La méthode doit imprimer des diagonales pour générer un motif rectangulaire composé d'étoiles (*). Cela doit être accompli en utilisant des boucles (voir exemples ci-dessous).



**EXEMPLE D'ENTRÉE/SORTIE :**

**EXEMPLE 1**

+ **printSquareStar(5);** devrait imprimer ce qui suit :

**REMARQUE :** Pour le texte dans les blocs de code ci-dessous, utilisez l'icône de code {...} sur Udemy

```
*****
** **
* * *
** **
*****
```

**Explication:**

```
*****   5 étoiles
** ** 2 étoiles espace 2 étoiles
* * * 1 étoile espace 1 étoile espace 1 étoile
      ** ** 2 étoiles espace 2 étoiles
      *****   5 étoiles
```

**EXEMPLE 2**

+ **printSquareStar(8)**; devrait imprimer ce qui suit :

```
********
** **
* * * *
* ** *
* ** *
* * * *
** **
********
```

+ Les modèles ci-dessus sont constitués d'un certain nombre de lignes et de colonnes (où nombre est le nombre de lignes à imprimer). Pour chaque ligne ou colonne, des étoiles sont imprimées en fonction de quatre conditions (lisez-les attentivement) :

    + Au premier ou au dernier rang

    + Dans la première ou la dernière colonne

    + Lorsque le numéro de ligne est égal au numéro de colonne

    + Lorsque le numéro de colonne est égal à rowCount - currentRow + 1 (où currentRow est le numéro de ligne actuel)



**ASTUCE :** utilisez une boucle imbriquée (une boucle à l'intérieur d'une boucle).

**CONSEIL :** Pour imprimer sur la même ligne, utilisez la méthode print au lieu de println, par ex. System.out.print(" "); imprime un espace et ne "se déplace" pas vers une autre ligne.

**CONSEIL :** Pour "passer" à une autre ligne, vous pouvez utiliser un appel println vide, par ex. System.out.println(); .

**REMARQUE :** La méthode printSquareStar ​doit être définie comme publique statique comme nous l'avons fait jusqu'à présent dans le cours.

**REMARQUE :** n'ajoutez pas de méthode principale au code de la solution.