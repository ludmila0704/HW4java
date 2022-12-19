package HW4;
import java.util.LinkedList;
import java.util.Scanner;

public class MyStack {
    private static LinkedList<String> stack= new LinkedList<>();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Выберите действие : ");
            System.out.println("1. Добавить значение в стек. ");
            System.out.println("2. Посмотреть последнее в стеке. ");
            System.out.println("3. Посмотреть и извлечь последнее в стеке. ");
            System.out.println("4. Посмотреть весь стек. ");
            System.out.println("5. Выход. ");
            int step=Integer.parseInt(in.nextLine());
            switch (step) {
                case (1): {
                    System.out.print("Введите строку: ");
                    String inputString = in.nextLine();
                    push(inputString); //добавить в конец
                    break;
                }
                case (2): {
                    //System.out.println(stack);
                    System.out.println("Последнее в стеке:"+peek()); //посмотреть последнее в стеке
                    break;
                }
                case (3): {
                    System.out.println("Извлекаем последний элемент в стеке:"+pop()); //посмотреть и извлечь последнее в стеке
                    //System.out.println(stack);
                    break;
                }
                case(4):{
                    System.out.println(stack);
                    break;
                }
                case(5):{
                    System.exit(0);
                }
            }
    }}

    private static void push(String str) {
        stack.add(str);
    }

    private static String peek() {
        String t=stack.get(stack.size()-1);
        return t;
    }

    private static String pop() {
        String t=stack.get(stack.size()-1);
        stack.set(stack.size()-1,null) ;
        return t;
    }

}
