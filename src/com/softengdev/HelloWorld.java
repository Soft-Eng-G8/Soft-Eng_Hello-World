package com.softengdev;


public class HelloWorld {
  public HelloWorld() {

  }
  public static void main(String[] args) {
    HelloWorld driver = new HelloWorld();
    driver.execute_main();
  }

  private void execute_main() {
    PersistentData data = new PersistentData();
    MessagePrinter printer = new MessagePrinter();
    
    int times_run = data.load_value_int();
    times_run++;
    String times_run_str = String.valueOf(times_run);
    data.save_value_int(times_run);
    printer.printMessage("Hello World!");
    printer.printMessage("Number of times this program has run: " + times_run_str);

    HelloUI.initializeUI(times_run);
  }
}
