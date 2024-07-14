# Chiffre partagé

+ Écrivez une méthode nommée `hasSharedDigit` avec deux paramètres de type int.

+ Chaque numéro doit être compris entre 10 (inclus) et 99 (inclus). Si l'un des nombres n'est pas compris dans la plage, la méthode doit renvoyer false.

+ La méthode doit renvoyer true s'il existe un chiffre qui apparaît dans les deux nombres, par exemple 2 sur 12 et 23 ; sinon, la méthode devrait renvoyer false.



**EXEMPLE D'ENTRÉE/SORTIE :**

```
hasSharedDigit(12, 23); → devrait renvoyer vrai puisque le chiffre 2 apparaît dans les deux nombres

hasSharedDigit(9, 99); → devrait renvoyer false puisque 9 n'est pas compris entre 10 et 99

hasSharedDigit(15, 55); → devrait renvoyer vrai puisque le chiffre 5 apparaît dans les deux nombres
```


**REMARQUE** : La méthode `hasSharedDigit` doit être définie comme publique statique comme nous l'avons fait jusqu'à présent dans le cours.

**REMARQUE**: n'ajoutez pas de méthode principale au code de la solution.