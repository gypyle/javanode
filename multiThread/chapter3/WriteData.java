package chapter3;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @author ：guoyanpei
 * @date ：Created in 2021-04-27 20:32
 * @description：
 * @modified By：
 * @version: version$
 */
public class WriteData {
    public void writeMethod(PipedOutputStream out){
        try {
            System.out.println("write :");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                out.write(outData.getBytes());
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
