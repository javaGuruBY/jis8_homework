package com.tutrit.java.quickstart;

import java.util.List;

public class Polymorphism {
    public void run() {
        List<Dog> dogs = List.of(new Dog(), new ActiveDog(), new LazyDog(),
                new Dog() {
                    public void say() {
                        System.out.println("ni-hay");
                    }
                });
        new Psarnja(dogs);
    }

     class Dog {
        public void say() {
            System.out.println("hay");
        }
    }

     class ActiveDog extends Dog {
        @java.lang.Override
        public void say() {
            System.out.println("hay-hay-hay-hay-hay-hay-hay");
        }
    }

     class LazyDog extends Dog {
        @java.lang.Override
        public void say() {
            System.out.println("h-a-yyyy");
        }
    }

     class Psarnja {
        List<Dog> dogs;

        public Psarnja(List<Dog> dogs) {
            this.dogs = dogs;
            dogs.forEach(dog -> dog.say());
        }
    }
}
