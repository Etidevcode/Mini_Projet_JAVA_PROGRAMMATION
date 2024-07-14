# Polymorphisme


+ Pour cet exercice, vous allez créer quatre classes de véhicules. La première classe devrait s'appeler Car. Ce sera la classe de base de trois autres classes, Mitsubishi, Holden et Ford.

+ La première classe contient quatre variables membres, ou champs, avec ces noms et conditions :

  + **engine** de type booléen

  + **cylinders** de type int

  + **name** du type Chaîne

  + **wheels** de type int




+ Les quatre variables membres doivent avoir un accès privé.

+ Le constructeur doit accepter deux paramètres, les cylindres et le nom. De plus, toutes ces voitures ont un moteur et quatre roues. Les deux autres champs doivent donc être définis sur les valeurs par défaut.

+ En outre, il existe cinq autres méthodes. Ces méthodes doivent être définies comme décrit ci-dessous :

+ **startEngine** n'accepte aucun paramètre et renvoie un message indiquant que le moteur de la voiture démarre.

+ Accélérer n'accepte aucun paramètre et renvoie un message indiquant que la voiture accélère.

+ Le frein n'accepte aucun paramètre et renvoie un message indiquant que la voiture freine.

+ Les messages renvoyés par ces méthodes doivent contenir quelque part le nom de la classe, Car.

+ Deux méthodes **getter** doivent également être définies ici pour les variables membres cylindres et nom. Toutes les méthodes ont un accès public.

+ Les trois autres classes mentionnées ci-dessus sont des sous-classes de Car. Ces classes n'ont pas de variables membres et le constructeur de chacune appellera le constructeur parent pour l'instanciation de l'objet. Chacune de ces classes remplacera les trois méthodes parentes **startEngine, accelerate, et brake**. Les messages de retour de ces méthodes doivent contenir quelque part le nom de la classe à laquelle appartiennent les méthodes.

**Exemple d'entrée :**

```
Car car = new Car(8, "Base car");
System.out.println(car.startEngine());
System.out.println(car.accelerate());
System.out.println(car.brake());
 
Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
System.out.println(mitsubishi.startEngine());
System.out.println(mitsubishi.accelerate());
System.out.println(mitsubishi.brake());
 
Ford ford = new Ford(6, "Ford Falcon");
System.out.println(ford.startEngine());
System.out.println(ford.accelerate());
System.out.println(ford.brake());
 
Holden holden = new Holden(6, "Holden Commodore");
System.out.println(holden.startEngine());
System.out.println(holden.accelerate());
System.out.println(holden.brake());
```

**Exemple de sortie :**

```
Car -> startEngine()
Car -> accelerate()
Car -> brake()
Mitsubishi -> startEngine()
Mitsubishi -> accelerate()
Mitsubishi -> brake()
Ford -> startEngine()
Ford -> accelerate()
Ford -> brake()
Holden -> startEngine()
Holden -> accelerate()
Holden -> brake()
```

**Remarques :**

+ N'oubliez pas que votre classe Main n'est pas incluse dans l'évaluation du code.

+ Vous devez coller le code de chacune de vos classes dans le fichier de classe correspondant dans l'évaluateur de code.

