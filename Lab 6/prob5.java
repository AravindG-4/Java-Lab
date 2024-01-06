import java.io.*;
class prob5 {
    public static void main(String[] args) {
        byte a = 65;
        try {
            FileOutputStream fout = new FileOutputStream("hello.txt");
            fout.write(a);
        }catch (Exception e){
                System.out.println(e);
        }
    }
}
