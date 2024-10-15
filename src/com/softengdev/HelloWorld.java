package com.softengdev;

/**
 * 
 * @author Redwan Lazib
 * @version 1.0
 * @since 2024-10-14
 */

/**
 * The {@code HelloWorld} class serves as the entry point for the program.
 * It demonstrates the use of the {@code PersistentData} and {@code MessagePrinter} 
 * classes to manage and display data, and initializes the user interface via {@code HelloUI}.
 */
public class HelloWorld {
  public HelloWorld() {

  }
  /**
     * The main method that launches the program.
     *
     * @param args command-line arguments (not used).
     */
  public static void main(String[] args) {
    HelloWorld driver = new HelloWorld();
    driver.execute_main();
  }
  /**
     * Executes the main logic of the program.
     * <p>
     * It loads the number of times the program has been executed from persistent storage, 
     * increments it, saves the updated value, prints messages to the console, 
     * and initializes the user interface.
     * </p>
     */
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
