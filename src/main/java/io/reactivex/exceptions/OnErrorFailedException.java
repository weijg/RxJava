/**
 * Copyright 2016 Netflix, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */

package io.reactivex.exceptions;

public final class OnErrorFailedException extends RuntimeException {
    /** */
    private static final long serialVersionUID = 2656125445290831911L;

    public OnErrorFailedException(Throwable cause) {
        super(cause != null ? cause : new NullPointerException());
    }

    public OnErrorFailedException(String message, Throwable cause) {
        super(message, cause != null ? cause : new NullPointerException());
    }
}
