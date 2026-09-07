public class ArrayDrills {
    public static void main(String[] args) {

        Account account = new Account(100.00);

        account.withdraw(100.00);

        System.out.println("Final balance: " + account.getBalance());

        int[] numbers = {12, 45, 2, 89, 23};

        System.out.println(findMax(numbers));

        int[] reversed = reverseArray(numbers);
        for(int num : reversed) {
            System.out.println(num + " ");
        }
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if(max < numbers[i]) {
                max = numbers[i];
            }
        }
    return max;
    }

    public static int[] reverseArray(int[] numbers) {
        int[] newArray = new int[numbers.length];
        int counter = 0;
        for(int i = numbers.length-1; i >= 0; i--) {

            newArray[counter] = numbers[i];
            counter++;
        }

        return newArray;
    }
}