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
 * <p>To overcome the situation with Reflection, Joshua Bloch suggests the use of
 * {@link Enum} to implement Singleton design pattern as Java ensures that any enum value
 * is instantiated only once in a Java program. Since Java Enum values are globally
 * accessible, so is the singleton. The drawback is that the enum type is somewhat
 * inflexible; for example, it does not allow lazy initialization.
 * <p/>
 * <p>Joshua Bloch explained this approach in his <b>Effective Java Reloaded talk</b> at Google I/O 2008.
 * <pre>
 * "This approach is functionally equivalent to the public field approach, except that it is more concise,
 *  provides the serialization machinery for free, and provides an ironclad guarantee against multiple instantiation,
 *  even in the face of sophisticated serialization or reflection attacks. While this approach has yet to be widely
 * adopted, a single-element enum type is the best way to implement a singleton."
 * </pre>
 */
public enum EnumSingleton {
    INSTANCE;

    public static void doSomething() {
        // TODO do something
    }
}
