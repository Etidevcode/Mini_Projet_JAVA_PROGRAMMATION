# Convertisseur de mégaoctets

+ Écrivez une méthode appelée **printMegaBytesAndKiloBytes** qui a 1 paramètre de type int avec le nom **kiloBytes**.

+ La méthode ne doit rien renvoyer **(void)** et doit calculer les mégaoctets et les kilo-octets restants à partir du paramètre kilo-octets.

+ Ensuite, il doit imprimer un message au format **"XX KB = YY MB et ZZ KB"**.

    + **XX** représente la valeur d'origine en kilo-octets.
    + **YY** représente les mégaoctets calculés.
    + **ZZ** représente les kilo-octets restants calculés.

+ Par exemple, lorsque le paramètre kiloBytes est de 2 500, il faut afficher "2 500 Ko = 2 Mo et 452 Ko".

+ Si le paramètre kiloBytes est inférieur à 0 alors imprimez le texte "Valeur invalide".

**EXEMPLE D'ENTRÉE/SORTIE**

```
printMegaBytesAndKiloBytes(2500); → doit imprimer le texte suivant : "2500 Ko = 2 Mo et 452 Ko"

printMegaBytesAndKiloBytes(-1024); → doit imprimer le texte suivant : "Valeur invalide" car le paramètre est inférieur à 0.

printMegaBytesAndKiloBytes(5000); → doit imprimer le texte suivant : "5000 Ko = 4 Mo et 904 Ko"
```


+ **CONSEIL** : Faites extrêmement attention aux espaces dans le message imprimé.

+ **CONSEIL** : utilisez l'opérateur reste

+ **CONSEIL** : 1 Mo = 1 024 Ko

+ **REMARQUE** : Ne définissez pas la valeur du paramètre kilo-octets dans votre méthode.

+ **REMARQUE** : La solution ne sera pas acceptée s'il y a des espaces supplémentaires.

+ **REMARQUE** : La méthode printMegaBytesAndKiloBytes doit être définie comme publique statique, comme nous l'avons fait jusqu'à présent dans le cours.
+ **REMARQUE** : n'ajoutez pas de méthode principale au code de la solution.
