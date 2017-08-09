// Copyright 2017 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.utils.v201708;

import com.google.api.ads.adwords.lib.jaxb.v201708.DownloadFormat;
import com.google.api.ads.adwords.lib.utils.ReportRequest;
import com.google.common.base.Preconditions;

/**
 * ReportRequest for AWQL reports.
 */
class AwqlReportRequest implements ReportRequest {

  private final String awqlQuery;
  private final DownloadFormat downloadFormat;

  public AwqlReportRequest(String awqlQuery, DownloadFormat downloadFormat) {
    this.awqlQuery = Preconditions.checkNotNull(awqlQuery, "Null AWQL query");
    this.downloadFormat = Preconditions.checkNotNull(downloadFormat, "Null download format");
  }

  @Override
  public String getReportRequestString() {
    return awqlQuery;
  }

  @Override
  public DownloadFormat getDownloadFormat() {
    return downloadFormat;
  }
  
  @Override
  public String getApiVersion() {
    return "v201708";
  }

  @Override
  public RequestType getRequestType() {
    return RequestType.AWQL;
  }
}
