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

package juzu.plugin.portlet;

import juzu.test.AbstractWebTestCase;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;

import java.net.HttpURLConnection;
import java.util.ResourceBundle;

/** @author <a href="mailto:julien.viet@exoplatform.com">Julien Viet</a> */
public class PortletInjectTestCase extends AbstractWebTestCase {

  /** . */
  public static boolean prefs;

  @Deployment(testable = false)
  public static WebArchive createDeployment() {
    return createPortletDeployment("plugin.portlet.inject");
  }

  @Test
  public void testInjection() throws Exception {
    prefs = false;
    HttpURLConnection conn = (HttpURLConnection)getPortletURL().openConnection();
    assertEquals(200, conn.getResponseCode());
    assertTrue(prefs);
  }
}
