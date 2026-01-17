
public class ConcatinateString {

    public static void main(String[] args) {
        String[] stringArr = {"Java", " ", "is", " ", "powerful" "language"};
        String ans = ConcatinateStringUsingStringBuffer(stringArr);
        System.out.println(ans);
    }

    static String ConcatinateStringUsingStringBuffer(String[] stringArr) {

        StringBuffer sb = new StringBuffer();

        for (String word : stringArr) {
            sb.append(word);
        }

        return sb.toString();
    }
}
