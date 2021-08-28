package com.tutrit.java.quickstart.service;

public class Shadow {

    public String x = "Enclosing class";
    public String enclosing = "Enclosing class";

    public class InnerClass {

        public String x = "Inners class";
        public String inner = "Inners class";

        public void methodInInner(String xx) {
            System.out.println("=== Inners class ===");
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("Shadow.this.x = " + Shadow.this.x);

            System.out.println("inner = " + inner);
            System.out.println("this.inner = " + this.inner);
            System.out.println("enclosing = " + enclosing);
            System.out.println("Shadow.this.enclosing = " + Shadow.this.enclosing);

        }
    }

    public static class StaticNestedClass {
        public String x = "Static Nested class";
        public String nested = "Static Nested class";

        public void methodInNested(String xx) {
            System.out.println("=== Static Nested class ===");
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("nested = " + nested);
            System.out.println("this.nested = " + this.nested);
        }
    }
}

