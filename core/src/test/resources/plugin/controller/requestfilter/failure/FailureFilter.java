/*
 * Copyright 2013 eXo Platform SAS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package plugin.controller.requestfilter.failure;

import juzu.Response;
import juzu.impl.request.Request;
import juzu.impl.request.RequestFilter;
import juzu.impl.request.Stage;
import juzu.request.Result;

/** @author <a href="mailto:julien.viet@exoplatform.com">Julien Viet</a> */
public class FailureFilter implements RequestFilter<Stage.Handler> {
  public FailureFilter() {
  }

  @Override
  public Class<Stage.Handler> getStageType() {
    return Stage.Handler.class;
  }

  @Override
  public Result filter(Stage.Handler source) {
    Request request = source.getRequest();
    Result result = source.invoke();
    if (result instanceof Result.Error) {
      result = Response.ok("pass").result();
    }
    return result;
  }
}
