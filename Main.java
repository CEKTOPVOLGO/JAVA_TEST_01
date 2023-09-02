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
        System.out.println("Хотите добавить игрушку или произвести розыгрыш игрушек?(1 - добавить, 2 - произвести розыгрыш, \n 3 - изменить частоту выпадения новой игрушки, 4 - выйти из приложения)");
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
                System.out.println("команда введена неверно");
            }
            switch(numb){
                case 1:
                    Toy toy = Adder.AddNewToy(toys);
                    toys.add(toy);
                    PrintToys.print(toys);
                    System.out.println("Хотите добавить игрушку или произвести розыгрыш игрушек?(1 - добавить, 2 - произвести розыгрыш, \n 3 - изменить частоту выпадения новой игрушки, 4 - выйти из приложения)");
                    break;
                case 2:
                    Game.start(toys);
                    PrintToys.print(toys);
                    System.out.println("Хотите добавить игрушку или произвести розыгрыш игрушек?(1 - добавить, 2 - произвести розыгрыш, \n 3 - изменить частоту выпадения новой игрушки, 4 - выйти из приложения)");
                    break;
                case 3:
                    ChangeLuck.Change(toys);
                    PrintToys.print(toys);
                    System.out.println("Хотите добавить игрушку или произвести розыгрыш игрушек?(1 - добавить, 2 - произвести розыгрыш, \n 3 - изменить частоту выпадения новой игрушки, 4 - выйти из приложения)");
            }
        }
    }
}
