/**
 * Copyright (c) 2014,2019 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.io.transport.serial;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * Exception that marks that a driver does not allow the specific operation.
 *
 * @author Markus Rathgeb - Initial contribution
 */
@NonNullByDefault
public class UnsupportedCommOperationException extends Exception {

    private static final long serialVersionUID = 1L;

    public UnsupportedCommOperationException() {
        super();
    }

    public UnsupportedCommOperationException(Throwable cause) {
        super(cause);
    }
}
