package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        String[] sizes = new String[10];
        int min = 250;
        for (int i = 0; i < sizes.length; i++) {
            sizes[i] = String.valueOf(min);
            min += 5;
        }

        for (String size:
             sizes) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
    }
}
