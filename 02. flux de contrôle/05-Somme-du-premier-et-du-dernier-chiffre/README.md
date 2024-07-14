# Somme du premier et du dernier chiffre

+ Écrivez une méthode nommée sumFirstAndLastDigit avec un paramètre de type int appelé number.

+ La méthode doit trouver le premier et le dernier chiffre du numéro de paramètre transmis à la méthode, à l'aide d'une boucle, et renvoyer la somme du premier et du dernier chiffre de ce numéro.

+ Si le nombre est négatif, la méthode doit renvoyer -1 pour indiquer une valeur non valide.

**Exemple d'entrée/sortie**

```
sumFirstAndLastDigit(252); → devrait renvoyer 4, le premier chiffre est 2 et le dernier est 2, ce qui nous donne 2+2 et la somme est 4.

sumFirstAndLastDigit(257); → devrait renvoyer 9, le premier chiffre est 2 et le dernier est 7, ce qui nous donne 2+7 et la somme est 9.

sumFirstAndLastDigit(0); → devrait renvoyer 0, le premier chiffre et le dernier chiffre sont 0 puisque nous n'avons qu'un seul chiffre, ce qui nous donne 0+0 et la somme est 0.

sumFirstAndLastDigit(5); → devrait renvoyer 10, le premier chiffre et le dernier chiffre sont 5 puisque nous n'avons qu'un seul chiffre, ce qui nous donne 5+5 et la somme est 10.

sumFirstAndLastDigit(-10); → devrait renvoyer -1, puisque le paramètre est négatif et doit être positif.
```


**REMARQUE** : La méthode **sumFirstAndLastDigit** doit être définie comme publique statique comme nous l'avons fait jusqu'à présent dans le cours.

**REMARQUE** : n'ajoutez pas de méthode principale au code de la solution.


## Exemple De Calcul Manuel 


+ Voici l'exécution détaillée pour le nombre 12345 :

    + Entrée : 12345
    + Vérification de la négativité : `12345 >= 0` donc on continue.
    + Extraction du dernier chiffre : `lastDigit = 12345 % 10 = 5`
    + Initialisation du premier chiffre : `firstDigit = 0`
    + Boucle pour trouver le premier chiffre

```
    Exemple Complet
    Voici l'exécution détaillée pour le nombre 12345 :
    
    Entrée : 12345
    Vérification de la négativité : 12345 >= 0 donc on continue.
    Extraction du dernier chiffre : lastDigit = 12345 % 10 = 5
    Initialisation du premier chiffre : firstDigit = 0
    Boucle pour trouver le premier chiffre
```

+ Retour de la somme : `firstDigit + lastDigit = 1 + 5 = 6`