# Calculateur d'année bissextile

+ Écrivez une méthode **isLeapYear** avec un paramètre de type **int** nommé **year**.

+ Le paramètre doit être supérieur ou égal à 1 et inférieur ou égal à 9999. Si le paramètre n'est pas dans cette plage, renvoyez false.

+ Sinon, s'il est dans la plage valide, calculez si l'année est une année bissextile et renvoyez vrai si c'est une année bissextile, sinon renvoyez faux.



**Pour déterminer si une année est une année bissextile, procédez comme suit :**

1. Si l’année est divisible par 4, passez à l’étape 2. Sinon, passez à l’étape 5.
2. Si l’année est divisible par 100, passez à l’étape 3. Sinon, passez à l’étape 4.
3. Si l’année est divisible par 400, passez à l’étape 4. Sinon, passez à l’étape 5.
4. L’année est bissextile (elle compte 366 jours). La méthode isLeapYear doit renvoyer true.
5. L’année n’est pas bissextile (elle compte 365 jours). La méthode isLeapYear doit renvoyer false.



**Une autre façon de dire est :**

+ Une année bissextile est une année divisible par 4 mais pas par 100.

+ S'il est divisible par 100, il doit être divisible par 400.



+ Les années suivantes ne sont pas bissextiles :
    + 1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
    + En effet, ils sont divisibles par 100 mais pas par 400.


+ Les années suivantes sont bissextiles :
    + 1600, 2000, 2400
    + En effet, ils sont divisibles également par 100 et par 400.



**Exemples d'entrée/sortie :**

```
isLeapYear(-1600); → devrait renvoyer false puisque le paramètre n'est pas dans la plage (1-9999)

isLeapYear(1600); → devrait renvoyer vrai puisque 1600 est une année bissextile

isLeapYear(2017); → devrait renvoyer false puisque 2017 n'est pas une année bissextile

isLeapYear(2000); → devrait renvoyer vrai car 2000 est une année bissextile
```

+ **REMARQUE** : La méthode isLeapYear doit être définie comme publique statique, comme nous l'avons fait jusqu'à présent dans le cours.
+ **REMARQUE** : n'ajoutez pas de méthode principale au code de la solution.