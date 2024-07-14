# Nombre parfait

+ Quel est le nombre parfait ?
    + Un nombre parfait est un entier positif égal à la somme de ses diviseurs positifs propres. 
    + Les diviseurs positifs appropriés sont des entiers positifs qui divisent complètement le nombre parfait sans laisser de reste et excluent le nombre parfait lui-même. 
    + Par exemple, prenons le chiffre 6 :
      + Ses diviseurs propres sont 1, 2 et 3 (puisque 6 est la valeur du nombre parfait, il est exclu), et la somme de ses diviseurs propres est 1 + 2 + 3 = 6. 
      + Par conséquent, 6 est un nombre parfait (ainsi que le premier nombre parfait).



+ Écrivez une méthode nommée **isPerfectNumber** avec un paramètre de type int nommé number.

+ Si le nombre est < 1, la méthode doit renvoyer false.

+ La méthode doit calculer si le nombre est parfait. Si le nombre est parfait, la méthode doit renvoyer vrai ; sinon, il devrait renvoyer false.



**EXEMPLE D'ENTRÉE/SORTIE :**

```
isPerfectNumber(6); devrait renvoyer vrai puisque ses diviseurs appropriés sont 1, 2, 3 et la somme est 1 + 2 + 3 = 6

isPerfectNumber(28); devrait renvoyer vrai puisque ses diviseurs propres sont 1, 2, 4, 7, 14 et la somme est 1 + 2 + 4 + 7 + 14 = 28

isPerfectNumber(5); devrait renvoyer false puisque son seul diviseur approprié est 1 et que la somme est 1 et non 5

isPerfectNumber(-1); devrait retourner faux puisque le nombre est <1
```


**ASTUCE :** utilisez une boucle while ou for.

**CONSEIL :** utilisez l’opérateur reste.

**REMARQUE :** La méthode **isPerfectNumber** doit être définie comme publique statique, comme nous l'avons fait jusqu'à présent dans le cours.

**REMARQUE :** n'ajoutez pas de méthode principale au code de la solution.