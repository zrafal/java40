/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
/*
import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);
      Service s = new Service();

      boolean exit = false;
      while (!exit) {
        System.out.println("Wybierz opcję:");
        System.out.println("1. Dodaj studenta");
        System.out.println("2. Wyświetl listę studentów");
        System.out.println("3. Wyjdź");

        int choice = scanner.nextInt();

        switch (choice) {
          case 1:
            System.out.println("Podaj imię studenta:");
            String name = scanner.next();
            System.out.println("Podaj wiek studenta:");
            int age = scanner.nextInt();
            s.addStudent(new Student(name, age));
            break;
          case 2:
            var students = s.getStudents();
            for (Student current : students) {
              System.out.println(current.toString());
            }
            break;
          case 3:
            exit = true;
            break;
          default:
            System.out.println("Niepoprawny wybór.");
        }
      }
    } catch (IOException e) {
      System.out.println("Wystąpił błąd wejścia/wyjścia.");
    }
  }
}

