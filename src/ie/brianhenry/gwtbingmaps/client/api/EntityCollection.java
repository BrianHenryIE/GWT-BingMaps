package ie.brianhenry.gwtbingmaps.client.api;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author brianhenry
 * @see http://msdn.microsoft.com/en-us/library/gg427616.aspx
 */
public class EntityCollection extends JavaScriptObject {
	
	protected EntityCollection(){ }
	
	
	/**
	 * Removes all entities from the collection.
	 */
	public final native void clear() /*-{
		this.clear();
	}-*/;
	
	
	/**
	 * Returns the entity at the specified index in the collection.
	 * 
	 * @param index
	 * @return An Entity can be any one of the following types: Infobox, Polygon, Polyline, Pushpin, TileLayer, or EntityCollection.
	 */
	public final native JavaScriptObject get(int index) /*-{
		return this.get(index);
	}-*/;


	/**
	 * @return the number of entities in the collection.
	 */
	public final native int getLength() /*-{
		return this.getLength();
	}-*/;


	/**
	 * @return whether the entity collection is visible on the map. 
	 */
	public final native boolean getVisible() /*-{
		return this.getVisible();
	}-*/;


	/**
	 * @return the z-index of the entity collection with respect to other items on the map.
	 */
	public final native int getZIndex() /*-{
		return this.getZIndex();
	}-*/;


	/**
	 * @param entity
	 * @return the index of the specified entity in the collection. If the entity is not found in the collection, -1 is returned.
	 */
	public final native int indexOf(JavaScriptObject entity) /*-{
		return this.indexOf(entity);
	}-*/;


	/**
	 * Inserts the specified entity into the collection at the given index.
	 * 
	 * @param entity
	 * @param index
	 */
	public final native void insert(JavaScriptObject entity, int index) /*-{
		this.insert(entity, index);
	}-*/;


	/**
	 * @return Removes the last entity from the collection and returns it.
	 */
	public final native JavaScriptObject pop() /*-{
		return this.pop();
	}-*/;


	/**
	 * Adds the specified entity to the last position in the collection.
	 * 
	 * @param entity
	 */
	public final native void push(JavaScriptObject entity) /*-{
		this.push(entity);
	}-*/;


	/**
	 * @param entity
	 * @return Removes the specified entity from the collection and returns it.
	 */
	public final native JavaScriptObject remove(JavaScriptObject entity) /*-{
		return this.remove(entity);
	}-*/;


	/**
	 * @param index
	 * @return Removes the entity at the specified index from the collection and returns it.
	 */
	public final native JavaScriptObject removeAt(int index) /*-{
		return this.removeAt(index);
	}-*/;


	/**
	 * Sets the options for the entity collection.
	 * 
	 * @param options
	 */
	public final native void setOptions(EntityCollectionOptions options) /*-{
		this.setOptions(options);
	}-*/;


	/**
	 * @return Converts the EntityCollection object to a string.
	 */
	public final native String toStringJS() /*-{
		return this.toString();
	}-*/;


	

	
}