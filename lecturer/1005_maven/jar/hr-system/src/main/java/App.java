import bean.Person;

public class App {

  public static void main(String[] args) {

    for (String name : args) {
      Person person = new Person(23, name);
      System.out.println(person);
    }
  }

}
