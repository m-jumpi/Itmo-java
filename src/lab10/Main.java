package lab10;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fileToArray("files/file1.txt")));
        stringToFile("hello world! 123");
        twoToOne1();
        replace();
    }

    public static String[] fileToArray(String fileName) {
        File file = new File(fileName);
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null) {
                builder.append(input);
            }
        } catch (IOException io) {
            System.out.println("Error: " + io.getMessage());
        }
        return builder.toString().split(" ");
    }

    public static void stringToFile(String string) {
        File file = new File("files/file2.txt");
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(string);

        } catch (IOException io) {
            System.out.println("Error: " + io.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException io) {
                System.out.println("Error: " + io.getMessage());
            }
        }
    }

    public static void twoToOne1() {
        File file1 = new File("files/file1.txt");
        File file2 = new File("files/file2.txt");
        File file3 = new File("files/file3.txt");

        BufferedWriter writer = null;
        String input="";
        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            writer = new BufferedWriter(new FileWriter(file3));
            while ((input = reader.readLine()) != null) {
                writer.write(input + "\n");
            }
        } catch (IOException io) {
            System.out.println("Error: " + io.getMessage());
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
            while ((input = reader.readLine()) != null) {
                writer.append(input);
            }
        } catch (IOException io) {
            System.out.println("Error: " + io.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException io) {
                System.out.println("Error: " + io.getMessage());
            }
        }
    }

    public static void twoToOne2() {
        File file1 = new File("files/file1.txt");
        File file2 = new File("files/file2.txt");
        File file3 = new File("files/file3.txt");
        InputStream is1 = null;
        InputStream is2 = null;
        OutputStream os = null;

        try {
            is1 = new FileInputStream(file1);
            is2 = new FileInputStream(file2);
            os = new FileOutputStream(file3);

            while (is1.available() > 0) {
                os.write(is1.read());
            }
            while (is2.available() > 0) {
                os.write(is2.read());
            }

        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
        } finally {
            try {
                if (is1 != null) {
                    is1.close();
                }
                if (is2 != null) {
                    is2.close();
                }
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                System.err.println("Error " + e.getMessage());
            }
        }
    }

    public static void replace() {
        File file = new File("files/file2.txt");
        StringBuilder builder = new StringBuilder();
        BufferedWriter writer = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null) {
                builder.append(input.replaceAll("[^а-яА-Яa-zA-Z\\d]", "\\$"));
            }
            file.delete();
            writer = new BufferedWriter(new FileWriter(file));
            writer.append(builder.toString());

        } catch (IOException io) {
            System.out.println("Error: " + io.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException io) {
                System.out.println("Error: " + io.getMessage());
            }
        }
    }
}
