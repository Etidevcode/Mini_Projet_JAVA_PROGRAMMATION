# Imprimante d'égalité

+ Ecrivez une méthode **printEqual** avec 3 paramètres de type **int**. La méthode ne doit rien renvoyer (vide).

+ Si l'un des paramètres est inférieur à 0, imprimez le texte "Valeur invalide".

+ Si tous les nombres sont égaux, imprimez le texte "Tous les nombres sont égaux"

+ Si tous les nombres sont différents, imprimez le texte « Tous les nombres sont différents ».

+ Sinon, imprimez « Ni tous sont égaux ni différents ».



**EXEMPLES D'ENTRÉE/SORTIE :**

```
printEqual(1, 1, 1); devrait imprimer le texte Tous les nombres sont égaux

printEqual(1, 1, 2); devrait imprimer du texte Tous ne sont ni égaux ni différents

printEqual(-1, -1, -1); devrait imprimer le texte Valeur invalide

printEqual(1, 2, 3); devrait imprimer le texte Tous les nombres sont différents
```


**CONSEIL :** Faites extrêmement attention aux espaces dans le message imprimé.



**REMARQUES**

+ La solution ne sera pas acceptée s'il y a des espaces supplémentaires.

+ La méthode printEqual doit être définie comme public static comme nous l'avons fait jusqu'à présent dans le cours.

+ N'ajoutez pas de méthode principale au code de la solution.