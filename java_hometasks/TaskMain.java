package java_hometasks;


//import java_hometasks.Cross;
import java_hometasks.Employee;
//import java_hometasks.TaskOne;
//import java_hometasks.TaskThree;
//import java_hometasks.TaskTwo;

public class TaskMain {
  public static void main(String[] args) {

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
