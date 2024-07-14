# Calculateur d'entrée

+ Écrivez une méthode appelée inputThenPrintSumAndAverage qui n'a aucun paramètre.

+ La méthode ne doit rien renvoyer (void) et doit continuer à lire les nombres int à partir du clavier.

+ Lorsque l'utilisateur saisit quelque chose qui n'est pas un entier, il doit alors imprimer un message au format "SUM = XX AVG = YY".

    + **XX** représente la somme de tous les nombres saisis de type int.
    + **YY** représente la moyenne calculée de tous les nombres de type long.



**EXEMPLES D'ENTRÉE/SORTIE :**

**EXEMPLE 1 :**

**SAISIR :**

```
1
2
3
4
5
a
```

**SORTIR**

```
SUM = 15 AVG = 3
```


**EXEMPLE 2 :**

**SAISIR:**

```
hello
```

**SORTIR :**

```
SUM = 0 AVG = 0
```


**CONSEIL :** utilisez le scanner pour lire une entrée de l'utilisateur.

**CONSEIL :** utilisez le casting lors de l’appel de la méthode round car elle nécessite le double comme paramètre.

**REMARQUE :** Utilisez la méthode Math.round pour arrondir la moyenne calculée (double). La méthode round renvoie long.

**REMARQUE :** Faites attention aux espaces dans le message imprimé.

**REMARQUE :** faites attention aux utilisateurs qui pourraient saisir immédiatement une entrée non valide (voir l'exemple ci-dessus).

**REMARQUE :** La méthode inputThenPrintSumAndAverage doit être définie comme publique statique comme nous l'avons fait jusqu'à présent dans le cours.

**REMARQUE :** n'ajoutez pas la méthode principale au code de la solution.