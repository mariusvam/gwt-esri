package edu.ucdavis.cstars.client.callback;

import edu.ucdavis.cstars.client.event.ErrorHandler;
import edu.ucdavis.cstars.client.event.GetResultImageHandler;

/**
 * Fires when a map image is generated by invoking the getResultImage() method.
 * 
 * @author Justin Merz
 */
public interface GetResultImageCallback extends GetResultImageHandler, ErrorHandler {}