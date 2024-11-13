package dev.lowpexay.encurtaAI.Links;

import java.time.LocalDateTime;

public class LinkResponse {
	private Long id;
	private String urlLong;
	private String urlShort;
	private String urlQRCode;
	private LocalDateTime urlCreatedIn;
	
	public LinkResponse(Long id, String urlLong, String urlShort, String urlQRCode, LocalDateTime urlCreatedIn) {
		this.id = id;
		this.urlLong = urlLong;
		this.urlShort = urlShort;
		this.urlQRCode = urlQRCode;
		this.urlCreatedIn = urlCreatedIn;
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
