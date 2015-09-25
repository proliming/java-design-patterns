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
 * <p>To implement Singleton pattern, we have different approaches but all of them
 * have following common concepts.</p>
 * <ul>
 * <li>Private constructor to restrict instantiation of the class from other classes.</li>
 * <li>Private static variable of the same class that is the only instance of the class.</li>
 * <li>ublic static method that returns the instance of the class, this is the global
 * access point for outer world to get the instance of the singleton class.</li>
 * </ul>
 * <p>In further sections, we will learn different approaches of Singleton pattern
 * implementation and design concerns with the implementation.</p>
 */
package com.proliming.designpatterns.singleton;