// Copyright 2011, Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.dfa.axis.testing.mocks.v1_12;

import java.net.URL;

/**
 * Copy of autogenerated class for testing.
 */
public class LoginRemoteServiceLocator implements LoginRemoteService {

  public static final String LOGIN_ADDRESS = "address";

  public LoginRemoteServiceLocator() {}

  @Override
  public String getloginAddress() {
    return LOGIN_ADDRESS;
  }

  @Override
  public LoginRemote getlogin() {
    return new LoginSoapBindingStub();
  }

  @Override
  public LoginRemote getlogin(URL portAddress) {
    return new LoginSoapBindingStub();
  }
}
