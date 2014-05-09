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

package juzu.impl.bridge.spi.web;

import juzu.impl.bridge.Bridge;
import juzu.impl.request.ControllerHandler;
import juzu.request.Phase;
import juzu.request.RequestParameter;

import java.util.Map;

/** @author <a href="mailto:julien.viet@exoplatform.com">Julien Viet</a> */
public class WebViewBridge extends WebMimeBridge {

  WebViewBridge(
      Bridge bridge,
      juzu.impl.bridge.spi.web.Handler handler,
      WebBridge http,
      ControllerHandler<?> target,
      Map<String, RequestParameter> parameters) {
    super(bridge, handler, http, Phase.VIEW, target, parameters);
  }
}