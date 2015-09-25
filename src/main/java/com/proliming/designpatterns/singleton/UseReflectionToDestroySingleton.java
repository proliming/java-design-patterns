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

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Reflection can be used to destroy all the  singleton implementation approaches below:
 *
 * @see BillPughSingleton
 * @see DoubleCheckLockingSingleton
 * @see EagerSingleton
 * @see LazySingleton
 * @see ThreadSafeSingleton
 * @see StaticBlockSingleton
 * <p/>
 * <p>When you run the below test class, you will notice that hashCode of both the instances
 * are not same that destroys the singleton pattern. Reflection is very powerful and used in
 * a lot of frameworks like Spring and Hibernate,
 * </p>
 */
public class UseReflectionToDestroySingleton {
    public static void main(String[] args) {
        EagerSingleton instanceOne = EagerSingleton.getInstance();
        EagerSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (EagerSingleton) constructor.newInstance();
                break;
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
