# Calculateur de superficie

+ Écrivez une méthode nommée zone avec un double paramètre nommé rayon.

+ La méthode doit renvoyer une valeur double qui représente l’aire d’un cercle.

+ Si le rayon du paramètre est négatif, renvoyez -1,0 pour représenter une valeur non valide.

+ Écrivez une autre méthode surchargée avec 2 paramètres x et y (tous deux doubles), où x et y représentent les côtés d'un rectangle.

+ La méthode doit renvoyer une zone d'un rectangle.

+ Si l'un ou les deux paramètres sont négatifs, retournez -1,0 pour indiquer une valeur non valide.

+ Pour les formules et la valeur PI, veuillez consulter les conseils ci-dessous.

**Exemples d'entrée/sortie :**

```
area(5,0); devrait renvoyer 78.53981633974483 ou 78.53981

area(-1); devrait renvoyer -1 puisque le paramètre est négatif

area(5,0, 4,0); devrait renvoyer 20,0 (5 * 4 = 20)

area(-1,0, 4,0); devrait renvoyer -1 puisque le paramètre est d'abord négatif
```


+ **REMARQUE** : toutes les méthodes doivent être définies comme publiques statiques, comme nous l'avons fait jusqu'à présent dans le cours.
+ **REMARQUE** : n'ajoutez pas de méthode principale au code de la solution.