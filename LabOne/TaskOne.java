public class ArrayExample {
    public static void main(String[] args) { 
        // Static Integer Array using new[] 
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 7;
        
        // Static String Array 
        String[] names = {"Tanim", "Rakib", "Shakib"};

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        System.out.println("Names in the array:"); 
        for (int i = 0; i < names.length; i++) { 
            System.out.println(names[i]);
        } 
        System.out.println("\nStatic Array elements:"); 
        for (int i = 0; i < numbers.length; i++) { 
            System.out.println(numbers[i]);
        }
    }
}
