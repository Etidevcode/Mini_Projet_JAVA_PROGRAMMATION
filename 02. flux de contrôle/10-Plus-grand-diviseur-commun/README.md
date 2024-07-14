# Plus grand diviseur commun

+ Écrivez une méthode nommée getGreatestCommonDivisor avec deux paramètres de type int nommés first et second.

+ Si l'un des paramètres est <10, la méthode doit renvoyer -1 pour indiquer une valeur non valide.

+ La méthode doit renvoyer le plus grand diviseur commun des deux nombres (int).

+ Le plus grand diviseur commun est le plus grand entier positif qui peut diviser complètement chacun des entiers (c'est-à-dire sans laisser de reste).



**Par exemple 12 et 30 :**


```
12 peut être divisé par 1, 2, 3, 4, 6, 12

30 peut être divisé par 1, 2, 3, 5, 6, 10, 15, 30

Le plus grand diviseur commun est 6 puisque 12 et 30 peuvent être divisés par 6 et il n’y a pas de reste résultant.
```


**EXEMPLE D'ENTRÉE/SORTIE :**

```
getGreatestCommonDivisor(25, 15); devrait renvoyer 5 puisque les deux peuvent être divisés par 5 sans reste

getGreatestCommonDivisor(12, 30); devrait renvoyer 6 puisque les deux peuvent être divisés par 6 sans reste

getGreatestCommonDivisor(9, 18); devrait renvoyer -1 puisque le premier paramètre est <10

getGreatestCommonDivisor(81, 153); devrait renvoyer 9 puisque les deux peuvent être divisés par 9 sans reste
```


**CONSEIL :** utilisez une **boucle while ou for** et vérifiez si les deux nombres peuvent être divisés sans reste.

**CONSEIL :** Trouvez le minimum des deux nombres.



**REMARQUE :** La méthode **getGreatestCommonDivisor** doit être définie comme public static comme nous l'avons fait jusqu'à présent dans le cours.

**REMARQUE :** n'ajoutez pas de méthode principale au code de la solution.