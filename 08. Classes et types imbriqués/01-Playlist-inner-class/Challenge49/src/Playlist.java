import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist {

	private ArrayList<Album> albums = new ArrayList<>();

	public boolean addAlbum(String name, String artist) {
		var album = findAlbum(name);
		if (album == null) {
			albums.add(new Album(name, artist));
			return true;
		}
		return false;
	}

	public Album findAlbum(String name) {
		for (var album : albums) {
			if (album.getName().equals(name)) {
				return album;
			}
		}
		return null;
	}

	public boolean addToPlaylist(String albumName, String songTitle, LinkedList<Song> playlist) {
		var album = findAlbum(albumName);
		if (album != null) {
			return album.addToPlayList(songTitle, playlist);
		}
		return false;
	}

	public boolean addToPlaylist(String albumName, int trackNumber, LinkedList<Song> playlist) {
		var album = findAlbum(albumName);
		if (album != null) {
			return album.addToPlayList(trackNumber, playlist);
		}
		return false;
	}

	public static class Song {
		private String title;
		private double duration;

		public Song(String title, double duration) {
			this.title = title;
			this.duration = duration;
		}

		public String getTitle() {
			return title;
		}
	}

	public static class SongList {
		public ArrayList<Song> songs = new ArrayList<>();

		public boolean add(Song song) {
			if (findSong(song.getTitle()) == null) {
				songs.add(song);
				return true;
			}
			return false;
		}

		public Song findSong(String title) {
			for (var song : songs) {
				if (song.getTitle().equals(title)) {
					return song;
				}
			}
			return null;
		}

		public Song findSong(int trackNumber) {
			if (trackNumber >= 1 && trackNumber <= songs.size()) {
				return songs.get(trackNumber - 1);
			}
			return null;
		}
	}

	public static class Album {
		private String name;
		private String artist;
		private SongList songList;

		public Album(String name, String artist) {
			this.name = name;
			this.artist = artist;
			this.songList = new SongList();
		}

		public String getName() {
			return name;
		}

		public String getArtist() {
			return artist;
		}

		public void addSong(String title, double duration) {
			songList.add(new Song(title, duration));
		}

		public boolean addToPlayList(String songIdentifier, LinkedList<Song> playlist) {
			var song = songList.findSong(songIdentifier);
			if (song != null) {
				playlist.add(song);
				return true;
			} else {
				System.out.println("The song " + songIdentifier + " is not in this album");
				return false;
			}
		}

		public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
			var song = songList.findSong(trackNumber);
			if (song != null) {
				playlist.add(song);
				return true;
			} else {
				System.out.println("This album does not have a track " + trackNumber);
				return false;
			}
		}
	}
}
