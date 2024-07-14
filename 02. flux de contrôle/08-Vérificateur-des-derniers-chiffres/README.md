# Vérificateur du dernier chiffre

+ Écrivez une méthode nommée hasSameLastDigit avec trois paramètres de type int.

+ Chaque nombre doit être compris entre 10 (inclus) et 1 000 (inclus). Si l'un des nombres n'est pas compris dans la plage, la méthode doit renvoyer false.

+ La méthode doit renvoyer true si au moins deux des nombres partagent le même chiffre le plus à droite ; sinon, il devrait renvoyer false.



**EXEMPLE D'ENTRÉE/SORTIE :**

```
hasSameLastDigit (41, 22, 71); → devrait renvoyer vrai puisque 1 est le chiffre le plus à droite des nombres 41 et 71

hasSameLastDigit (23, 32, 42); → devrait renvoyer vrai puisque 2 est le chiffre le plus à droite des nombres 32 et 42

hasSameLastDigit (9, 99, 999); → devrait renvoyer false puisque 9 n'est pas compris entre 10 et 1 000
```


+ Écrivez une autre méthode nommée isValid avec un paramètre de type int.

+ La méthode doit renvoyer true si le paramètre numérique est compris entre 10 (inclus) et 1 000 (inclus), sinon renvoyer false.

**EXEMPLE D'ENTRÉE/SORTIE**

```
isValide(10); → devrait renvoyer vrai puisque 10 est compris entre 10 et 1 000

isValide(468); → devrait renvoyer vrai puisque 468 est compris entre 10 et 1 000

isValide(1051); → devrait renvoyer false puisque 1051 n'est pas compris entre 10 et 1000
```


**REMARQUE :** toutes les méthodes doivent être définies comme publiques statiques, comme nous l'avons fait jusqu'à présent dans le cours.

**REMARQUE :** n'ajoutez pas de méthode principale au code de la solution.