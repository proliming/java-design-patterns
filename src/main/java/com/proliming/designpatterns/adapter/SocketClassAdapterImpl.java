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

/**
 * Class Adapter Implementation
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    public Volt get120V() {
        return getVolt();
    }

    public Volt get3V() {
        return convert(get120V(), 40);
    }

    private Volt convert(Volt v, int divide) {
        return new Volt(v.getVolt() / divide);
    }
}
