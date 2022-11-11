package br.com.erudio.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Date timeStemps;
	private String menssage;
	private String details;
	
	public ExceptionResponse(Date timeStemps, String menssage, String details) {
		this.timeStemps = timeStemps;
		this.menssage = menssage;
		this.details = details;
	}

	public Date getTimeStemps() {
		return timeStemps;
	}

	public void setTimeStemps(Date timeStemps) {
		this.timeStemps = timeStemps;
	}

	public String getMenssage() {
		return menssage;
	}

	public void setMenssage(String menssage) {
		this.menssage = menssage;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	
}
