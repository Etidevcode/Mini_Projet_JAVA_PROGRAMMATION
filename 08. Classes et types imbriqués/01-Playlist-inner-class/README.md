# Playlist - Classe intérieure


+ Pour cet exercice, vous aurez besoin de vos classes d'album et de chanson de l'exercice de codage de liste de lecture.

+ La classe Album sera modifiée pour utiliser une classe interne appelée SongList qui remplacera la ArrayList utilisée pour contenir la liste des chansons d'un album.

+ La classe interne SongList utilisera une ArrayList pour contenir la liste des pistes de l'album. Pour ce faire, une variable membre appelée songs devra être déclarée et un constructeur devra être implémenté pour initialiser le champ.

**De plus, la classe interne aura besoin de trois(3) méthodes :**

1) add - accepte un paramètre de type Song. Cette méthode renvoie une valeur booléenne qui sera fausse si la chanson se trouve déjà dans la liste des chansons. Sinon, la chanson sera ajoutée à la liste et une valeur true sera renvoyée.

2) findSong - accepte le titre d'une chanson comme seul paramètre. Si la chanson portant ce titre est trouvée dans la liste, la méthode renvoie la chanson. Sinon, une valeur null est renvoyée.

3) findSong - méthode remplacée qui accepte un numéro de piste pour une chanson. Le numéro de piste est de type int. Si une chanson est trouvée avec ce numéro de piste, la chanson est renvoyée, sinon null est renvoyé.

La variable membre, le constructeur et toutes les méthodes peuvent être marqués avec un accès privé.

***IMPORTANT*** - Si vous utilisez un IDE pour écrire ce code, votre classe interne peut être marquée avec un accès privé. Cependant, aux fins de cette évaluation de code, veuillez marquer la classe elle-même comme publique statique.



**Il n'y a que trois méthodes dans la classe album.**

1) addSong (titre de la chaîne, double durée)

2) addToPlayList (int trackNumber, LinkedList<Song> playList)

3) addToPlayList (titre de la chaîne, LinkedList<Song> playList)


+ Modifiez le code de ces trois méthodes afin qu'il utilise la classe interne SongList plutôt que le champ ArrayList.



**Exemple d'entrée :**

