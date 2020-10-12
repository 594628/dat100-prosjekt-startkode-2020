package no.hvl.dat100ptc.oppgave1;

import no.hvl.dat100ptc.TODO;

public class GPSPoint {

	private int time; 
	private double latitude; 
	private double longitude; 
	private double elevation;
		
	public GPSPoint(int time, double latitude, double longitude, double elevation) {

		this.time = time;  
		this.latitude = latitude; 
		this.longitude = longitude; 
		this.elevation = elevation; 
	}

	// TODO - get/set metoder
	public int getTime() {
		
		
		return this.time;
	}

	public void setTime(int time) {
				
		
		time = this.time; 
		
	}

	public double getLatitude() {
		
		
		return this.latitude; 
	}

	public void setLatitude(double latitude) {
		
		latitude = this.latitude; 
		
	}

	public double getLongitude() {
		
		return this.longitude; 
		
	}

	public void setLongitude(double longitude) {
		
		longitude = this.longitude; 
		
	}

	public double getElevation() {
		
		return this.elevation; 
		
	}

	public void setElevation(double elevation) {
		
		elevation = this.elevation; 
		
	}
	
	public String toString() {
		
		String str = (time + " (" + latitude + "," + longitude + ") " + elevation + "\n");
		
		return str; 
	
	}
}
