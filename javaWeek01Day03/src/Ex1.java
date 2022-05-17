public class Ex1 {
    public static void main(String[] args) {
        int []arr = new int[7];

        try{
        System.out.println(arr[9]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
