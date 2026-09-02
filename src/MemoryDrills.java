public class MemoryDrills {
    public static void main(String[] args) {
        int a = 10;
        int[] array = {4, 5, 7};

        System.out.println("--- BEFORE ---");
        System.out.println("Primitive 'a': " + a);
        System.out.println("Reference 'array[0]': " + array[0]);

        modifyPrimitive(a);
        modifyReference(array);

        System.out.println("--- AFTER ---");
        System.out.println("Primitive 'a': " + a);
        System.out.println("Reference 'array[0]': " + array[0]);


    }

    public static void modifyPrimitive(int number) {
        number = 99;
        System.out.println("Inside modifyPrimitive, 'number' is now: " + number);
    }

    public static void modifyReference(int[] arr) {
        arr[0] = 99;
        System.out.println("Inside modifyReference, 'arr[0]' is now: " + arr[0]);
    }

}