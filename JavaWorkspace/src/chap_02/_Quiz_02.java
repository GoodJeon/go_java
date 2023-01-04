package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {

        int x = 115;
        int y = 121;

        String height1 = (x >= 120) ? "키가 " + x + "cm 이므로 탑승 가능합니다." : "키가 " + x + "cm 이므로 탑승 불가능합니다.";
        String height2 = (y >= 120) ? "키가 " + y + "cm 이므로 탑승 가능합니다." : "키가 " + y + "cm 이므로 탑승 불가능합니다.";

        System.out.println(height1);
        System.out.println(height2);
    }

}
