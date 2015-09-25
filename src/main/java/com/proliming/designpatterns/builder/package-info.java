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

/**
 * <p>
 * Builder design pattern is a creational design pattern like Factory Pattern
 * and Abstract Factory Pattern. This pattern was introduced to solve some of
 * the problems with Factory and Abstract Factory design patterns when the Object
 * contains a lot of attributes.
 * </p>

 * <p>
 * There are three major issues with Factory and Abstract Factory design patterns
 * when the Object contains a lot of attributes.
 * </p>

 * <p>
 * Too Many arguments to pass from client program to the Factory class that can
 * be error prone because most of the time, the type of arguments are same and
 * from client side its hard to maintain the order of the argument.
 * </p>
 * <p/>
 * <p>
 * Some of the parameters might be optional but in Factory pattern, we are forced
 * to send all the parameters and optional parameters need to send as NULL.
 * If the object is heavy and its creation is complex, then all that complexity
 * will be part of Factory classes that is confusing.
 * </p>
 *
 * <p>
 * We can solve the issues with large number of parameters by providing a constructor
 * with required parameters and then different setter methods to set the optional
 * parameters but the problem with this is that the Object state will be inconsistent
 * until unless all the attributes are set explicitly.
 * </p>
 *
 * <p>
 * Builder pattern solves the issue with large number of optional parameters and
 * inconsistent state by providing a way to build the object step-by-step and provide
 * a method that will actually return the final Object.
 * </p>
 */
package com.proliming.designpatterns.builder;