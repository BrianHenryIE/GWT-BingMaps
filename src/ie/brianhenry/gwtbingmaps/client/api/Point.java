package ie.brianhenry.gwtbingmaps.client.api;

import com.google.gwt.core.client.JavaScriptObject;

public class Point extends JavaScriptObject {

	protected Point() {
	}

	// Unclear from documentation if this should be int or double
	public static native Point getPoint(int x, int y) /*-{
		var newPoint = new $wnd.Microsoft.Maps.Point(x, y);
		return newPoint;
	}-*/;

}