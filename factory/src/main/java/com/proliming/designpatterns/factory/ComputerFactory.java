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
package com.proliming.designpatterns.factory;

import com.proliming.designpatterns.abstractfactory.IComputerFactory;

/**
 * <p>
 * Factory Pattern is one of the Creational Design pattern and it’s widely
 * used in JDK as well as frameworks like Spring and Struts.
 * </p>
 * <p>
 * Factory design pattern is used when we have a super class with multiple sub-classes
 * and based on input, we need to return one of the sub-class. This pattern take out
 * the responsibility of instantiation of a class from client program to the factory class.
 * </p>
 */
public class ComputerFactory {

    /**
     * Factory pattern.
     *
     * @param type the type of Computer
     * @param ram
     * @param hdd
     * @param cpu
     *
     * @return
     */
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equals(type)) {
            return new PC(ram, hdd, cpu);
        } else if ("Server".equals(type)) {
            return new Server(ram, hdd, cpu);
        }
        return null;
    }

    /**
     * Abstract Factory pattern.
     *
     * @param factory the factory of Computer
     *
     * @return
     */
    public static Computer getComputer(IComputerFactory factory) {
        return factory.createComputer();
    }

}
