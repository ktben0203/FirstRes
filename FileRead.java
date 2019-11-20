package fileread;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileRead{

  public static void main(String[]args){
    BufferedReader br = null;
    try{
    String get;
    br = new BufferedReader(new FileReader("C:Users/s707571.KLEINISD/desktop/ForJ.txt"));
    while((get = br.readLine()) != null){
      System.out.println(m;
    }
    
    }catch(IOException e)
      e.printStackTrace();
    }finally{
      try{
        while(br != null){
          br.close();
        }
        catch(IOException ee){
          ee.printStackTrace();
        }
      }
    }
    
  }

}
