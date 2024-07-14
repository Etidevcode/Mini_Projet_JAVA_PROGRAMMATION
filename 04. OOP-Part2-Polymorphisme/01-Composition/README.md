# Composition


+ Il s’agit d’un exercice de composition de classe. Pour terminer l'exercice, vous devez créer cinq classes avec les variables et méthodes membres associées.

+ Les cinq classes doivent être créées comme suit :

1) Créez une classe et nommez-la **Lamp**. À l'intérieur de cette classe doivent être déclarées trois variables membres : **style** de type **String**, **battery** de type **boolean** et **globRating** de type **int**. Toutes les variables doivent être marquées comme privées. Un constructeur doit être créé qui accepte les trois variables membres comme paramètres. De plus, quatre méthodes doivent également être créées : **turnOn()** n'a pas de type de retour et doit afficher un message indiquant que la lampe est en cours d'allumage ; **getStyle()** renvoie le style de la lampe ; isBattery renvoie la valeur de la batterie ; et **getGlobRating()** renvoie le **globRating** de la lampe.

2) Créez une classe et nommez-la **Bed**. Cinq variables membres privées doivent être déclarées : style de type String et oreillers, hauteur, draps, couette de type int. Un constructeur doit être codé pour accepter ces cinq variables membres comme paramètres. De plus, six méthodes doivent être définies : **make()** n'a pas de type de retour et affiche un message indiquant que le lit est en train d'être fait ; **getStyle()** qui renvoie la valeur de style ; **getPillows()** renvoie le nombre d'oreillers ; **getHeight()** renvoie la hauteur du lit ; **getSheets()** renvoie le nombre de draps sur le lit ; et **getQuilt()** renvoie la valeur de quilt.

3) Créez une classe avec le nom **Ceiling**. Il existe deux variables membres pour celle-ci, height et **PaintedColor**, toutes deux de type **int**. Il devrait également y avoir un constructeur qui accepte les deux variables membres comme paramètres. Il existe également deux méthodes supplémentaires qui doivent être définies : **getHeight()** doit renvoyer la valeur de **height** et **getPaintedColor()** doit renvoyer la valeur de PaintedColor.

4) Créez une classe avec le nom **Wall**. Il contient une variable membre, une direction et est de type String. Un constructeur pour **Wall** doit accepter un paramètre pour la direction de la variable membre. Un getter doit également être défini pour le champ de direction appelé **getDirection()**.

5) Créez une classe avec le nom **Bedroom**. Cette classe contient huit variables membres :

+ nom du type **String; wall1, wall2, wall3, wall4** de type **Wall**; **ceiling** de type **Ceiling**; lit de type **Bed** et lamp de type **Lamp**. Le constructeur de classe doit accepter les huit variables membres comme paramètres, et il doit également y avoir deux méthodes supplémentaires :

+ **getLamp()** qui renvoie un objet de type **Lamp** et **makeBed()** qui imprime un message indiquant que le lit est en cours de fabrication et appelle également la méthode make() dans la classe Bed.

**Entrée sortie :**

+ Une fois que vous avez terminé de coder vos classes, vous devez ensuite utiliser le code suivant dans votre classe principale pour tester votre code et obtenir une sortie correcte. De cette façon, vous pouvez être sûr que votre code fonctionne avant de coller vos cinq classes dans l'évaluateur de code.

```
Wall wall1 = new Wall("West");
Wall wall2 = new Wall("East");
Wall wall3 = new Wall("South");
Wall wall4 = new Wall("North");
 
Ceiling ceiling = new Ceiling(12, 55);
 
Bed bed = new Bed("Modern", 4, 3, 2, 1);
 
Lamp lamp = new Lamp("Classic", false, 75);
 
Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
bedRoom.makeBed();
 
bedRoom.getLamp().turnOn();
```

**Conseils:**

+ N'oubliez pas qu'après le test, vous ne mettrez pas votre méthode principale dans l'évaluateur de code. Vous collerez uniquement vos cinq classes que vous avez créées dans l'exercice.

+ Pour être sûr que la sortie correcte est générée afin que votre code réussisse l'évaluation, utilisez les instructions suivantes dans votre code :

1) `System.out.print("Bedroom -> Making bed | ");` doit être utilisé dans la méthode makeBed() de la classe Bedroom ;

2) `System.out.print("Bed -> Making | ");` doit être utilisé dans la méthode make() de la classe Bed ; et

3) `System.out.print("Lamp -> Turning on");` doit être utilisé dans la méthode turnOn() de la classe Lamp.




