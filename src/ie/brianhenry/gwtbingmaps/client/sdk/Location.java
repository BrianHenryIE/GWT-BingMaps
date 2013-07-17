package ie.brianhenry.gwtbingmaps.client.sdk;

import com.google.gwt.core.client.JavaScriptObject;


public class Location extends JavaScriptObject { 
	
	protected Location(){ }
	
	public static Location getLocation(Double latitude, Double longitude) {
		return getLocation(String.valueOf(latitude), String.valueOf(longitude));
	}
	
	public static native Location getLocation(String latitude, String longitude) /*-{
		return new $wnd.Microsoft.Maps.Location(latitude, longitude);
	}-*/;
}