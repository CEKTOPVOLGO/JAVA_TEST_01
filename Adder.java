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
            System.out.println("������� id ����� �������: ");
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
                System.out.println("id ������� �������");
            }
        }
        flag = true;
        while(flag) {
            System.out.println("������� �������� ����� �������: ");
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
            System.out.println("������� ���������� ����� �������: ");
            Scanner scanner = new Scanner(System.in);
            String temp = scanner.nextLine();
            try {
                count = Integer.parseInt(temp);
                flag = false;
            } catch (Exception e) {
                System.out.println("���������� ������� �������");
            }
        }
        flag = true;
        while(flag) {
            System.out.println("������� ������� ��������� ����� �������(0 - 100): ");
            Scanner scanner = new Scanner(System.in);
            String temp = scanner.nextLine();
            try {
                luck = Integer.parseInt(temp);
                flag = false;
            } catch (Exception e) {
                System.out.println("������� ��������� ������� �������");
            }
        }
        Toy toy = new Toy(id, name, count, luck);
        return toy;
    }
}
