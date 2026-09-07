public class StringDrills {
    public static void main(String[] args) {
        System.out.println("--- String vs StringBuilder Benchmark ---");

        long stringTime = benchmarkString();
        System.out.println("Standard String loop took: " + stringTime + " ms");

        long builderTime = benchmarkStringBuilder();
        System.out.println("StringBuilder loop took: " + builderTime + " ms");
    }

    public static long benchmarkString() {
        long startTime = System.currentTimeMillis();
        String result = "";
    
        for(int i = 1; i <= 100000; i++) {
            result += "a";
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long benchmarkStringBuilder() {
        long startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();

        for(int i = 1; i <= 100000; i++) {
            builder.append("a");
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}