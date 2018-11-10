/*
 * Copyright 2018 Rohit Awate.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rohitawate.everest.state.auth;

import com.rohitawate.everest.auth.oauth2.AccessToken;
import com.rohitawate.everest.controllers.auth.oauth2.AuthorizationCodeController.CaptureMethod;

public class AuthorizationCodeState {

    public AuthorizationCodeState() {
        String empty = "";
        this.grantCaptureMethod = CaptureMethod.BROWSER;
        this.authURL = empty;
        this.accessTokenURL = empty;
        this.redirectURL = empty;
        this.clientID = empty;
        this.clientSecret = empty;
        this.scope = empty;
        this.state = empty;
        this.headerPrefix = empty;
        this.accessToken = new AccessToken();
    }

    public AuthorizationCodeState(String grantCaptureMethod, String authURL, String accessTokenURL, String redirectURL, String clientID,
                                  String clientSecret, String scope, String state, String headerPrefix,
                                  AccessToken accessToken, boolean enabled) {
        this.grantCaptureMethod = grantCaptureMethod;
        this.authURL = authURL;
        this.accessTokenURL = accessTokenURL;
        this.redirectURL = redirectURL;
        this.clientID = clientID;
        this.clientSecret = clientSecret;
        this.scope = scope;
        this.state = state;
        this.headerPrefix = headerPrefix;
        this.accessToken = accessToken;
        this.enabled = enabled;
    }

    public String grantCaptureMethod;

    public String authURL;
    public String accessTokenURL;
    public String redirectURL;

    public String clientID;
    public String clientSecret;

    public String scope;
    public String state;
    public String headerPrefix;

    public AccessToken accessToken;

    public boolean enabled;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthorizationCodeState that = (AuthorizationCodeState) o;
        if (!grantCaptureMethod.equals(that.grantCaptureMethod)) return false;
        if (!authURL.equals(that.authURL)) return false;
        if (!accessTokenURL.equals(that.accessTokenURL)) return false;
        if (!redirectURL.equals(that.redirectURL)) return false;
        if (!clientID.equals(that.clientID)) return false;
        if (!clientSecret.equals(that.clientSecret)) return false;
        if (!scope.equals(that.scope)) return false;
        if (!state.equals(that.state)) return false;
        if (!headerPrefix.equals(that.headerPrefix)) return false;
        if (!accessToken.equals(that.accessToken)) return false;
        if (enabled != that.enabled) return false;

        return true;
    }
}
