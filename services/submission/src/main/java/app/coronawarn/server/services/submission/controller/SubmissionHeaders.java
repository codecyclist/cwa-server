/*-
 * ---license-start
 * Corona-Warn-App
 * ---
 * Copyright (C) 2020 SAP SE and all other contributors
 * ---
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
 * ---license-end
 */

package app.coronawarn.server.services.submission.controller;

public class SubmissionHeaders {

  private final String tan;
  private final boolean traveler;
  private final boolean sharedConsent;

  private SubmissionHeaders(String tan, boolean traveler, boolean sharedConsent) {
    this.tan = tan;
    this.traveler = traveler;
    this.sharedConsent = sharedConsent;
  }

  public static SubmissionHeaders of(String tan, boolean traveler, boolean sharedConsent) {
    return new SubmissionHeaders(tan, traveler, sharedConsent);
  }

  public String getTan() {
    return tan;
  }

  public boolean isTraveler() {
    return traveler;
  }

  public boolean isSharedConsent() {
    return sharedConsent;
  }
}
