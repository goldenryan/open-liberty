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
package com.ibm.jbatch.container.persistence.jpa;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
                @NamedQuery(name = JobInstanceEntityV3.GET_ALL_GROUPNAMES_BY_JOBINSTANCE_QUERY, query = "SELECT i.groupNames FROM JobInstanceEntityV3 i WHERE i.instanceId = :jobinstanceID"),
                @NamedQuery(name = JobInstanceEntityV3.GET_ALL_JOBINSTANCES_BY_GROUPNAME_QUERY, query = "SELECT i FROM JobInstanceEntityV3 i WHERE i.groupNames IN :groups"),
                @NamedQuery(name = JobInstanceEntityV3.IS_JOB_ACCESSIBLE_BY_ANY_GROUP_QUERY, query = "SELECT i FROM JobInstanceEntityV3 i WHERE i = :jobinstanceid AND i.groupNames IN :groups"),
})

/**
 *
 */
@Entity
public class JobInstanceEntityV3 extends JobInstanceEntityV2 {

    public static final String GET_ALL_GROUPNAMES_BY_JOBINSTANCE_QUERY = "JobInstanceEntityV3.getAllGroupnamesByJobInstanceQuery";
    public static final String GET_ALL_JOBINSTANCES_BY_GROUPNAME_QUERY = "JobInstanceEntityV3.getAllJobInstancesByGroupnameQuery";
    public static final String IS_JOB_ACCESSIBLE_BY_ANY_GROUP_QUERY = "JobInstanceEntityV3.isJobAccessibleByGroupsQuery";

    @ElementCollection
    @CollectionTable(name = "GROUPASSOCIATION", joinColumns = @JoinColumn(name = "FK_JOBINSTANCEID"))
    @Column(name = "GROUPNAME")
    private Set<String> groupNames;

    // For JPA
    public JobInstanceEntityV3() {
        super();
    }

    // For in-memory persistence
    public JobInstanceEntityV3(long jobInstanceId) {
        super(jobInstanceId);
    }

    public void setGroupNames(Set<String> opGroupNames) {

        groupNames = opGroupNames;
    }

    @Override
    public Set<String> getGroupNames() {
        return groupNames;
    }

}
