package com.EssJava.org.Controller;

public class Movie {
	String titolo;
	int id;
	public Movie(String titolo, int id) {
		this.titolo = titolo;
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Movie [titolo=" + titolo + ", id=" + id + "]";
	}
	
	
}