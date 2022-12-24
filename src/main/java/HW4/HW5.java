package HW4;

import java.sql.Array;
import java.util.*;

public class HW5 {
    static Map<String, ArrayList<String>> phoneNote = new HashMap<>();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


//        1) нет фамилии, создаете ArrayList в первый раз
//        2) уже была фамилия, получаете готовый ArrayList через phoneNote.get(фамилия);
        while (true) {
            System.out.println("Выберите действие : ");
            System.out.println("1. Добавить значение в справочник. ");
            System.out.println("2. Посмотреть справочник. ");
            System.out.println("3. Выход. ");
            int step = Integer.parseInt(in.nextLine());
            switch (step) {
                case (1): {
                    System.out.print("Введите фамилию и телефон через пробел: ");
                    String inputString = in.nextLine();
                    if (inputString.isBlank()) {
                        System.out.println("Строка не должна быть пустой");
                        continue;
                    }
                    if (inputString.contains(" ")) {
                        inputFamily(inputString); //добавить фамилию
                        continue;
                    } else {
                        System.out.println("Строка не содержит пробел");
                        break;
                    }
                }
                case (2): {

                    if (phoneNote.size() > 0) {
                        for (Map.Entry<String, ArrayList<String>> entry : phoneNote.entrySet()) {

                            String str = String.join(",", entry.getValue());
                            System.out.printf("%s : %s%n", entry.getKey(), str);

                        }
                    } else {
                        System.out.println("Справочник пуст. ");
                    }
                    break;
                }
                case (3): {
                    System.exit(0);
                }
            }
        }
    }

    private static void inputFamily(String inputString) {
        String[] arrParse = inputString.split("\\ ");
        String lastName = arrParse[0].toLowerCase();
        ArrayList<String> list = new ArrayList<>();
        if (arrParse.length==2) {

            if (phoneNote.containsKey(lastName)) {
                System.out.printf("Фамилия  %s есть в справочнике. Его номера: %s \n", lastName, String.join(",", phoneNote.get(lastName)));

                list = phoneNote.get(lastName);
                if (list.contains(arrParse[1])) {

                    System.out.printf("Номер не добавлен, т.к. уже уже есть в справочнике у фамилии %s: \n", lastName);

                } else {
                    list.add(arrParse[1]);
                    System.out.printf("Добавлен номер телефона %s для фамилии: %s \n", arrParse[1], lastName);
                    phoneNote.put(lastName, list);

                }

            } else {
                list.add(arrParse[1]);
                phoneNote.put(lastName, list);
                System.out.printf("Добавлен номер %s для фамилии: %s\n", arrParse[1], lastName);
            }
        }
        else {System.out.println("Одно из введенных значений пустое. Или лишнее значение.");}

}}
