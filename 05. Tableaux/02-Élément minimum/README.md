# Élément minimal

+ Écrivez une méthode appelée readInteger() qui n'a aucun paramètre et renvoie un int.

+ Il doit lire un entier provenant de l'utilisateur - cela représente le nombre d'éléments que l'utilisateur doit saisir.

+ Écrivez une autre méthode appelée readElements() qui a un paramètre de type int

+ La méthode doit lire depuis la console jusqu'à ce que tous les éléments soient saisis, puis renvoyer un tableau contenant les éléments saisis.

+ Et enfin, écrivez une méthode appelée findMin() avec un paramètre de type int[]. La méthode doit renvoyer la valeur minimale du tableau.



**Le scénario est le suivant :**

1. **readInteger()** est appelé.

2. Le nombre renvoyé par **readInteger()** est ensuite utilisé pour appeler **readElements()**.

3. Le tableau renvoyé par **readElements()** est utilisé pour appeler **findMin()**.

4. **findMin()** renvoie le nombre minimum.

*[N'essayez pas de mettre en œuvre cela. C'est pour vous donner une idée de la façon dont les méthodes seront utilisées.]*



**CONSEIL :** Supposons que l'utilisateur entre uniquement des chiffres, jamais des lettres.

**CONSEIL :** instanciez (créez) l’objet Scanner à l’intérieur de la méthode. Il existe deux objets scanner, un pour chacune des deux méthodes qui lisent les entrées de l'utilisateur.

**CONSEIL :** Faites extrêmement attention aux espaces dans le message imprimé.



**REMARQUE :** toutes les méthodes doivent être définies comme statiques privées.

**REMARQUE :** n'ajoutez pas de méthode principale au code de la solution.

**REMARQUE :** les classes qui ne figurent pas dans le package java.lang doivent être importées manuellement.