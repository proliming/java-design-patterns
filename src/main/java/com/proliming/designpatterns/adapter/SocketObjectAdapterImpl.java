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
 * Object Adapter Implementation.
 */
public class SocketObjectAdapterImpl implements SocketAdapter {

    private Socket socket;

    public SocketObjectAdapterImpl(Socket socket) {
        this.socket = socket;
    }

    public Volt get120V() {
        return socket.getVolt();
    }

    public Volt get3V() {
        return new Volt(socket.getVolt().getVolt() / 40);
    }
}
