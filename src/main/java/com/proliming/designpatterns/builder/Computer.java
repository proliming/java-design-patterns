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
package com.proliming.designpatterns.builder;

/**
 * <em>Builder Pattern Implementation<em/>
 * <ul>
 * <li>
 * First of all you need to create a static nested class and then
 * copy all the arguments from the outer class to the Builder class.
 * We should follow the naming convention and if the class name is
 * Computer then builder class should be named as ComputerBuilder.
 * </li>
 * <li>
 * The Builder class should have a public constructor with all the
 * required attributes as parameters.
 * </li>
 * <li>
 * Builder class should have methods to set the optional parameters and
 * it should return the same Builder object after setting the optional attribute.
 * </li>
 * <li>
 * The final step is to provide a build() method in the builder class that will
 * return the Object needed by client program. For this we need to have a private
 * constructor in the Class with Builder class as argument.
 * </li>
 * </ul>
 */
public class Computer {
    // required parameters
    private String hdd;
    private String ram;
    // optional parameters;
    private boolean isBluetoothEnabled;
    private boolean isGraphicsCardEnabled;

    private Computer(ComputerBuilder builder) {
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public String getHdd() {
        return hdd;
    }

    public String getRam() {
        return ram;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    private static class ComputerBuilder {
        // required parameters
        private String hdd;
        private String ram;
        // optional parameters;
        private boolean isBluetoothEnabled;
        private boolean isGraphicsCardEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.hdd = hdd;
            this.ram = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }
}
