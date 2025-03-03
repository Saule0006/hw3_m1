//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double[] numbers = { 1.0, 3.6, -1.8, 9.7, 6.8, 9.3, -2.9, 5.1, -7.9, 4.1, 3.0, 3.6, -1.9, 8.1, 4.2, };

        double sum = 0.0;
        int count = 0;
        boolean kk = false;

        for (double num: numbers){
            if (kk&&num>0){
                sum += num;
                count++;
            } else if (num <0) {
                kk = true;
            }
        }
        System.out.println(sum/count);
    }
}