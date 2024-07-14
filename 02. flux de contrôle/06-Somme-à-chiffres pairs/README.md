# Somme paire

+ Écrivez une méthode nommée `getEvenDigitSum` avec un paramètre de type int appelé number.

+ La méthode doit renvoyer la somme des chiffres pairs du nombre.

+ Si le nombre est négatif, la méthode doit renvoyer -1 pour indiquer une valeur non valide.



**EXEMPLE D'ENTRÉE/SORTIE :**

```
getEvenDigitSum(123456789); → devrait renvoyer 20 puisque 2 + 4 + 6 + 8 = 20

getEvenDigitSum(252); → devrait renvoyer 4 puisque 2 + 2 = 4

getEvenDigitSum(-22); → devrait renvoyer -1 puisque le nombre est négatif
```


**REMARQUE** : La méthode getEvenDigitSum doit être définie comme public static comme nous l'avons fait jusqu'à présent dans le cours.

**REMARQUE** : n'ajoutez pas de méthode principale au code de la solution.

## Exemple Calcul

Prenons le nombre 123456 et analysons chaque étape :

+ Entrée : 123456
+ Vérification de la négativité : 123456 >= 0 donc on continue.
+ Initialisation de la somme : sum = 0
+ Boucle pour traiter chaque chiffre :

```
    number = 123456, digit = 123456 % 10 = 6, 6 est pair, sum = 0 + 6 = 6
    number = 12345,  digit = 12345 % 10 = 5, 5 n'est pas pair, sum = 6
    number = 1234,   digit = 1234 % 10 = 4,  4 est pair, sum = 6 + 4 = 10
    number = 123,    digit = 123 % 10 = 3,  3 n'est pas pair, sum = 10
    number = 12,     digit = 12 % 10 = 2,   2 est pair, sum = 10 + 2 = 12
    number = 1,      digit = 1 % 10 = 1,    1 n'est pas pair, sum = 12
    number = 0,      boucle terminée
```

+ Retour de la somme : `sum = 12`

