public class TimeComparison {

    public static void main(String[] args) {

        int n = 1_000_000;

        long start = System.nanoTime();
        String result1 = concatenateUsingStringBuilder(n);
        long end = System.nanoTime();
        System.out.println("Time Using StringBuilder ---> " + (end - start) + " ns");

        start = System.nanoTime();
        String result2 = concatenateUsingStringBuffer(n);
        end = System.nanoTime();
        System.out.println("Time Using StringBuffer  ---> " + (end - start) + " ns");
    }

    static String concatenateUsingStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i + " ");
        }
        return sb.toString();
    }

    static String concatenateUsingStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(i + " ");
        }
        return sb.toString();
    }
}
