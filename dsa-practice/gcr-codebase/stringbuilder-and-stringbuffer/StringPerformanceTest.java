public class StringPerformanceTest {

    public static void main(String[] args) {

        int iterations = 1_000_000;
        String text = "hello";

        // StringBuilder
        long startBuilder = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }

        long endBuilder = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endBuilder - startBuilder) + " ms");

        // StringBuffer
        long startBuffer = System.currentTimeMillis();
        StringBuffer sbuf = new StringBuffer();

        for (int i = 0; i < iterations; i++) {
            sbuf.append(text);
        }

        long endBuffer = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (endBuffer - startBuffer) + " ms");
    }
}
