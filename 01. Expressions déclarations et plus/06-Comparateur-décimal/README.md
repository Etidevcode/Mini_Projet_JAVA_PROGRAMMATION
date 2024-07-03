# Comparateur décimal

+ Écrivez une méthode **areEqualByThreeDecimalPlaces*** avec deux paramètres de type double.

+ La méthode doit renvoyer un booléen et elle doit renvoyer vrai si deux nombres doubles sont identiques jusqu'à trois décimales. Sinon, retournez false.



**EXEMPLES D'ENTRÉE/SORTIE :**

```
areEqualByThreeDecimalPlaces(-3.1756, -3.175); → devrait renvoyer vrai puisque les nombres sont égaux jusqu'à 3 décimales.

areEqualByThreeDecimalPlaces(3.175, 3.176); → devrait renvoyer false puisque les nombres ne sont pas égaux jusqu'à 3 décimales

areEqualByThreeDecimalPlaces(3.0, 3.0); → devrait renvoyer vrai puisque les nombres sont égaux jusqu'à 3 décimales.

areEqualByThreeDecimalPlaces(-3.123, 3.123); → devrait renvoyer false puisque les nombres ne sont pas égaux jusqu'à 3 décimales.
```


+ **CONSEIL** : Utilisez du papier et un crayon.

+ **CONSEIL** : utilisez le **casting**.

+ **REMARQUE** : La méthode **areEqualByThreeDecimalPlaces** doit être définie comme publique statique, comme nous l'avons fait jusqu'à présent dans le cours.
+ **REMARQUE** : n'ajoutez pas de méthode principale au code de la solution.