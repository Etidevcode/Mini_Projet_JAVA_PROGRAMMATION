# Jouer au chat

+ Les chats passent la majeure partie de la journée à jouer. Ils jouent notamment si la température est comprise entre 25 et 35 (inclus). Sauf si c’est l’été, la limite supérieure est de 45 (inclus) au lieu de 35.



+ Écrivez une méthode isCatPlaying qui a 2 paramètres. La méthode doit renvoyer vrai si le chat joue, sinon renvoyer faux

    + Le 1er paramètre doit être de type booléen et être nommé été, il représente si c'est l'été.
    + Le 2ème paramètre représente la température et est de type int avec le nom température.



**EXEMPLES D'ENTRÉE/SORTIE :**

```
isCatPlaying(true, 10); devrait renvoyer faux puisque la température n'est pas comprise entre 25 et 45

isCatPlaying(false, 36); devrait renvoyer faux puisque la température n'est pas comprise entre 25 et 35 (le paramètre été est faux)

isCatPlaying(false, 35); devrait renvoyer vrai puisque la température est comprise entre 25 et 35
```