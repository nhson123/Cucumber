package Steps.tutor.pageFactory;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/** Package: Steps.tutor.pageFactory Generated by: Hoang.Son.Nguyen Generated at: 26.11.2018 2018 */
public class CSVFileOps {
  public static void csvRead(String filePath) throws IOException {
    CSVReader reader = new CSVReader(new FileReader(filePath));
    List<String[]> list = reader.readAll();
    Iterator<String[]> iterator = list.iterator();
    System.out.println(" Values are: ");
    while (iterator.hasNext()) {
      String[] row = iterator.next();
      for (int i = 0; i < row.length; i++) {
        System.out.print(row[i] + ", ");
      }
      System.out.println();
    }
  }

  public static void csvWrite(String filePath, String[] dataToWrite) throws IOException {
    FileWriter writer = new FileWriter(filePath, true);
    writer.append("\n");
    for (int i = 0; i < dataToWrite.length; i++) {
      if (i < dataToWrite.length - 1) {
        writer.append("\"" + dataToWrite[i] + "\",");
      } else {
        writer.append("\"" + dataToWrite[i] + "\"");
      }
    }
    writer.close();
  }

  public static void csvReadToSQL(String filePath) throws IOException {
    CSVReader reader = new CSVReader(new FileReader(filePath));
    List<String[]> list = reader.readAll();
    String[]newSQL= new String[list.size()];
    Iterator<String[]> iterator = list.iterator();
    System.out.println();
    while (iterator.hasNext()) {

      String[] row = iterator.next();
      for (int i = 0; i < row.length; i++)
        System.out.print("'"+row[i] + "', ");
      }
      System.out.println();
    }

  }

