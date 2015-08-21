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
 * <p>In eager initialization, the instance of <em>Singleton</em> Class is
 * created at the time of class loading, this is the easiest method to create
 * a singleton class but it has a drawback that instance is created even though
 * client application might not be using it.
 * <p>If your singleton class is not using a lot of resources, this is the approach
 * to use. But in most of the scenarios, <em>Singleton</em> classes are created
 * for resources such as <b>File System</b>,<b>Datebase connections</b>etc and we
 * should avoid the instantiation until unless client calls the <code>getInstance</code>.
 * Also this method doesn’t provide any options for exception handling.
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

}
