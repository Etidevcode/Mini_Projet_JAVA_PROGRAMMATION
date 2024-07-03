# Vérificateur de numéros pour adolescents

+ Nous dirons qu'un nombre est **«adolescent»** s'il est compris entre **13 et 19 (inclus)**.

+ Écrivez une méthode nommée **hasTeen** avec 3 paramètres de type **int**.

+ La méthode doit renvoyer un booléen et doit renvoyer vrai si l'un des paramètres est compris entre **13 (inclus) et 19 (inclus)**. Sinon, retournez false.



**EXEMPLES D'ENTRÉE/SORTIE :**

```
hasTeen(9, 99, 19); devrait renvoyer vrai puisque 19 est compris entre 13 et 19

hasTeen(23, 15, 42); devrait renvoyer vrai puisque 15 est compris entre 13 et 19

hasTeen(22, 23, 34); devrait renvoyer false puisque les nombres 22, 23, 34 ne sont pas compris entre 13 et 19

```

+ Écrivez une autre méthode nommée isTeen avec 1 paramètre de type int.

+ La méthode doit renvoyer un booléen et doit renvoyer vrai si le paramètre est compris entre 13 (inclus) et 19 (inclus). Sinon, retournez false.

**EXEMPLES D'ENTRÉE/SORTIE:**

```
isTeen(9); devrait renvoyer false puisque 9 n'est pas dans la plage 13 - 19

isTeen(13); devrait renvoyer vrai puisque 13 est compris entre 13 et 19
```


+ **REMARQUE** : toutes les méthodes doivent être définies comme publiques statiques, comme nous l'avons fait jusqu'à présent dans le cours.
+ **REMARQUE** : n'ajoutez pas de méthode principale au code de la solution.