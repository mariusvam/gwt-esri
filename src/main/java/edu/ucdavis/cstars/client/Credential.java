package edu.ucdavis.cstars.client;

import com.google.gwt.core.client.JavaScriptObject;

import edu.ucdavis.cstars.client.dojo.Deferred;
import edu.ucdavis.cstars.client.event.TokenChangeHandler;

/**
 * The Credential class represents a credential object used to access a secure ArcGIS resource.
 * 
 * @author Justin Merz
 */
public class Credential extends JavaScriptObject {
	
	protected Credential() {}
	
	/**
	 * Token expiration time specified as number of milliseconds since 1 January 1970 00:00:00 UTC.
	 * 
	 * @return String
	 */
	public final native String getExpires() /*-{
		return this.expires;
	 }-*/;
	
	/**
	 * The server url.
	 * 
	 * @return String
	 */
	public final native String getServer() /*-{
		return this.server;
	}-*/;
	
	/**
	 * Token generated by the token service using the specified userId and password.
	 * 
	 * @return String
	 */
	public final native String getToken() /*-{
		return this.token;
	}-*/;
	
	/**
	 * User associated wth the Credential object.
	 * 
	 * @return String
	 */
	public final native String getUserId() /*-{
		return this.userId;
	}-*/;
	
	/**
	 * Generate a new token and update the Credential's token property with the newly acquired token. 
	 * Tokens are typically kept valid using a timer that automatically triggers a refresh before the token 
	 * expires. Use this method in cases where the timer has been delayed or stopped.
	 * 
	 * @return Deferred
	 */
	public final native Deferred refreshToken() /*-{
		return this.refreshToken();
	}-*/;
	
	/**
	 * Add handler to listen to token change events.
	 * 
	 * @param handler - Handler to fire when token changes.
	 */
	public final native void addTokenChangeHandler(TokenChangeHandler handler) /*-{
		$wnd.dojo.connect(this, "onTokenChange",
			function() {
				handler.@edu.ucdavis.cstars.client.event.TokenChangeHandler::onTokenChange()();
			}
		);
	}-*/;

}