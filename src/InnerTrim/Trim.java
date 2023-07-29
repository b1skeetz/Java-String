package InnerTrim;

public class Trim {
    public static void main(String[] args) {
        String text = "template   application       liquid     text";
        // Заменить все группы пробелов между словами на единственный пробел.
        // Ожидаемый результат: template application liquid text.
        System.out.println(innerTrim(text));
    }

    public static String innerTrim(String entireStr){
        String text = entireStr;
        for (int index = text.indexOf(" "); index != -1; index = text.indexOf(" ", index + 1)) {
            int counter = 0;
            for (int j = index + 1; text.charAt(j) == ' '; j++) {
                counter++;
            }
            if (counter != 0) {
                text = text.substring(0, index) + text.substring(index + counter);
            }
        }
        return text;
    }
}