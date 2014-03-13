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

@Application
@Portlet
@Servlet("/weather7/*")
@Less(@Stylesheet("bootstrap.less"))
@WithAssets
package examples.tutorial.weather7;

import juzu.Application;
import juzu.plugin.asset.Stylesheet;
import juzu.plugin.asset.WithAssets;
import juzu.plugin.less4j.Less;
import juzu.plugin.portlet.Portlet;
import juzu.plugin.servlet.Servlet;
