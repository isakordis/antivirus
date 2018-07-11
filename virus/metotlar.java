/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anti.virus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;


public class metotlar {
    public static String dosyasec(){
       JFileChooser chooser=new JFileChooser();
        chooser.setCurrentDirectory(new File(""));
        chooser.setDialogTitle("Lütfen dosya secminizi Yapınız.");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
//FARKLI OLAN TEK YER FILESONLY YERINE DIRECTORIESONLY GELDI
      int geridonus=chooser.showOpenDialog(null);
      if(geridonus==JFileChooser.APPROVE_OPTION){
          return chooser.getSelectedFile().getAbsolutePath();
      }else{
          return null;
      }

}
//    public static String dosyaOku() throws IOException{
//      String dosyam=Uygulama.yolum;
//        File file = new File(dosyam);
//        BufferedReader reader = null;
//        reader = new BufferedReader(new FileReader(file));
//        String satir = reader.readLine();
// 
//            while (satir!="wallhack") {
//                
//                satir = reader.readLine();
//                return "Virüs tespit edilmiştir.";
//                
//            }
//            return "temiz";
//    }
}