public class Asmin {
  public static void main(String[] args) {
    BufferedReader reader = null;
    BufferedWriter writer = null;
    try {
      // Ask user for input and output file names
      System.out.print("Enter input file name: ");
      String inputFile = System.console().readLine();
      System.out.print("Enter output file name: ");
      String capitalOutputFile = System.console().readLine();
      
      // Open input and output files
      reader = new BufferedReader(new FileReader(inputFile));
      writer = new BufferedWriter(new FileWriter(capitalOutputFile));
      
      // Read input file, convert to uppercase, and write to output file
      String line;
      while ((line = reader.readLine()) != null) {
        writer.write(line.toUpperCase());
        writer.newLine();
      }
      
      // Close input and output files
      reader.close();
      writer.close();
      
      System.out.println("Conversion complete.");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
