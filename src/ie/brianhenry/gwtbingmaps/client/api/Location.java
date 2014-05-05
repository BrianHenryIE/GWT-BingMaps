package ie.brianhenry.gwtbingmaps.client.api;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author brianhenry.ie
 * 
 */
public class Location extends JavaScriptObject {

	protected Location() {
	}

	/**
	 * @return The altitude of the location.
	 */
	public final native double getAltitude() /*-{
		return this.altitude;
	}-*/;

	// The reference from which the altitude is measured.
	// public final native AltitudeReference getAltitudeReference() /*-{ return this.altitudeReference; }-*/;

	/**
	 * @return The latitude of the location.
	 */
	public final native double getLatitude() /*-{
		return this.latitude;
	}-*/;

	/**
	 * @return The longitude of the location.
	 */
	public final native double getLongitude() /*-{
		return this.longitude;
	}-*/;

	public static Location newLocation(Double latitude, Double longitude) {
		return newLocation(String.valueOf(latitude), String.valueOf(longitude));
	}

	public static native Location newLocation(String latitude, String longitude) /*-{
		return new $wnd.Microsoft.Maps.Location(latitude, longitude);
	}-*/;

}