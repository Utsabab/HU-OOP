package org.howard.edu.lsp.exam.question42;

import java.util.*;

/**
* This class provides methods to implement adding key, value in map, accessing keys and values.
* 
* @author Utsab Khakurel
* @version 1.0
* @since 2021-04-22
*/
public class SongsDatabase {
	private HashMap<String, Set<String>> map = new HashMap<String, Set<String>>();
	
	/**
	 * This method defines implementation to add genre as key in the hashmap if it doesn't exist,
	 * and add songTitle as a value type of Set.
	 * 
	 * @param genre The string variable defining genre of music where the songTitle should be added into.
	 * @param songTitle The string variable defining the song to be added into the given genre.
	 */
	public void addSong(String genre, String songTitle) {
		if (map.containsKey(genre)) {
			for(String keyGenre: map.keySet()) {
				if (keyGenre == genre) {
					Set<String> songs = map.get(keyGenre);
					songs.add(songTitle);
				}	
			}
		}
		else {
			Set<String> songTitles = new HashSet<>(Arrays.asList(songTitle));
			map.put(genre, songTitles);
		}
	}
	
	/**
	 * This method access the song for a given genre.
	 * 
	 * @param genre The string variable whose values should be returned from the method.
	 * @return The Set return type of list of songs for the given genre.
	 */
	public Set<String> getSongs(String genre) {
		Set<String> songs = Collections.emptySet();
		for(String keyGenre: map.keySet()) {
			if (keyGenre == genre) {
				Set<String> temp = map.get(keyGenre);
				songs = temp;
				return songs;
			}
		}
		return songs;
	}
	
	/**
	 * This method returns the genre type for the given songTitle.
	 * 
	 * @param songTitle The string variable defining the title of the song.
	 * @return	The string variable defining the genre of the given songTitle.
	 */
	public String getGenreOfSong(String songTitle) {
		for(String keyGenre: map.keySet()) {
			Set<String> songs = map.get(keyGenre);
			for(String song : songs) {
				if (song == songTitle) {
					return keyGenre;
				}
			}
		}
		return "";
	}

	/**
	 * This method functions as the check method to validate the results of the addSong method.
	 * This method checks whether method addSong added the genre and songTitle into the hashmap or not.
	 * 
	 * @param genre	The string variable defining the type of genre.
	 * @param song	The string variable defining the songtitle.
	 * @return	The boolean type validating the existence of given genre and songTitle in the hashmap.
	 */
	public boolean check(String genre, String song) {
		for(String keyGenre: map.keySet()) {
			if (keyGenre == genre) {
				Set<String> songs = map.get(keyGenre);
				Iterator<String> it = songs.iterator();
			    while(it.hasNext()){
			    	if (it.next() == song) {
			    		return true;
			    	}
			     }
			}
		}
		return false;
	}
}
