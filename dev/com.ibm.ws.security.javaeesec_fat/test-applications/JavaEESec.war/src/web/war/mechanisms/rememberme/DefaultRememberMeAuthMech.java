/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package web.war.mechanisms.rememberme;

import javax.enterprise.context.ApplicationScoped;
import javax.security.enterprise.authentication.mechanism.http.HttpAuthenticationMechanism;
import javax.security.enterprise.authentication.mechanism.http.RememberMe;

import web.war.mechanisms.BaseAuthMech;


//TODO: Remove implements HttpAuthenticationMechanism after fixing CDI extension to recognize mechanisms due to extends.
@ApplicationScoped
@RememberMe
public class DefaultRememberMeAuthMech extends BaseAuthMech implements HttpAuthenticationMechanism {

    public DefaultRememberMeAuthMech() {
        sourceClass = DefaultRememberMeAuthMech.class.getName();
    }

}
