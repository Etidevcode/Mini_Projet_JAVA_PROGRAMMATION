# Tous les facteurs

+ Écrivez une méthode nommée printFactors avec un paramètre de type int nommé number.

+ Si le nombre est < 1, la méthode doit imprimer "Valeur invalide".

+ La méthode doit imprimer tous les facteurs du nombre. Un facteur d'un nombre est un entier qui divise entièrement ce nombre (c'est-à-dire sans laisser de reste).

+ Par exemple, 3 est un facteur de 6 car 3 divise entièrement 6 sans laisser de reste. Autrement dit 6/3 = 2.



**EXEMPLE D'ENTRÉE/SORTIE :**


```
printFactors(6); → devrait imprimer 1 2 3 6

printFactors(32); → devrait imprimer 1 2 4 8 16 32

printFactors(10); → devrait imprimer 1 2 5 10

printFactors(-1); → devrait imprimer "Valeur invalide" puisque le nombre est <1
```


**ASTUCE : utilisez une boucle while ou for.**



**REMARQUE :** Lors de l'impression de numéros, chaque numéro peut figurer sur sa propre ligne. Il n'est pas nécessaire qu'ils soient séparés par un espace.

**Par exemple, l'impression de printFactors(10); peut être:**

```
        1
        2
        5
        10
```

**REMARQUE :** La méthode **printFactors** doit être définie comme publique statique comme nous l'avons fait jusqu'à présent dans le cours.

**REMARQUE :** n'ajoutez pas de méthode principale au code de la solution.