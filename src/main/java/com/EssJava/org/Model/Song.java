package com.EssJava.org.Model;

public class Song {
	private int id;
	private String titolo;
	public Song(int id, String titolo) {
		super();
		this.id = id;
		this.titolo = titolo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	@Override
	public String toString() {
		return this.titolo;
	}
	
}
