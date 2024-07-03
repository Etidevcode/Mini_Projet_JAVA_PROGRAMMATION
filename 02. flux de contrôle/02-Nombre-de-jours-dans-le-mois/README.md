# Nombre de jours dans le mois

+ Écrivez une méthode isLeapYear avec un paramètre de type int nommé year.

+ Le paramètre doit être supérieur ou égal à 1 et inférieur ou égal à 9999.

+ Si le paramètre n'est pas dans cette plage, renvoyez false.

+ Sinon, s'il se situe dans la plage valide, calculez si l'année est une année bissextile et renvoyez vrai si c'est le cas, sinon renvoyez faux.

+ Une année est bissextile si elle est divisible par 4 mais pas par 100, ou si elle est divisible par 400.

**Exemples d'entrée/sortie :**

```
isLeapYear(-1600); → devrait renvoyer false puisque le paramètre n'est pas dans la plage (1-9999)

isLeapYear(1600); → devrait renvoyer vrai puisque 1600 est une année bissextile

isLeapYear(2017); → devrait renvoyer false puisque 2017 n'est pas une année bissextile

isLeapYear(2000); → devrait renvoyer vrai car 2000 est une année bissextile
```

**REMARQUE** : La solution à l'exercice de codage des années bissextiles plus tôt dans le cours a créé la méthode isLeapYear. Vous pouvez utiliser cette solution si vous le souhaitez.

+ Écrivez une autre méthode getDaysInMonth avec deux paramètres mois et année. ​Les deux de type int.

  + Si le paramètre mois est < 1 ou > 12, renvoyez -1. 

  + Si le paramètre année est < 1 ou > 9999, renvoie -1.

+ Cette méthode doit renvoyer le nombre de jours dans le mois. Attention aux années bissextiles elles ont 29 jours au mois 2 (février).

+ Vous devez vérifier si l’année est une année bissextile en utilisant la méthode isLeapYear décrite ci-dessus.

**Exemples d'entrée/sortie :**

```
getDaysInMonth(1, 2020); → devrait renvoyer 31 puisque janvier compte 31 jours.

getDaysInMonth(2, 2020); → devrait renvoyer 29 puisque février compte 29 jours dans une année bissextile et 2020 est une année bissextile.

getDaysInMonth(2, 2018); → devrait renvoyer 28 puisque février compte 28 jours si ce n'est pas une année bissextile et que 2018 n'est pas une année bissextile.

getDaysInMonth(-1, 2020); → devrait renvoyer -1 puisque le paramètre mois n'est pas valide.

getDaysInMonth(1, -2020); → doit renvoyer -1 puisque le paramètre année est en dehors de la plage de 1 à 9999.
```


**CONSEIL** : utilisez l’instruction switch.

**REMARQUE** : les méthodes isLeapYear et getDaysInMonth doivent être publiques et statiques, comme nous l'avons fait jusqu'à présent dans le cours.

**REMARQUE** : n'ajoutez pas de méthode principale au code de la solution.