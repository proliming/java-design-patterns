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

/**
 * <p>Lazy initialization method to implement Singleton pattern
 * creates the instance in the global access method. Here is the
 * sample code for creating Singleton class with this approach.
 * <p>This kind of implementation works fine incase of single threaded
 * environment but when it comes to multithreaded systems, it can cause
 * issues if multiple threads are inside the if loop at the same time.
 * It will destroy the singleton pattern and both threads will get the
 * different instances of singleton class. In next section, we will see
 * different ways to create a thread-safe singleton class.
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
