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
package com.proliming.designpatterns.abstractfactory;

import com.proliming.designpatterns.factory.Computer;
import com.proliming.designpatterns.factory.ComputerFactory;

/**
 * The abstract class or interface to create abstract {@link ComputerFactory}
 * <p>
 *     Abstract Factory is one of the Creational pattern and almost similar to
 *     Factory Pattern except the fact that its more like factory of factories.
 * </p>
 */
public interface IComputerFactory {

    Computer createComputer();

}
