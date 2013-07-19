package ie.brianhenry.gwtbingmaps.client.api;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class Events extends JavaScriptObject {
	
	protected Events(){ }
	

	public static JavaScriptObject addHandler(Map target, String eventName, AsyncCallback<JavaScriptObject> callback) {
		return addHandler((JavaScriptObject) target, eventName, callback);
	}

	/**
	 * Attaches the handler for the event that is thrown by the target. Use the return object to remove the handler using the removeHandler method.
	 * 
	 * @param target
	 * @param eventName
	 * @param callback
	 * @return
	 */
	public static native JavaScriptObject addHandler(JavaScriptObject target, String eventName, AsyncCallback<JavaScriptObject> callback) /*-{
		$wnd.Microsoft.Maps.Events.addHandler(target, eventName, function(response){
    		@ie.brianhenry.gwtbingmaps.client.api.Events::callbackSuccess(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback,response);
		});
	}-*/;

	/*
     * Called when method succeeded.
     * Thanks gwtfb
     */
    public static void callbackSuccess(AsyncCallback<JavaScriptObject> callback, JavaScriptObject obj) {
    	callback.onSuccess (obj);
    }



    
}