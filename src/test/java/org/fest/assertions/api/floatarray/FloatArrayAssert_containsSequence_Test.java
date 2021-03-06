/*
 * Created on Dec 20, 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2010-2011 the original author or authors.
 */
package org.fest.assertions.api.floatarray;

import static org.fest.assertions.test.FloatArrayFactory.array;
import static org.mockito.Mockito.verify;

import org.fest.assertions.api.FloatArrayAssert;
import org.fest.assertions.api.FloatArrayAssertBaseTest;

/**
 * Tests for <code>{@link FloatArrayAssert#containsSequence(float...)}</code>.
 * 
 * @author Alex Ruiz
 */
public class FloatArrayAssert_containsSequence_Test extends FloatArrayAssertBaseTest {

  @Override
  protected FloatArrayAssert invoke_api_method() {
    return assertions.containsSequence(6f, 8f);
  }

  @Override
  protected void verify_internal_effects() {
    verify(arrays).assertContainsSequence(getInfo(assertions), getActual(assertions), array(6f, 8f));
  }
}
