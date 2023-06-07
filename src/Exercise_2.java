import java.util.HashMap;
import java.util.Map;

public class Exercise_2 {
    public static void main(String[] args) {
        // Створення об'єкту HashMap для зберігання прізвищ та номерів телефонів
        Map<String, String> phoneBook = new HashMap<>();

        // Додавання елементів в карту
        phoneBook.put("Дрозд", "+380964234367");
        phoneBook.put("Грищук", "+380671251569");
        phoneBook.put("Щербань", "+380638434561");
        phoneBook.put("Юрчук", "+380981544564");
        phoneBook.put("Іванчук", "+38097882155");
        phoneBook.put("Хомич", "+380687444567");
        phoneBook.put("Гайдай", "+3806812532569");
        phoneBook.put("Штойка", "+380508664562");
        phoneBook.put("Гонтар", "+380960991568");
        phoneBook.put("Миколенко", "+380631550560");

        // Виведення інформації з книги за допомогою циклу
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            String lastName = entry.getKey();
            String phoneNumber = entry.getValue();
            System.out.println("Прізвище: " + lastName + ", Номер телефону: " + phoneNumber);
        }

        // Знайдення номеру за прізвищем
        String lastNameToFind = "Штойка";
        if (phoneBook.containsKey(lastNameToFind)) {
            String phoneNumber = phoneBook.get(lastNameToFind);
            System.out.println("Номер телефону для прізвища " + lastNameToFind + ": " + phoneNumber);
        } else {
            System.out.println("У книзі відсутній абонент з прізвищем " + lastNameToFind);
        }

        // Видалення запису з книги
        String lastNameToRemove = "Хомич";
        phoneBook.remove(lastNameToRemove);
        System.out.println("Запис з прізвищем " + lastNameToRemove + " видалено.");

        // Виведення кількості записів у книзі
        int numberOfEntries = phoneBook.size();
        System.out.println("Кількість записів у книзі: " + numberOfEntries);
    }
}

