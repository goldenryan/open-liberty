/*
* IBM Confidential
*
* OCO Source Materials
*
* Copyright IBM Corp. 2017
*
* The source code for this program is not published or otherwise divested
* of its trade secrets, irrespective of what has been deposited with the
* U.S. Copyright Office.
*/
package com.ibm.jbatch.container.ws;

import java.util.List;

/**
 *
 */
public interface WSGroupAssociationState {

    public void setGroupName(long jobInstanceID, String groupName);

    public List<String> getGroupNamesByJobID(long JobInstanceID);

    public List<Long> getJobIDsByGroupName(String groupName);

}
