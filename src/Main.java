import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //findNumbers();
        add();
        delete();
        update();
        int total = gather(5,9);
        System.out.println(total);
    }
    public static void findNumbers(){
        int[] numbers = new int[]{1,2,3,5,7,9,0,8};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bulmak istediğiniz sayıyı giriniz: ");
        int enteredNumber = scanner.nextInt();
        boolean isThere = false;

        for (int number : numbers){
            if (number == enteredNumber){
                isThere = true;
                break;
            }
        }

        if (isThere){
            sendAMessage(enteredNumber + " Sayısı mevcuttur ");
        }else {
            sendAMessage(enteredNumber + " Sayısı mevcut değildir ");
        }
    }

    public static void sendAMessage(String message){
        System.out.println(message);
    }

    public static void add(){
        System.out.println("Eklendi");
    }

    public static void delete(){
        System.out.println("Silindi");
    }

    public static void update(){
        System.out.println("Güncellendi");
    }

    public static int gather(int number_1, int number_2){
        return number_1 + number_2;
    }
}