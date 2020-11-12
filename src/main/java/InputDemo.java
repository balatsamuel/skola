import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class InputDemo {




        public static void main(String[] args){

            try {
                FileWriter writer = new FileWriter("otazky_odpovede");
                writer.write("nas novy riadok");
                writer.close();

                FileWriter writer1 = new FileWriter("novy_dokument",
                                                    true);
                writer1.write("\n Dalsi riadok");

            }catch (IOException e){
                e.printStackTrace();
                }
            }


        }


