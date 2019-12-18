package java_hometasks;

public class Employee {
  private String[] fieldsname = {"ФИО", "должность", "email", "телефон", "зарплата", "возраст"};

  private String fullname;
  private String position;
  private String email;
  private String phone;
  private double salary;
  private int age;
  private static final int LIMIT_AGE = 40;

  private Employee() {}

  public Employee(
      String fullname, String position, String email, String phone, double salary, int age) {
    this.fullname = fullname;
    this.position = position;
    this.email = email;
    this.phone = phone;
    this.salary = salary;
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public static void printAll(Employee[] employees) {
    for (Employee e : employees) {
      if (e != null) {
        if (e.getAge() > LIMIT_AGE) System.out.println(e.toString());
      }
    }
  }

  @Override
  public String toString() {
    return fieldsname[0]
        + " : "
        + fullname
        + "\n"
        + fieldsname[1]
        + " : "
        + position
        + "\n"
        + fieldsname[2]
        + " : "
        + email
        + "\n"
        + fieldsname[3]
        + " : "
        + phone
        + "\n"
        + fieldsname[4]
        + " : "
        + salary
        + "\n"
        + fieldsname[5]
        + " : "
        + age
        + "\n";
  }
}
