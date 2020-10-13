package no.hvl.dat100ptc.oppgave3;

import static java.lang.Math.*;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSUtils
{

    public static double findMax(double[] da)
    {

        double max;

        max = da[0];

        for (double d : da)
        {
            if (d > max)
            {
                max = d;
            }
        }

        return max;
    }

    public static double findMin(double[] da)
    {

        double min;

        min = da[0];

        for (double d : da)
        {
            if (d < min)
            {
                min = d;
            }
        }

        return min;
    }

    public static double[] getLatitudes(GPSPoint[] gpspoints)
    {
        double[] latitudes = new double[gpspoints.length];
        for (int i = 0; i < latitudes.length; i++)
        {
            latitudes[i] = gpspoints[i].getLatitude();
        }

        return latitudes;
    }

    public static double[] getLongitudes(GPSPoint[] gpspoints)
    {
        double[] longditudes = new double[gpspoints.length];
        for (int i = 0; i < longditudes.length; i++)
        {
            longditudes[i] = gpspoints[i].getLongitude();
        }

        return longditudes;
    }

    private static int R = 6371000; // jordens radius

    public static double distance(GPSPoint gpspoint1, GPSPoint gpspoint2)
    {
        double d;
        double latitude1, longitude1, latitude2, longitude2;
        double tLat, tLong;

        latitude1 = Math.toRadians(gpspoint1.getLatitude());
        longitude1 = Math.toRadians(gpspoint1.getLongitude());

        latitude2 = Math.toRadians(gpspoint2.getLatitude());
        longitude2 = Math.toRadians(gpspoint2.getLongitude());

        tLat = latitude2 - latitude1;
        tLong = longitude2 - longitude1;

        double a = pow(sin(tLat / 2), 2) + cos(latitude1) * cos(latitude2) * pow(sin(tLong / 2), 2);
        double c = 2 * atan2(sqrt(a), sqrt(1 - a));
        d = R * c;

        return d;
    }

    public static double speed(GPSPoint gpspoint1, GPSPoint gpspoint2)
    {
        int secs = gpspoint2.getTime();
        double speed;
        double distance = distance(gpspoint1,gpspoint2);

        if (secs > gpspoint1.getTime())
            secs = secs - gpspoint1.getTime();
        else
            secs = gpspoint1.getTime() - secs;

        speed = distance / secs * 3.6;

        return speed;
    }

    public static String formatTime(int secs)
    {
        String timestr;
        String TIMESEP = ":";

        timestr = String.format("%010d", secs);

        return timestr;
    }

    private static int TEXTWIDTH = 10;

    public static String formatDouble(double d)
    {
        String str;

        // TODO - START

        throw new UnsupportedOperationException(TODO.method());

        // TODO - SLUTT

    }
}
