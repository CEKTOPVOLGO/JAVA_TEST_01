import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void start(ArrayList<Toy> toys) {

        int sum = 0;
        int numb = 0;
        Random random = new Random();
        for (Toy t: toys) {
            sum += t.getCount();
        }
        boolean flag = true;
        while(flag){
            System.out.println("Введите количество розыгрышей");
            Scanner scanner = new Scanner(System.in);
            String temp = scanner.nextLine();
            try {
                numb = Integer.parseInt(temp);
                if(numb > sum){
                    System.out.println("Количество розыгрышей не может быть больше, чем количество игрушек");
                    throw new Exception();
                }
                else{
                    flag = false;
                }
            }catch (Exception e){
                System.out.println("Введенные данные неверны");
            }
        }
        try (FileWriter writer = new FileWriter("toys.txt")) {
            writer.append("Список выигрышей: \n");
        } catch (Exception e) {
            System.out.println("Ошибка добавления.");
        }
        for(int j = 1; j <= numb; j++) {
            int[] toyArray = new int[toys.size()];
            for (int i = 0; i < toys.size(); i++) {
                toyArray[i] = random.nextInt(toys.get(i).getLuck());
            }
            int max = 0;
            for (int i = 0; i < toyArray.length; i++) {
                if (toyArray[i] > toyArray[max]) {
                    max = i;
                }
            }
            try (FileWriter writer = new FileWriter("toys.txt", true)) {
                writer.append(j +". " + toys.get(max).getName() + "\n");
            } catch (Exception e) {
                System.out.println("Ошибка добавления.");
            }
            toys.get(max).setCount(toys.get(max).getCount() - 1);
            if (toys.get(max).getCount() == 0) {
                toys.remove(max);
            }
        }

    }
}
