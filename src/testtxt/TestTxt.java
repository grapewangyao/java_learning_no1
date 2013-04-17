/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testtxt;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wangyao_tp
 */
public class TestTxt {
    private String fileName = "";
    private String msg = "";
  
    public void setFileName(String fileName){
        this.fileName = fileName;
    }
    public String readFile(){
        File fileObj;
        fileObj = new File(this.fileName);
        if(fileObj.exists() && fileObj.isFile()){
            try {
                BufferedReader bf = new BufferedReader(new FileReader(fileObj));
                String content = "";
                StringBuilder sb = new StringBuilder();
                while(content != null){
                     content = bf.readLine();
                     if(content == null){
                       break;
                     }
                     sb.append(content.trim());
                }
                bf.close();
                return sb.toString();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TestTxt.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TestTxt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            this.msg = fileObj.toString();
        }
        return this.msg;
    }
    public static void main(String[] args) {
        TestTxt tst;
        tst = new TestTxt();
        tst.setFileName("D:\\test.txt");
        System.out.print(tst.readFile()+"\n");
    }
}
