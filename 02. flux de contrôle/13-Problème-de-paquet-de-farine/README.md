# Problème de paquet de farine

+ Écrivez une méthode nommée **canPack** avec trois paramètres de type int nommés bigCount, smallCount et goal.

+ Le paramètre **bigCount** représente le nombre de gros sacs de farine (5 kilos chacun).

+ Le paramètre smallCount représente le nombre de petits sacs de farine (1 kilo chacun).

+ Le paramètre goal représente la quantité cible de kilos de farine nécessaire pour assembler un paquet.

+ Par conséquent, la somme des kilos de bigCount et smallCount doit être au moins égale à la valeur de goal. La méthode doit retourner vrai s'il est possible de réaliser un paquet avec un objectif de kilos de farine.

+ Si la somme est supérieure à l'objectif, assurez-vous que seuls les sacs pleins sont utilisés pour atteindre le montant de l'objectif. 
  + Par exemple, si goal = 9, bigCount = 2 et smallCount = 0, la méthode doit renvoyer false puisque chaque big bag pèse 5 kilos et ne peut pas être divisé. 
  + Cependant, si goal = 9, bigCount = 1 et smallCount = 5, la méthode doit renvoyer true car 1 sac bigCount plein et 4 sacs smallCount pleins sont égaux à l'objectif, et ce n'est pas grave s'il reste des sacs supplémentaires.

+ Si l'un des paramètres est négatif, renvoie false.



**EXEMPLE D'ENTRÉE/SORTIE :**

```
canPack (1, 0, 4); devrait renvoyer false puisque bigCount vaut 1 (gros sac de 5 kilos) et l'objectif est de 4 kilos.

canPack (1, 0, 5); devrait renvoyer vrai puisque bigCount vaut 1 (gros sac de 5 kilos) et l'objectif est de 5 kilos.

canPack (0, 5, 4); devrait renvoyer vrai puisque smallCount est 5 (petits sacs de 1 kilo) et l'objectif est de 4 kilos, et il nous reste 1 sac, ce qui est ok comme mentionné ci-dessus.

canPack (2, 2, 11); devrait renvoyer vrai puisque bigCount vaut 2 (gros sacs de 5 kilos chacun) et smallCount vaut 2 (petits sacs de 1 kilo), cela fait au total 12 kilos et l'objectif est de 11 kilos.

canPack (-3, 2, 12); devrait renvoyer false puisque bigCount est négatif.
```


**REMARQUE :** La méthode **canPack** doit être définie comme public static comme nous l'avons fait jusqu'à présent dans le cours.

**REMARQUE :** n'ajoutez pas de méthode principale au code de la solution.