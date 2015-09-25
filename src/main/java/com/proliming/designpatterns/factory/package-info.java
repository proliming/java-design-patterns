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
 * <em>Benefits of Factory Pattern:</em>
 * <ul>
 * <li>
 * Factory pattern provides approach to code for interface rather than implementation.
 * </li>
 * <li>Factory pattern removes the instantiation of actual implementation classes from client code,
 * making it more robust, less coupled and easy to extend. For example, we can easily change
 * PC class implementation because client program is unaware of this.</li>
 * <li>Factory pattern provides abstraction between implementation
 * and client classes through inheritance.</li>
 * </ul>
 * </p>
 * <p>
 * The idea here is separation of concerns: If the code that uses the object also has enough
 * information to instantiate it, you don't need a factory. However, if there is some logic
 * or configuration involved that you don't want to have the API user to think about
 * (or mess with), you can hide all that (and encapsulate it for reuse) in a factory.
 * {@see http://stackoverflow.com/questions/14575457/factory-classes}
 * <p/>
 *
 * </p>
 * <em>Benefits of Abstract Factory Pattern</em>
 * <ul>
 * <li>Abstract Factory pattern provides approach to code
 * for interface rather than implementation.</li>
 * <li>Abstract Factory pattern is “factory of factories” and
 * can be easily extended to accommodate</li>
 * <li>more products, for example we can add another sub-class
 * Laptop and a factory LaptopFactory.</li>
 * <li>Abstract Factory pattern is robust and avoid conditional
 * logic of Factory pattern.</li>
 * </ul>
 */
package com.proliming.designpatterns.factory;