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
package com.proliming.designpatterns.singleton;

import java.io.Serializable;

/**
 * <p>Sometimes in distributed systems, we need to implement {@link java.io.Serializable} interface
 * in Singleton class so that we can store it’s state in file system and retrieve
 * it at later point of time. Here is a small singleton class that implements
 * {@link java.io.Serializable} interface also.</p>
 */
public class SerializableSingleton implements Serializable {

    private SerializableSingleton() {
    }

    private static class SingletonLoader {
        private static final SerializableSingleton INSTANCE = new SerializableSingleton();
    }

    public static SerializableSingleton getInstance() {
        return SingletonLoader.INSTANCE;
    }

    /**
     * we need to implement {@link #readResolve()} method.
     * The method {@link #readResolve()} will make sure the only instance will be returned,
     * even when the object was serialized in a previous run of your program.
     *
     * @return
     */
    protected Object readResolve() {
        return getInstance();
    }

}
