/*
 * Created on Nov 29, 2010
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
package org.fest.assertions.api.object;

import static junit.framework.Assert.assertSame;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.Comparator;

import org.fest.assertions.api.ObjectAssert;
import org.fest.assertions.api.ObjectAssertBaseTest;
import org.fest.assertions.test.Jedi;
import org.junit.Before;
import org.mockito.Mock;

/**
 * Tests for <code>{@link ObjectAssert#usingComparator(java.util.Comparator)}</code> and
 * <code>{@link ObjectAssert#usingDefaultComparator()}</code>.
 * 
 * @author Joel Costigliola
 * @author Mikhail Mazursky
 */
public class ObjectAssert_usingComparator_Test extends ObjectAssertBaseTest {

  @Mock
  private Comparator<Jedi> comparator;

  @Before
  public void before() {
    initMocks(this);
  }

  @Override
  protected ObjectAssert<Jedi> invoke_api_method() {
    // in that, we don't care of the comparator, the point to check is that we switch correctly of comparator
    return assertions.usingComparator(comparator);
  }

  @Override
  protected void verify_internal_effects() {
    assertSame(getObjects(assertions).getComparator(), comparator);
  }
}
