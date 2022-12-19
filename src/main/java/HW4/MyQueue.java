package HW4;
import java.util.LinkedList;
import java.util.Scanner;

public class MyQueue {


        private static LinkedList<String> queue=new LinkedList<>();

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            while(true) {
                System.out.println("Выберите действие : ");
                System.out.println("1. Добавить значение в очередь. ");
                System.out.println("2. Посмотреть первое в очереди. ");
                System.out.println("3. Извлечь и вернуть первое в очереди. ");
                System.out.println("4. Посмотреть всю очередь. ");
                System.out.println("5. Выход. ");
                int step = Integer.parseInt(in.nextLine());
                switch (step) {
                    case(1): {
                        System.out.print("Введите строку: ");
                        String inputString = in.nextLine();
                        add(inputString); //добавить в конец
                        //add("h1"); //добавить в конец
                        //add("h2"); //добавить в конец
                        break;
                    }
                    case(2): {
                        //System.out.println(queue);
                        System.out.println("Первое в очереди: "+top()); //посмотреть первое в очереди
                        break;
                    }
                    case(3): {
                        System.out.println("Извлекаем первый на очереди элемент: "+remove()); //извлечь и вернуть первое в очереди
                        //System.out.println(queue);
                        break;
                    }
                    case (4):{
                        System.out.println(queue);
                        break;

                    }
                    case(5):{
                        System.exit(0);
                    }
                }
            }
        }

        private static void add(String str) {
            queue.add(0,str);
        }

        private static String top() {
            String t= queue.get(queue.size()-1);
            return t;
        }

        private static String remove() {
            String t= queue.get(queue.size()-1);
            queue.set(queue.size()-1,null );
            return t;
        }

}
