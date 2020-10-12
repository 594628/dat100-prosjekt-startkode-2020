package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;
import static java.lang.Integer.parseInt; 


public class GPSDataConverter {

	// konverter tidsinformasjon i gps data punkt til antall sekunder fra midnatt
	// dvs. ignorer information om dato og omregn tidspunkt til sekunder
	// Eksempel - tidsinformasjon (som String): 2017-08-13T08:52:26.000Z
    // skal omregnes til sekunder (som int): 8 * 60 * 60 + 52 * 60 + 26 
	
	private static int TIME_STARTINDEX = 11; // startindex for tidspunkt i timestr

	public static int toSeconds(String timestr) {
		
		int secs;
		int hr, min, sec;
		
		hr = Integer.parseInt(timestr.substring(11,13));
		min = Integer.parseInt(timestr.substring(14,16)); 
		sec = Integer.parseInt(timestr.substring(17,19));
		
		secs = hr * 60 * 60 + min * 60 + sec; 
		
		return secs; 
		
	}

	public static GPSPoint convert(String timeStr, String latitudeStr, String longitudeStr, String elevationStr) {

		GPSPoint gpspoint;
		int time = Integer.parseInt(timeStr.substring(11,13));
		int latitude = Integer.parseInt(latitudeStr); 
		int longitude = Integer.parseInt(longitudeStr); 
		int elevation = Integer.parseInt(elevationStr); 
		
		return gpspoint(time, latitude, longitude, elevation);
	    
	}
	
}
