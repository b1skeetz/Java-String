public class Main {
    public static void main(String[] args) {
        // Task 1
        String text = "application template transaction";
        String word = "template";

        if (text.contains(word.trim())) {
            System.out.println("Слово найдено");
        } else {
            System.out.println("Слово НЕ найдено");
        }

        if (text.indexOf(word.trim()) == -1) {
            System.out.println("Слово НЕ найдено");
        } else {
            System.out.println("Слово найдено");
        }

        // Task 2
        String text2 = "template sequence terminate application";
        int firstWordLength = text2.indexOf(" ");
        int secondWordLength = text2.indexOf(" ", firstWordLength + 1);
        System.out.println("Первое слово: " + text2.substring(0, firstWordLength));
        System.out.println("Второе слово: " + text2.substring(firstWordLength + 1, secondWordLength));

        // Task 3
        String[] names = {"Alex", "Drake", "Anya", "Leon", "Adam"};
        for (String name : names) {
            if (name.toLowerCase().startsWith("A")) {
                System.out.println(name);
            }
        }
        for (String name : names) {
            if (name.trim().indexOf("A") == 0) {
                System.out.println(name);
            }
        }
        for (String name : names) {
            if (name.trim().toLowerCase().charAt(0) == 'a') {
                System.out.println(name);
            }
        }

        // Task 4
        String text3 = "application hello car hello template hello";
        String word3 = "hello";
        int counter = 0;
        int index = -1;
        for (int i = 0; i < text3.length(); i++) {
            index = text3.indexOf(word3, index + 1);
            if (index != -1) {
                counter++;
            } else {
                break;
            }
        }
        System.out.println("Количество вхождений слова '" + word + "': " + counter);

        // Task 5
        String text4 = "application hello car hello template hello";
        String word4 = "hello";
        text4 = text4.replace(word4, "*".repeat(word4.length()));

        System.out.println(text4);

    }
}