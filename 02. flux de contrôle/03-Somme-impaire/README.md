# Somme impaire

+ Écrivez une méthode appelée isOdd avec un paramètre int et appelez-la numéro. La méthode doit renvoyer un booléen.

+ Vérifiez que le nombre est > 0, s'il n'est pas renvoyé faux.

+ Si le nombre est impair, renvoie vrai, sinon renvoie faux.

+ Écrivez une deuxième méthode appelée sumOdd qui a 2 paramètres int start et end, qui représentent une plage de nombres.

+ La méthode doit utiliser une boucle for pour additionner tous les nombres impairs de cette plage, y compris la fin, et renvoyer la somme.

+ Il doit appeler la méthode isOdd pour vérifier si chaque nombre est impair.

+ Le paramètre end doit être supérieur ou égal à start et les paramètres de début et de fin doivent être supérieurs à 0.

+ Si ces conditions ne sont pas remplies, renvoyez -1 de la méthode pour indiquer une entrée non valide.



**Exemple d'entrée/sortie :**

```
sumOdd(1, 100); → devrait renvoyer 2500

sumOdd(-1, 100); → devrait renvoyer -1

sumOdd(100, 100); → devrait renvoyer 0

sumOdd(13, 13); → devrait renvoyer 13 (Cet ensemble contient un nombre, 13, et il est impair)

sumOdd(100, -100); → devrait renvoyer -1

sumOdd(100, 1000); → devrait renvoyer 247500
```


**CONSEIL** : utilisez l'opérateur reste pour vérifier si le nombre est impair

**REMARQUE** : les deux méthodes doivent être définies comme publiques statiques, comme nous l'avons fait jusqu'à présent dans le cours.

**REMARQUE** : n'ajoutez pas de méthode principale au code de la solution.