Trees.java
public class Trees {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print((char)('A' + j - 1));
            }
            System.out.println();
            count++;
            if (count == 3) {
                System.out.println("Trees");
                count = 0;
            }
        }
    }
}