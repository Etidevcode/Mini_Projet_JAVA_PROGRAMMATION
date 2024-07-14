# Nombre aux mots

+ Écrivez une méthode appelée numberToWords avec un paramètre int nommé number.

+ La méthode doit imprimer le numéro transmis en utilisant des mots pour les chiffres.

+ Si le nombre est négatif, imprimez « Valeur invalide ».

+ Pour imprimer le numéro sous forme de mots, procédez comme suit :

+ Extrayez le dernier chiffre du nombre donné à l’aide de l’opérateur reste.

+ Convertissez la valeur du chiffre trouvé à l'étape 1 en un mot. Il y a 10 valeurs possibles pour ce chiffre, à savoir 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Imprimez le mot correspondant pour chaque chiffre, par ex. imprimez "Zéro" si le chiffre est 0, "Un" si le chiffre est 1, et ainsi de suite.

+ Supprimez le dernier chiffre du numéro.

+ Répétez les étapes 2 à 4 jusqu'à ce que le nombre soit 0.

+ La logique ci-dessus est correcte, mais dans son état actuel, les mots seront imprimés dans l'ordre inverse. Par exemple, si le nombre est 234, la logique ci-dessus produira la sortie « Quatre Trois Deux » au lieu de « Deux Trois Quatre ». Pour résoudre ce problème, écrivez une deuxième méthode appelée reverse.

+ La méthode reverse doit avoir un paramètre int et renvoyer le nombre inversé (int). Par exemple, si le nombre transmis est 234, alors le nombre inversé serait 432. La méthode reverse devrait également inverser les nombres négatifs.

+ Utilisez la méthode reverse dans la méthode numberToWords afin d'imprimer les mots dans le bon ordre.

+ Une autre chose à garder à l’esprit est tout nombre inversé avec des zéros non significatifs (par exemple, le nombre inversé pour 100 est 001). La logique ci-dessus pour la méthode numberToWords imprimera "One", mais c'est incorrect. Il devrait imprimer "One Zero Zero". Pour résoudre ce problème, écrivez une troisième méthode appelée getDigitCount.

+ La méthode **getDigitCount** doit avoir un paramètre int appelé number et renvoyer le nombre de chiffres de ce nombre. Si le nombre est négatif, renvoyez -1 pour indiquer une valeur non valide.
+ Par exemple, si le nombre a une valeur de 100, la méthode getDigitCount doit renvoyer 3 puisque le nombre 100 comporte 3 chiffres (1, 0, 0).

**Exemple d'entrée/sortie - méthode getDigitCount**

```
getDigitCount(0); devrait renvoyer 1 puisqu'il n'y a qu'un seul chiffre

getDigitCount(123); devrait revenir 3

getDigitCount(-12); devrait renvoyer -1 puisque le paramètre est négatif

getDigitCount(5200); devrait renvoyer 4 puisqu'il y a 4 chiffres dans le nombre
```


**Exemple d'entrée/sortie - méthode inverse**

```
reverse(-121); devrait retourner -121

reverse(1212); devrait revenir 2121

reverse(1234); devrait revenir 4321

reverse(100); devrait retourner 1
```

**Exemple d'entrée/sortie - méthode numberToWords**

```
numberToWords(123); devrait imprimer "Un Deux Trois".

numberToWords(1010); devrait imprimer "One Zero One Zero".

numberToWords(1000); devrait imprimer "One Zero Zero Zero".

numberToWords(-12); devrait imprimer "Valeur invalide" puisque le paramètre est négatif.
```


**CONSEIL :** utilisez une boucle for pour imprimer des zéros après avoir inversé le nombre. Comme vu dans un exemple précédent, 100 inversé devient 1, mais la méthode numberToWords doit imprimer "One Zero Zero". Pour obtenir le nombre de zéros, vérifiez la différence entre le nombre de chiffres du numéro d'origine et le nombre inversé.

**REMARQUE :** Lors de l'impression de mots, chaque mot peut figurer sur sa propre ligne. Par exemple, nombreVersMots(123); peut être:

```
    One
    Two
    Three
```

+ Il n'est pas nécessaire qu'ils soient séparés par un espace.

**REMARQUE :** les méthodes numberToWords, getDigitCount, reverse doivent être définies comme publiques statiques comme nous l'avons fait jusqu'à présent dans le cours.
**REMARQUE :** Au total, vous devez écrire 3 méthodes.

**REMARQUE :** n'ajoutez pas de méthode principale au code de la solution.