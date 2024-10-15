package com.softengdev;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PersistantData {
  // Initializes reader/writer
  private static final String FILE_LOCATION = "resources/persistent_data.txt";
  private File file;
  // private BufferedWriter writer;
  public PersistantData() {
    initialize_data();
  }

  // Loads reader/writer
  private void initialize_data() {
    try {
      file = new File(FILE_LOCATION);
    } catch (NullPointerException e) {
      // TODO: handle exception
    }
    // try {
    //   reader = new BufferedReader(new FileReader(FILE_LOCATION));
    //   writer = new BufferedWriter(new FileWriter(FILE_LOCATION));
    // } catch (IOException | NumberFormatException e) {
    //   e.printStackTrace();
    // }
  }

  // Returns currently stored value, string
  public String load_value() {
    // try {
    //   String line;
    //   while((line = reader.readLine()) != null) 
    //     System.out.println("AA " + line);
    //   reader.mark(3);
    //   reader.reset();
    //   return line;
    // } catch (IOException e) {
    // }
    // return "0";
    String line = "0";
    try {
      Scanner reader = new Scanner(file);
      while(reader.hasNextLine()) {
        line = reader.nextLine();
        System.out.println("AA " + line);
      }
      reader.close();
    } catch (FileNotFoundException e) {
    }
    return line;
  }

  // Saves given value, string
  public void save_value(String value) {
    try {
      FileWriter writer = new FileWriter(FILE_LOCATION);
      writer.write(value);
      writer.close();
    } catch (IOException e) {
    }
  }
}
