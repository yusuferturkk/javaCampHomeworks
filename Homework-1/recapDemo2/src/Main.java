public class Main {
    public static void main(String[] args) {
        double[] myList = { 1,2,3,4,5,6 };
        double total = 0;
        double max = myList[0];
        for (double number: myList){
            if (max < number){
                max = number;
            }
            total += number;
            System.out.println(number);
        }

        System.out.println(total);
        System.out.println("Hello world!");
    }
}