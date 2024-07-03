# Calculatrice de minutes en années et en jours

+ Écrivez une méthode **printYearsAndDays** avec un paramètre de type long nommé minutes.

+ La méthode ne doit rien renvoyer (vide) et doit calculer les années et les jours à partir du paramètre minutes.

+ Si le paramètre est inférieur à 0, imprimez le texte « Valeur invalide ».

+ Sinon, si le paramètre est valide alors il doit imprimer un message au format **"XX min = YY y et ZZ d"**.

    + **XX** représente la valeur d'origine des minutes.
    + **YY** représente les années calculées.
    + **ZZ** représente les jours calculés.



**EXEMPLES D'ENTRÉE/SORTIE :**

```
printYearsAndDays(525600); → devrait imprimer "525600 min = 1 an et 0 j"

printYearsAndDays(1051200); → devrait imprimer "1051200 min = 2 y et 0 d"

printYearsAndDays(561600); → devrait imprimer "561600 min = 1 an et 25 jours"
```


**CONSEILS:**

+ Faites très attention aux espaces dans le message imprimé.

+ Utiliser l'opérateur reste

    + 1 heure = 60 minutes

    + 1 jour = 24 heures

    + 1 an = 365 jours

**REMARQUES**

+ La méthode **printYearsAndDays** doit être définie comme **public static** comme nous l'avons fait jusqu'à présent dans le cours.

+ N'ajoutez pas de méthode principale au code de la solution.

+ La solution ne sera pas acceptée s'il y a des espaces supplémentaires