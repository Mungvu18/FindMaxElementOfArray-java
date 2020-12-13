import java.util.Scanner;

public class FindMaxOfArray {
    public static void main(String[] args) {
        // khai báo mảng gồm tài sản tỉ phú đô la
        double[] listOfManRich;
        Scanner sc = new Scanner(System.in);
        int size;
        // nhập size của mảng
        do {
            System.out.println("Mời bạn nhâp kích thước mảng");
             size = sc.nextInt();
            if (size > 20)
                System.out.println("Mời bạn nhập lại size không được lớn hơn 20");
        } while (size > 20);
        // nhập phần tử vào mảng
        listOfManRich = new double[size];
        for (int i = 0; i < listOfManRich.length; i++) {
            System.out.println("nhập phần tử mảng: ");
            listOfManRich[i] = sc.nextDouble();
        }
        // in ra phần tử mảng
        System.out.println("phần tử mảng: ");
        for (double x:listOfManRich) {
            System.out.println(x+"\t");
        }
        double max = listOfManRich[0];
        for (double element:listOfManRich) {
            if(element>max){
                max = element;
            }
        }
        System.out.println("element max: " + max);
    }
}
