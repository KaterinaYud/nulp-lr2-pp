package main;
import abit.Abiturient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Abiturient[] abiturient = new Abiturient[10];

        abiturient[0] = new Abiturient(1, "Іван", "Петренко", "Миколайович", "Київ", "1232693690", 60.5);
        abiturient[1] = new Abiturient(2, "Марія", "Іваненко", "Василівна", "Львів", "026586221", 91.0);
        abiturient[2] = new Abiturient(3, "Олексій", "Сидоренко", "Олександрович", "Одеса", "119234734", 78.3);
        abiturient[3] = new Abiturient(4, "Анна", "Коваленко", "Іванівна", "Харків", "557878", 78.2);
        abiturient[4] = new Abiturient(5, "Олег", "Мельник", "Петрович", "Дніпро", "88548001", 93.4);
        abiturient[5] = new Abiturient(6, "Анна", "Шевченко", "Василівна", "Київ", "902581259", 82.1);
        abiturient[6] = new Abiturient(7, "Андрій", "Гончаров", "Іванович", "Запоріжжя", "422672667", 56.8);
        abiturient[7] = new Abiturient(8, "Ірина", "Мартинюк", "Олександрівна", "Полтава", "7702693694", 59.0);
        abiturient[8] = new Abiturient(9, "Іванна", "Данко", "Сергіївна", "Черкаси", "69573659885", 95.7);
        abiturient[9] = new Abiturient(10, "Микола", "Федоренко", "Миколайович", "Чернівці", "310232956", 83.9);

        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть ім'я для виведення списку абітурієнтів: ");
        String first_name = scan.nextLine();
        System.out.println("\nАбітурієнти з ім'ям " + first_name + ":");
        if (!printName(abiturient, first_name)){
            System.out.println("Абітурієнтів з таким ім'ям не знайдено.");
        }

        System.out.print("\nВведіть середній бал для фільтрації абітурієнтів: ");
        double minPoint = scan.nextDouble();
        System.out.println("\nАбітурієнти з середнім балом більше " + minPoint + ":");
        if (!pointGreater(abiturient, minPoint)){
            System.out.println("Немає абітурієнтів з середнім балом більше " + minPoint + ".");
        }

        System.out.print("\nВведіть кількість абітурієнтів для показу з найвищим середнім балом: ");
        int n = scan.nextInt();
        System.out.println("\nТоп " + n + " абітурієнтів з найвищим середнім балом:");
        if (!topPoint(abiturient, n)){
            System.out.println("Кількість абітурієнтів перевищує доступну кількість.");
        }
        scan.close();
    }

    public static boolean printName(Abiturient[] abiturients, String first_name) {
        boolean found = false;
        for (Abiturient ab : abiturients) {
            if (ab.getFirst_name().equals(first_name)) {
                System.out.println(ab.toString());
                found = true;
            }
        }
        return found;
    }

    public static boolean pointGreater(Abiturient[] abiturients, double point) {
        boolean found = false;
        for (Abiturient ab : abiturients) {
            if (ab.getAverage_point() > point) {
                System.out.println(ab.toString());
                found = true;
            }
        }
        return found;
    }

    public static boolean topPoint(Abiturient[] abiturients, int n) {
        for (int i = 0; i < abiturients.length - 1; i++) {
            for (int j = 0; j < abiturients.length - i - 1; j++) {
                if (abiturients[j].getAverage_point() < abiturients[j + 1].getAverage_point()) {
                    Abiturient temp = abiturients[j];
                    abiturients[j] = abiturients[j + 1];
                    abiturients[j + 1] = temp;
                }
            }
        }
        boolean found = false;
        for (int i = 0; i < n && i < abiturients.length; i++) {
            System.out.println(abiturients[i].toString());
            found = true;
        }
        return found;
    }
}
