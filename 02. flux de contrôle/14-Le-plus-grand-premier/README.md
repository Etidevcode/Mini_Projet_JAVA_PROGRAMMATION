# Le plus grand prime

+ Écrivez une méthode nommée getLargestPrime avec un paramètre de type int nommé number.

+ Si le nombre est négatif ou ne contient aucun nombre premier, la méthode doit renvoyer -1 pour indiquer une valeur non valide.

+ La méthode doit calculer le plus grand facteur premier d'un nombre donné et le renvoyer.


**EXEMPLE D'ENTRÉE/SORTIE :**

```
getLargestPrime (21); devrait renvoyer 7 puisque 7 est le plus grand nombre premier (3 * 7 = 21)

getLargestPrime (217); devrait renvoyer 31 puisque 31 est le plus grand nombre premier (7 * 31 = 217)

getLargestPrime (0); devrait renvoyer -1 puisque 0 n'a pas de nombres premiers

getLargestPrime (45); devrait renvoyer 5 puisque 5 est le plus grand nombre premier (3 * 3 * 5 = 45)

getLargestPrime (-1); devrait renvoyer -1 puisque le paramètre est négatif
```


**CONSEIL :** Puisque les nombres 0 et 1 ne sont pas considérés comme des nombres premiers, ils ne peuvent pas contenir de nombres premiers.

**REMARQUE :** La méthode getLargestPrime doit être définie comme publique statique, comme nous l'avons fait jusqu'à présent dans le cours.

**REMARQUE :** n'ajoutez pas de méthode principale au code de la solution.
