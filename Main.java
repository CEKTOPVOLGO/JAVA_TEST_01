import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Toy> toys= new ArrayList<Toy>();
        System.out.println("������ �������� ������� ��� ���������� �������� �������?(1 - ��������, 2 - ���������� ��������, \n 3 - �������� ������� ��������� ����� �������, 4 - ����� �� ����������)");
        boolean flag = true;
        int numb = 0;
        while(flag) {
            Scanner scanner = new Scanner(System.in);
            String temp = scanner.nextLine();
            try {
                numb = Integer.parseInt(temp);
                if (numb == 4) {
                    flag = false;
                }
                else if(numb != 1 && numb != 2){
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("������� ������� �������");
            }
            switch(numb){
                case 1:
                    Toy toy = Adder.AddNewToy(toys);
                    toys.add(toy);
                    PrintToys.print(toys);
                    System.out.println("������ �������� ������� ��� ���������� �������� �������?(1 - ��������, 2 - ���������� ��������, \n 3 - �������� ������� ��������� ����� �������, 4 - ����� �� ����������)");
                    break;
                case 2:
                    Game.start(toys);
                    PrintToys.print(toys);
                    System.out.println("������ �������� ������� ��� ���������� �������� �������?(1 - ��������, 2 - ���������� ��������, \n 3 - �������� ������� ��������� ����� �������, 4 - ����� �� ����������)");
                    break;
                case 3:
                    ChangeLuck.Change(toys);
                    PrintToys.print(toys);
                    System.out.println("������ �������� ������� ��� ���������� �������� �������?(1 - ��������, 2 - ���������� ��������, \n 3 - �������� ������� ��������� ����� �������, 4 - ����� �� ����������)");
            }
        }
    }
}
