public class prob3 {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 5");
        int i = 1;
        while(i>0) {
            if(i==3) {
                System.out.println("Continue");
                i++;
                continue;
            }
            else if(i>5) {
                System.out.println("Break");
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
