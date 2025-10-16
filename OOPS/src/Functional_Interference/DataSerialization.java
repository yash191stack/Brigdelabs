package Functional_Interference;

public class DataSerialization {

}

import java.io.Serializable;

class BackupData implements Serializable {
    String name = "Backup_Settings";
}

class Demo {
    public static void main(String[] args) {
        System.out.println("BackupData is serializable.");
    }
}
