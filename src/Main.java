import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int menu=0;
        do{
            System.out.println("-----------------------------------------------------");
            System.out.println("|Chức năng 0: thoát chương trình");
            System.out.println("|Chức năng 1: Kiểm tra số chẵn lẻ");
            System.out.println("Xin mời chọn chức năng:");
            menu=Integer.parseInt(sc.nextLine());
            switch (menu){
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                case 1:
                    checkParity();
                    break;

            }
        }while(menu!=0);

    }

//    Bài 1
//    Kiểm tra số chẵn hay lẻ:
//    Nhập vào từ bàn phím một số nguyên.
//    In ra kết quả cho biết số người dùng nhập là chẵn hay lẻ.

    public static void checkParity() {
        System.out.println("Xin mời nhập vào 1 số nguyên");
        int soNguyen = Integer.parseInt(sc.nextLine());
        if (soNguyen % 2 == 0) {
            System.out.println(soNguyen + " Là số chẵn");
        } else {
            System.out.println(soNguyen + " Là số lẻ");
        }

    }


}
