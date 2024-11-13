package dev.lowpexay.encurtaAI.Links;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "links")

public class Link {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String originalUrl; 
	private String urlLong;
	private String urlShort;
	private String urlQRCode;
	private LocalDateTime urlCreatedIn;
	
	// No-argument constructor
    public Link() {
    }
	
	public Link(Long id, String urlLong, String urlShort, String urlQRCode, LocalDateTime urlCreatedIn) {
		this.id = id;
		this.urlLong = urlLong;
		this.urlShort = urlShort;
		this.urlQRCode = urlQRCode;
		this.urlCreatedIn = urlCreatedIn;
	}
	
	public Link(Long id) {
		this.id = id;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrlLong() {
		return urlLong;
	}

	public void setUrlLong(String urlLong) {
		this.urlLong = urlLong;
	}

	public String getUrlShort() {
		return urlShort;
	}

	public void setUrlShort(String urlShort) {
		this.urlShort = urlShort;
	}

	public String getUrlQRCode() {
		return urlQRCode;
	}

	public void setUrlQRCode(String urlQRCode) {
		this.urlQRCode = urlQRCode;
	}

	public LocalDateTime getUrlCreatedIn() {
		return urlCreatedIn;
	}

	public void setUrlCreatedIn(LocalDateTime urlCreatedIn) {
		this.urlCreatedIn = urlCreatedIn;
	}
	
	
	
	
}
