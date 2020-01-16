package java_hometasks;

public class TaskOne {
  // Sum of a and b in (10,20) range
  // return true if sum is in range
  public boolean CheckSum(float a, float b) {
    if ((a + b) < 10) return false;
    if ((a + b) > 20) return false;
    return true;
  }
  // Calculate formula a*(b+(c/d))
  // return result as double
  // return 0 if d=0
  public double Calculate(double a, double b, double c, double d) {
    if (d != 0) {
      return a * (b + (c / d));
    } else {
      PrintMessage("Argument d = 0");
      return 0;
    }
  }
  // Check sign of argument a
  // return nothing, show message positive/negative
  public void CheckNum(short a) {
    if (a < 0) {
      PrintMessage(a + " is negative");
      return;
    }
    PrintMessage(a + " is positive");
  }
  // Check sign of argument a
  // return true if a is positive
  public boolean CheckNumB(byte a) {
    if (a < 0) return true;
    return false;
  }
  // Output 'Hallo <name>!' message
  // where <name> is an argument
  // return nothing
  public void PrintHalloMessage(String name) {
    name = "Hallo " + name + "!";
    PrintMessage(name);
  }
  // Just output message
  // return nothing
  public void PrintMessage(String message) {
    System.out.println(message);
  }
  // Check if the year is leap
  // return 'year is leap/not leap'
  public String CheckLeapYear(long YearNum) {
    if (isLeap(YearNum)) {
      return YearNum + " year is leap.";
    }
    return YearNum + " year is not leap.";
  }
  // Check if the year is leap
  // return true if year is leap
  private boolean isLeap(long Val) {
    if (Val < 1583) return false;
    if (Val % 4 == 0 && Val % 100 != 0 || Val % 400 == 0) {
      return true;
    }
    return false;
  }
  // Execute task one
  // return nothing
  public static void Execute() {
    // subtask 1
    String message = "Calculation result: ";
    double a = 3.3, b = 2.55, c = -1, d = 1.3;
    boolean check = true;
    float f = 2.25f, g = 12f;
    long year = 1984L;
    short h = 0, m = -2;
    byte k = -3;
    char ch = '!';
    TaskOne TaskObject = new TaskOne();
    // subtask 2
    message = message + TaskObject.Calculate(a, b, c, d);
    TaskObject.PrintMessage(message);

    // subtask 3
    check = TaskObject.CheckSum(f, g);
    if (check) {
      TaskObject.PrintMessage("Sum :" + (f + g));
    } else {
      TaskObject.PrintMessage("Sum out of range.");
    }
    // subtask 4
    TaskObject.CheckNum(h);
    TaskObject.CheckNum(m);
    // subtask 5
    if (TaskObject.CheckNumB(k)) TaskObject.PrintMessage(k + " is negative" + ch);
    // subtask 6
    TaskObject.PrintHalloMessage("Vasya");
    // subtask 7
    TaskObject.PrintMessage(TaskObject.CheckLeapYear(year));
  }
}
