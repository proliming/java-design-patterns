/*
 * Copyright (c) 2015 the origin author or authors.
 *
 * Licensed under the Apache License, Version 2.0 ( the "License" ) ;
 * you may not user this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF AND KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */
package com.proliming.designpatterns.adapter;

import org.junit.Test;

import junit.framework.Assert;

/**
 * UT for {@link SocketAdapter}
 */
public class AdapterPatternTest {

    @Test
    public void testObjectAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl(new Socket());
        Volt v3 = socketAdapter.get3V();
        Volt v120 = socketAdapter.get120V();
        Assert.assertEquals(v3.getVolt(), 3);
        Assert.assertEquals(v120.getVolt(), 120);
    }

    @Test
    public void testClassAdapter(){
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Volt v3 = socketAdapter.get3V();
        Volt v120 = socketAdapter.get120V();
        Assert.assertEquals(v3.getVolt(), 3);
        Assert.assertEquals(v120.getVolt(), 120);
    }

}
