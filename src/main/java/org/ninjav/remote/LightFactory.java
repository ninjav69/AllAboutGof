package org.ninjav.remote;

import org.ninjav.remote.devices.*;

/**
 * @author ninjav
 */
public interface LightFactory {

	/**
	 * 
	 * @param location
	 */
	Light createLight(String location);

}