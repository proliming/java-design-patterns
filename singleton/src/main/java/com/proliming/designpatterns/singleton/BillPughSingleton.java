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
 * <p>Prior to Java 5, java memory model had a lot of issues and above approaches used to
 * fail in certain scenarios where too many threads try to get the instance of the Singleton
 * class simultaneously. So Bill Pugh came up with a different approach to create the Singleton
 * class using a inner static helper class.
 * </p>
 * <p>Notice the private inner static class that contains the instance of the singleton class.
 * When the singleton class is loaded, SingletonLoader class is not loaded into memory and only
 * when someone calls the{@link #getInstance()} method, this class gets loaded and creates
 * the Singleton class instance.
 * </p>
 */
public class BillPughSingleton {

    private BillPughSingleton() {
    }

    private static class SingletonLoader {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonLoader.INSTANCE;
    }
}
