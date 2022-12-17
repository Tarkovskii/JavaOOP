package src.com.lesson.OOP.Ex2sem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Save {

    public void save (List<Animals> animals){
        try (FileWriter writer=new FileWriter ("list.txt", false)){
            for (Animals item: animals) {
                writer.write(item.toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
