import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        //创建系统
        Order order=new Order();
        //启动系统
        order.start();

    }
}
