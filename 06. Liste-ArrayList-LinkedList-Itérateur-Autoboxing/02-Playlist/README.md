# Playlist

+ Créez un programme qui implémente une liste de lecture de chansons.



**Pour commencer, implémentez les classes suivantes :**

**1.Album**

- Il comporte trois champs, deux chaînes appelées nom et artiste, et une ArrayList contenant des objets de type Song appelés chansons.

- Un constructeur qui accepte deux Strings (nom de l'album et de l'artiste). Il initialise les champs et instancie les chansons.

- Et trois méthodes, ce sont :

  - **addSong()**, possède deux paramètres de type String (titre de la chanson), double (durée de la chanson) et renvoie un booléen. Renvoie vrai si la chanson a été ajoutée avec succès ou faux dans le cas contraire.

  - **findSong()**, possède un paramètre de type String (titre de la chanson) et renvoie un Song. Renvoie le morceau s'il existe, null s'il n'existe pas.

  - **addToPlayList()**, a deux paramètres de type int (numéro de piste de la chanson dans l'album) et LinkedList (la playlist) qui contient des objets de type Song et renvoie un booléen. Renvoie vrai s'il existe et s'il a été ajouté avec succès à l'aide du numéro de piste, ou faux dans le cas contraire.

  - **addToPlayList()**, possède deux paramètres de type String (titre de la chanson) et LinkedList (la playlist) qui contient des objets de type Song, et renvoie un booléen. Renvoie vrai s'il existe et s'il a été ajouté avec succès en utilisant le nom de la chanson, ou faux dans le cas contraire.



**2. Song**

- Il comporte deux champs, un **String** appelée `title` et un **double** appelé `duration`.

- Un constructeur qui accepte un **String** (titre de la chanson) et un double (durée de la chanson). Il initialise le titre et la durée.

- Et deux méthodes, ce sont :

  - **getTitle()**, getter du titre.

  - **toString()**, Chansons remplaçant la méthode toString. Renvoie une chaîne au format suivant : "titre : durée"



**-> ÉCHANTILLON D'ENTRÉE**

```
ArrayList<Album> albums = new ArrayList<>();
 
Album album = new Album("Stormbringer", "Deep Purple");
album.addSong("Stormbringer", 4.6);
album.addSong("Love don't mean a thing", 4.22);
album.addSong("Holy man", 4.3);
album.addSong("Hold on", 5.6);
album.addSong("Lady double dealer", 3.21);
album.addSong("You can't do it right", 6.23);
album.addSong("High ball shooter", 4.27);
album.addSong("The gypsy", 4.2);
album.addSong("Soldier of fortune", 3.13);
albums.add(album);
 
album = new Album("For those about to rock", "AC/DC");
album.addSong("For those about to rock", 5.44);
album.addSong("I put the finger on you", 3.25);
album.addSong("Lets go", 3.45);
album.addSong("Inject the venom", 3.33);
album.addSong("Snowballed", 4.51);
album.addSong("Evil walks", 3.45);
album.addSong("C.O.D.", 5.25);
album.addSong("Breaking the rules", 5.32);
album.addSong("Night of the long knives", 5.12);
albums.add(album);
 
LinkedList<Song> playList = new LinkedList<Song>();
albums.get(0).addToPlayList("You can't do it right", playList);
albums.get(0).addToPlayList("Holy man", playList);
albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
albums.get(0).addToPlayList(9, playList);
albums.get(1).addToPlayList(3, playList);
albums.get(1).addToPlayList(2, playList);
albums.get(1).addToPlayList(24, playList);  // There is no track 24
```


**CONSEIL :** Dans Album, utilisez la méthode **findSong()** dans addSong() et addToPlayList(String, LinkedList) pour vérifier si une chanson existe avant de continuer.

**CONSEIL :** Soyez extrêmement prudent avec l’orthographe des noms des champs, des constructeurs et des méthodes.

**CONSEIL :** Soyez extrêmement prudent concernant les espaces et l'orthographe dans la chaîne renvoyée par la méthode toString().



**REMARQUE :** Tous les champs sont privés.

**REMARQUE :** tous les constructeurs sont publics.

**REMARQUE :** toutes les méthodes sont publiques (sauf findSong() qui est privée).

**REMARQUE :** Il n'y a pas de membres statiques.

**REMARQUE :** n'ajoutez pas de méthode principale au code de la solution.

**REMARQUE :** les classes qui ne figurent pas dans le package java.lang doivent être importées manuellement.

**REMARQUE :** si vous obtenez une erreur de la classe Evaluate, il s'agit probablement du constructeur. Vérifiez si vous avez ajouté un constructeur ou si le constructeur a les bons arguments.
