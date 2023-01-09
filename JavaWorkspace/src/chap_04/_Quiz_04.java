package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int max = 30000;
        int perHour = 4000;

        // case1
        char small = 'N';
        char handi = 'N';
        int hour = 5;
        int sum = 0;
        for (int i = 1; i <= hour; i++) {
            sum += perHour;

            if (sum > max) {
                sum = 30000;
                break;
            }
        }
        if (small == 'Y' || handi == 'Y') {
            sum /= 2;

        }
        System.out.println("요금은 " + sum + "원입니다.");

        System.out.println("-----------------");
        System.out.println();

        // case2
        small = 'Y';
        handi = 'N';
        hour = 5;
        sum = 0;
        for (int i = 1; i <= hour; i++) {
            sum += perHour;

            if (sum > max) {
                sum = 30000;
                break;
            }
        }
        if (small == 'Y' || handi == 'Y') {
            sum /= 2;
        }
        System.out.println("요금은 " + sum + "원입니다.");

        System.out.println("--------------");
        System.out.println();


        // case3
        small = 'N';
        handi = 'Y';
        hour = 10;
        sum = 0;
        for (int i = 1; i <= hour; i++) {
            sum += perHour;

            if (sum > max) {
                sum = 30000;
                break;
            }
        }
        if (small == 'Y' || handi == 'Y') {
            sum /= 2;
        }
        System.out.println("요금은 " + sum + "원입니다.");

        System.out.println("--------------");
        System.out.println();


    }
}
