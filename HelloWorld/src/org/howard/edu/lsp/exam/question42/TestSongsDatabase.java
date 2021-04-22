package org.howard.edu.lsp.exam.question42;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
* The TestSongsDatabase class contains test methods for the implementations of class SongsDatabase .
* 
* @author Utsab Khakurel
* @version 1.0
* @since 2021-04-22
*/
class TestSongsDatabase {

	/**
	 * Checks if method addSongs adds the genre and the songTitle correctly in the HashMap or not.
	 * Checks the received and expected integer value to confirm the function works properly.
	 */
	@Test
	@DisplayName("Test cases for addSong")
	void testAddSong() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Rap", "No diggity");
		db.addSong("Soul", "Oogum Boogum");
		db.addSong("Soul", "September");
		db.addSong("Rock", "Californication");
		boolean receivingValue = db.check("Rock", "Californication");
		boolean expectedValue = true;
		assertEquals(expectedValue, receivingValue);
	}

	/**
	 * Checks if method getSongs correctly returns the list of songs in the given genre or not.
	 * Checks the received and expected integer value to confirm the function works properly.
	 */
	@Test
	@DisplayName("Test cases for getSongs")
	void testgetSongsFound() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Rap", "No diggity");
		db.addSong("Soul", "Oogum Boogum");
		Set<String> receivingValue = db.getSongs("Rap");
		Set<String> expectedValue = new HashSet<>(Arrays.asList("Savage", "Gin and Juice", "No diggity"));
		assertEquals(expectedValue, receivingValue);
	}
	
	/**
	 * Checks if method getSongs correctly returns the list of songs in the given genre or not.
	 * Checks the received and expected integer value to confirm the function works properly.
	 */
	@Test
	@DisplayName("Test cases for getSongs not found")
	void testgetSongsNotFound() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Rap", "No diggity");
		db.addSong("Soul", "Oogum Boogum");
		Set<String> receivingValue = db.getSongs("Rock");
		Set<String> expectedValue = new HashSet<>(Arrays.asList());
		assertEquals(expectedValue, receivingValue);
	}
	
	/**
	 * Checks if method getGenreOfSong returns the correct genre of the given songTitle or not.
	 * Checks the received and expected integer value to confirm the function works properly.
	 */
	@Test
	@DisplayName("Test cases for getGenreOfSong")
	void testGetGenreOfSongFound() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Rap", "No diggity");
		db.addSong("Soul", "Oogum Boogum");
		db.addSong("Soul", "September");
		db.addSong("Rock", "Californication");
		String receivingValue = db.getGenreOfSong("September");
		String expectedValue = "Soul";
		assertEquals(expectedValue, receivingValue);
	}
	
	/**
	 * Checks if method getGenreOfSong returns the correct genre of the given songTitle or not.
	 * Checks the received and expected integer value to confirm the function works properly.
	 */
	@Test
	@DisplayName("Test cases for getGenreOfSong not found")
	void testGetGenreOfSongNotFound() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Blues", "No diggity");
		db.addSong("Soul", "Oogum Boogum");
		db.addSong("Soul", "September");
		db.addSong("Rock", "Californication");
		String receivingValue = db.getGenreOfSong("Under the Bridge");
		String expectedValue = "";
		assertEquals(expectedValue, receivingValue);
	}
}
