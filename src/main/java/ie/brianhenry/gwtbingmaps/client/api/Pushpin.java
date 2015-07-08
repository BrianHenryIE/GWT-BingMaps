package ie.brianhenry.gwtbingmaps.client.api;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author BrianHenry.ie
 *
 * @see http://msdn.microsoft.com/en-us/library/gg427615.aspx
 */
public class Pushpin extends JavaScriptObject {

	protected Pushpin() {
	}

	/**
	 * @param location
	 * @param options
	 * @return
	 */
	public static native Pushpin getPushpin(Location location, PushpinOptions options) /*-{
		var pushpin = new $wnd.Microsoft.Maps.Pushpin(location, options);
		return pushpin;
	}-*/;

	/**
	 * Returns the point on the pushpin icon which is anchored to the pushpin
	 * location. An anchor of (0,0) is the top left corner of the icon.
	 */
	public final native Point getAnchor() /*-{
		return this.getAnchor()
	}-*/;

	/** Returns the pushpin icon. */
	public final native String getIcon() /*-{
		return this.getIcon()
	}-*/;

	/**
	 * Returns the height of the pushpin, which is the height of the pushpin
	 * icon.
	 */
	public final native int getHeight() /*-{
		return this.getHeight()
	}-*/;

	/** Returns the location of the pushpin. */
	public final native Location getLocation() /*-{
		return this.getLocation()
	}-*/;

	/** Returns the text associated with the pushpin. */
	public final native String getText() /*-{
		return this.getText()
	}-*/;

	/** Returns the amount the text is shifted from the pushpin icon. */
	public final native Point getTextOffset() /*-{
		return this.getTextOffset()
	}-*/;

	/** Returns the type of the pushpin. */
	public final native String getTypeName() /*-{
		return this.getTypeName()
	}-*/;

	/**
	 * Returns whether the pushpin is visible. A value of false indicates that
	 * the pushpin is hidden, although it is still an entity on the map.
	 */
	public final native boolean getVisible() /*-{
		return this.getVisible()
	}-*/;

	/**
	 * Returns the width of the pushpin, which is the width of the pushpin icon.
	 */
	public final native int getWidth() /*-{
		return this.getWidth()
	}-*/;

	/**
	 * Returns the z-index of the pushpin with respect to other items on the
	 * map.
	 */
	public final native int getZIndex() /*-{
		return this.getZIndex()
	}-*/;

	/**
	 * Sets the location of the pushpin.
	 */
	public final native void setLocation(Location location) /*-{
		this.setLocation(location)
	}-*/;

	/**
	 * Sets options for the pushpin.
	 */
	public final native void setOptions(PushpinOptions options) /*-{
		this.setOptions(options)
	}-*/;

	/**
	 * Converts the Pushpin object to a string.
	 */
	public final native String toStringMethod() /*-{
		this.toString()
	}-*/;

}
