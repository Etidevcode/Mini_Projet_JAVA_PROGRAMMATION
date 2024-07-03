# Chien qui aboie

+ Nous avons un chien qui aime aboyer. Il faut se réveiller si le chien aboie la nuit !

+ Écrivez une méthode **ShouldWakeUp** qui a 2 paramètres.

    + Le 1er paramètre doit être de type booléen et être nommé aboiement, il représente si notre chien aboie actuellement.
    + Le 2ème paramètre représente l'heure du jour et est de type int avec le nom hourOfDay et a une plage valide de 0 à 23.

+ Nous devons nous réveiller si le chien aboie avant 8 heures ou après 22 heures donc dans ce cas, retour vrai.

+ Dans tous les autres cas, retournez false.

+ Si le paramètre hourOfDay est inférieur à 0 ou supérieur à 23, renvoie false.

**Exemples d'entrée/sortie :**

```
ShouldWakeUp (true, 1); → devrait retourner vrai

ShouldWakeUp (false, 2); → devrait renvoyer false puisque le chien n'aboie pas.

ShouldWakeUp (true, 8) ; → devrait renvoyer false, puisque ce n'est pas avant 8.

ShouldWakeUp (true, -1); → doit renvoyer false puisque le paramètre hourOfDay doit être compris entre 0 et 23.
```


+ **CONSEIL** : utilisez l'instruction if else avec plusieurs conditions.

+ **REMARQUE** : La méthode **ShouldWakeUp** doit être définie comme publique statique, comme nous l'avons fait jusqu'à présent dans le cours.

+ **REMARQUE** : n'ajoutez pas de méthode principale au code de la solution.