import java.util.ArrayList;
import java.util.Scanner;

public class ChangeLuck {

    public static void Change(ArrayList<Toy> toys) {
        boolean flag = true;
        while(flag) {
            System.out.println("������� ��������� ����� ������� �� ������ ��������(������� id)");
            for (Toy t : toys) {
                System.out.println(t);
            }
            Scanner scanner = new Scanner(System.in);
            String temp = scanner.nextLine();
            try {
                int numb = Integer.parseInt(temp);
                for (Toy t: toys) {
                    if(numb == t.getId()){
                        System.out.println("������� ����� �������� ������� ���������(0 - 100):");
                        String temp1 = scanner.nextLine();
                        t.setLuck(Integer.parseInt(temp1));
                        System.out.println("��������� ��������� �������");
                        System.out.println(t);
                        flag = false;
                        break;
                    }
                }
                if (flag == true) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("������� ������� �������");
            }
        }

    }
}
