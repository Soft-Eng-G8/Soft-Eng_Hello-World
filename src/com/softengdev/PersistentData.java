package com.softengdev;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * The {@code PersistentData} class handles reading and writing persistent data 
 * to a text file. It provides methods to load and save data as both strings and integers.
 */

public class PersistentData {
  // Initializes reader/writer
  
  private static final String FILE_LOCATION = "resources/persistent_data.txt";
  private File file;
  // private BufferedWriter writer;
  /**
     * Constructs a new {@code PersistentData} instance and initializes the file resource.
     */
  public PersistentData() {
    initialize_data();
  }

  // Loads reader/writer
   /**
     * Initializes the file resource. If the file does not exist, an exception will be handled.
     */
  private void initialize_data() {
    try {
      file = new File(FILE_LOCATION);
    } catch (NullPointerException e) {
      System.out.println("Code should't get here, but for some reason did, as the file must exist with build version.");
    }
    // try {
    //   reader = new BufferedReader(new FileReader(FILE_LOCATION));
    //   writer = new BufferedWriter(new FileWriter(FILE_LOCATION));
    // } catch (IOException | NumberFormatException e) {
    //   e.printStackTrace();
    // }
  }

  /**
     * Loads the stored value from the file as a string.
     *
     * @return the last line of the file as a string. 
     *         Returns "0" if the file is empty or not found.
     */
  // Returns currently stored value, string
  public String load_value_string() {
    String line = "0";
    try {
      Scanner reader = new Scanner(file);
      while(reader.hasNextLine()) {
        line = reader.nextLine();
      }
      reader.close();
    } catch (FileNotFoundException e) {
      System.out.println("Code should't get here, but for some reason did, as the file must exist with build version.");

    }
    return line;
  }

  /**
     * Loads the stored value from the file as an integer.
     *
     * @return the integer value parsed from the file.
     * @throws NumberFormatException if the file content is not a valid integer.
     */
  public int load_value_int() {
    String val = load_value_string();
    return Integer.parseInt(val);
  }

  /**
     * Saves the given value as a string to the file.
     *
     * @param value the string value to be saved to the file.
     */
  // Saves given value, string
  public void save_value_string(String value) {
    try {
      FileWriter writer = new FileWriter(FILE_LOCATION);
      writer.write(value);
      writer.close();
    } catch (IOException e) {
      System.out.println("Code should't get here, but for some reason did, as the file must exist with build version.");
    }
  }
  /**
     * Saves the given value as an integer to the file.
     *
     * @param value the integer value to be saved to the file.
     */
  public void save_value_int(int value) {
    String val = String.valueOf(value);
    save_value_string(val);
  }
}
