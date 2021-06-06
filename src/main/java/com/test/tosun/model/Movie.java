package com.test.tosun.model;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "namemovies")
	private String name;

	@Column(name = "publicationyearmovies")
	private int publicationYear;

	@Column(name = "typemovies")
	private String type;

	@Column(name = "descriptionmovies")
	private String description;

	@Column(name = "mediamovies")
	private String media;

	@Column(name = "languagemovies")
	private String language;
	
	@Column(name = "actorname")
	private String actorName;

	public Movie() {
	}

	public Movie(String name, int publicationYear, String type, String description, String media,
			String language, String actorName) {
		this.name = name;
		this.publicationYear = publicationYear;
		this.type = type;
		this.description = description;
		this.media = media;
		this.language = language;
		this.actorName = actorName;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
