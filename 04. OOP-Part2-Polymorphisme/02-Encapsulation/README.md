# Encapsulation


+ Dans cet exercice, vous allez créer une classe et la nommer Imprimante. Cette classe aura deux variables membres de type int, tonerLevel et pagesPrinted, et une de type booléen appelée duplex. Les trois champs auront un accès privé. Le constructeur acceptera deux de ces variables, tonerLevel et duplex, comme paramètres suivant ces règles :

+ **tonerLevel** doit être supérieur à -1 mais inférieur ou égal à 100. S'il ne remplit pas ces conditions alors il doit être initialisé à -1.

+ **duplex** doit être initialisé à la valeur du paramètre.

+ De plus, **pagesPrinted** doit être initialisé à 0.

+ Trois autres méthodes doivent ainsi être définies :

    + **addToner** acceptera un paramètre, tonerAmount de type int. Tout d’abord, tonerAmount doit être supérieur à 0 et inférieur ou égal à 100. Si cette condition est remplie, un deuxième test doit être inclus pour vérifier si tonerLevel plus tonerAmount sont supérieurs à 100. Si tel est le cas, la méthode doit renvoyer -1. Sinon, tonerLevel doit avoir le tonerAmount entrant ajouté et le nouveau tonerLevel doit ensuite être renvoyé par la méthode. De plus, si le test de condition initiale échoue, la méthode doit renvoyer -1.

    + **printPages** acceptera un paramètre, les pages de type int. Une variable appelée pagesToPrint doit être créée et initialisée à la valeur du paramètre entrant. Une vérification conditionnelle doit être effectuée pour savoir si le champ Classe d'imprimante, recto verso, est « vrai » ou « faux ». Si « vrai », un calcul doit être effectué pour déterminer le nombre de pages nécessaires pour imprimer le travail recto verso. La valeur pagesToPrint est ensuite ajoutée au champ de classe pagesPrinted, mais la valeur de pagesToPrint doit être renvoyée par la méthode.

    + **getPagesPrinted** n'a aucun paramètre et renvoie simplement la valeur de la variable membre pagesPrinted.

**Exemple d'entrée :**

```
Printer printer = new Printer(50, true);
System.out.println(printer.addToner(50));
System.out.println("initial page count = " +printer.getPagesPrinted());
int pagesPrinted = printer.printPages(4);
System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
pagesPrinted = printer.printPages(2);
System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
```

**Exemple de sortie :**

```
100
initial page count = 0
Printing in duplex mode
Pages printed was 2 new total print count for printer = 2
Printing in duplex mode
Pages printed was 1 new total print count for printer = 3
```

**Conseils :**

+ N'oubliez pas de coller uniquement le code de la classe **Printer** dans l'évaluateur d'exercices. Il n'est pas nécessaire de coller la classe **Main**.

+ Vous pouvez inclure un message dans la méthode **printPages** qui informe l'utilisateur que l'imprimante imprime en mode recto verso si duplex est égal à **"true"** si vous le souhaitez.

+ Lors du calcul de **pagesToPrint** si recto verso est égal à "vrai", rappelez-vous qu'il existe deux opérateurs qui peuvent vous aider. L'opérateur de division **"/"** divise un nombre et renvoie uniquement le quotient sans aucun reste. Et l'opérateur modulo **"%"** divise le nombre et renvoie uniquement le reste, que ce soit 0 ou non.