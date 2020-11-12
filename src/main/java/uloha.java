import java.io.File;

public class uloha {

    public static void main(String[] args) {

        myFile();
    }

    public static void myFile() {

        File myFile = new File("src/lubos/sukup/main");
        System.out.println(myFile.getAbsolutePath());
        System.out.println(myFile.canRead());
        System.out.println(myFile.exists());
        System.out.println(myFile.getName());
        System.out.println(myFile.isDirectory());
        if (myFile.isDirectory()) {

            String[] mojZoznam = myFile.list();

            for (int i = i = 0; i < 5; i++) {

            }

        }
    }
}



