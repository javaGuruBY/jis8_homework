package bean;

public class Person {
  int age;
  String name;

  public Person(int var1, String var2) {
    this.age = var1;
    this.name = var2;
  }

  public String toString() {
    return "Person {age=" + this.age + " name=" + this.name + "}";
  }
}
