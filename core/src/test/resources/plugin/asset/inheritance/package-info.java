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

@Application()
@Scripts(
  value = { @Script(id = "jquery.js", value = "jquery.js") },
  location = AssetLocation.SERVER
)
@Stylesheets(
    value = { @Stylesheet(id = "main.css", value = "main.css") },
    location = AssetLocation.SERVER
)
package plugin.asset.inheritance;

import juzu.Application;
import juzu.asset.AssetLocation;
import juzu.plugin.asset.Script;
import juzu.plugin.asset.Scripts;
import juzu.plugin.asset.Stylesheet;
import juzu.plugin.asset.Stylesheets;
