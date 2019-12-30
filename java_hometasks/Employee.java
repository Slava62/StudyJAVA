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

  public Employee() {
    this.fullname = "Ivan Ivanov";//fullname;
    this.position = "worker";//position;
  }

  public Employee(String fullname, String position) {
    this();
    this.fullname = fullname;
    this.position = position;
  }

  public Employee(String fullname, String position, String email, String phone, double salary, int age) {
    this (fullname, position);
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
  public static void Execute(){
    Employee[] employees = new Employee[5];
    employees[0] =
            new Employee(
                    "John Smith",
                    "sales manager",
                    "js.salesmanager@mail.com",
                    "8(925) 555-35-33",
                    500.5,
                    42);

    employees[1] =
            new Employee(
                    "Vasya Pumpkin",
                    "track driver",
                    "vp.trackdriver@mail.com",
                    "8(926) 666-56-44",
                    671.75,
                    47);

    employees[2] =
            new Employee(
                    "Ann Taylor",
                    "chief accountant",
                    "at.chiefaccountant@mail.com",
                    "8(925) 999-99-99",
                    2499.99,
                    52);
    employees[3] =
            new Employee(
                    "Yulia Unknown",
                    "storekeeper",
                    "yu.storekeeper@mail.com",
                    "8(926) 666-56-44",
                    450.75,
                    19);
    employees[4] =
            new Employee(
                    "Arif Abidov",
                    "ancillary worker",
                    "aa.ancillaryworker@mail.com",
                    "8(926) 666-15-13",
                    200.2,
                    43);

    Employee.printAll(employees);
  }
}
