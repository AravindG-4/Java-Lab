import java.io.*;
class prob5 {
    public static void main(String[] args) {
        byte a = 65;
        try {
            FileOutputStream fout = new FileOutputStream("hello.txt");
            fout.write(a);
            fout.close();
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            FileInputStream fin = new FileInputStream("hello.txt");
            int i = fin.read();
            System.out.println((char)i);
            fin.close();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
