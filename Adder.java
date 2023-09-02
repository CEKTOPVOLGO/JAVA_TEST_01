import java.util.ArrayList;
import java.util.Scanner;

public class Adder{
    public static Toy AddNewToy(ArrayList<Toy> toys){
        int id = 0;
        String name = null;
        int count = 0;
        int luck = 0;
        boolean flag = true;
        while(flag) {
            System.out.println("¬ведите id новой игрушки: ");
            Scanner scanner = new Scanner(System.in);
            String temp = scanner.nextLine();
            try {
                id = Integer.parseInt(temp);
                for (Toy t : toys) {
                    if(t.getId() == id){
                        throw new Exception();
                    }
                }
                flag = false;
            } catch (Exception e) {
                System.out.println("id введено неверно");
            }
        }
        flag = true;
        while(flag) {
            System.out.println("¬ведите название новой игрушки: ");
            Scanner scanner = new Scanner(System.in);
            String temp = scanner.nextLine();
            try {
                if(temp.length() < 1){
                    throw new WrongName();
                }
                name  = temp;
                flag = false;
            } catch (WrongName e) {
                System.out.println(e.getMessage());
            }
        }
        flag = true;
        while(flag) {
            System.out.println("¬ведите количество новых игрушек: ");
            Scanner scanner = new Scanner(System.in);
            String temp = scanner.nextLine();
            try {
                count = Integer.parseInt(temp);
                flag = false;
            } catch (Exception e) {
                System.out.println("количество введено неверно");
            }
        }
        flag = true;
        while(flag) {
            System.out.println("¬ведите частоту выпадени€ новой игрушки(0 - 100): ");
            Scanner scanner = new Scanner(System.in);
            String temp = scanner.nextLine();
            try {
                luck = Integer.parseInt(temp);
                flag = false;
            } catch (Exception e) {
                System.out.println("частоту выпадени€ введена неверно");
            }
        }
        Toy toy = new Toy(id, name, count, luck);
        return toy;
    }
}
