/**
 * 
 */
package org.vaadin.button.shared.ui.openpopupbutton;

import com.vaadin.shared.communication.ClientRpc;

/**
 * @author kamil
 *
 */
public interface OpenPopupButtonClientRpc extends ClientRpc {

	public void setWindowUrl(String url);

}
