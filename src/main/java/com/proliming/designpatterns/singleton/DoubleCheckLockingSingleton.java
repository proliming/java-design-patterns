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
 * <p>{@link ThreadSafeSingleton} implementation works fine and provides thread-safety but it reduces the
 * performance because of cost associated with the synchronized method, although we
 * need it only for the first few threads who might create the separate instances
 * (Read: Java Synchronization). To avoid this extra overhead every time, double
 * checked locking principle is used. In this approach, the synchronized block is
 * used inside the if condition with an additional check to ensure that only one
 * instance of singleton class is created.</p>
 * <p>Pay attention to the volatile modifier here. It is important because without it,
 * other threads are not guaranteed by the JMM (Java Memory Model) to see changes to its value.
 * The synchronization does not take care of that--it only serializes access to that block of code.
 * </p>
 */
public class DoubleCheckLockingSingleton {

    private static volatile DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton() {
    }

    public static DoubleCheckLockingSingleton getInstance() {
        if (instance == null) {
            synchronized(DoubleCheckLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }

}
