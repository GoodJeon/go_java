package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // 포함 관계
        System.out.println(s.contains("Java"));
        System.out.println(s.contains("C#"));
        System.out.println(s.indexOf("Java")); // 위치정보 7
        System.out.println(s.indexOf("C#")); // 포함되어 있지 않아 -1
        System.out.println(s.indexOf("and"));
        System.out.println(s.lastIndexOf("and"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.endsWith("C."));

    }
}
