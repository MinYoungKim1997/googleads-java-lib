// Copyright 2014 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.common.lib.soap.axis.testing.mocks.v201408;

import java.rmi.Remote;

/**
 * Mock service interface that implements Remote. Mirrors the structure of ServiceInterface types
 * generated by WSDL2Java.
 */
public interface MockAxisServiceInterface extends Remote {
  
  static final String TEST_MESSAGE = "Here!";
  
  /**
   * Implementations should return the constant {@link #TEST_MESSAGE}.
   */
  String getTestMessage();
  
  /**
   * Implementations should return the concatenation of <code>prefix</code> and
   * {@link #TEST_MESSAGE}.
   * 
   * @param prefix The prefix to prepend to {@link #TEST_MESSAGE}.
   */
  String getTestMessageWithPrefix(String prefix);
}
