public class Task3 {
    public static void main(String args[]) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 60;
        int st = 0;
        int end = arr.length - 1;
        boolean found = false;
        while (st <= end) {
            int mid = st + (end - st) / 2; 
            if (arr[mid] == target) {
                System.out.println("Found at index: " + mid);
                found = true;
                break;
            }
            if (target > arr[mid]) {
                st = mid + 1;
            }          
            else {
                end = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}