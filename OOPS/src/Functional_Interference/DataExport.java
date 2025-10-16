package Functional_Interference;

public class DataExport {

}

interface DataExporter {
    void exportToCSV();
    void exportToPDF();
    default void exportToJSON() {
        System.out.println("Exported to JSON (default).");
    }
}

class ReportExporter implements DataExporter {
    public void exportToCSV() { System.out.println("Exported CSV."); }
    public void exportToPDF() { System.out.println("Exported PDF."); }
}

class Demo {
    public static void main(String[] args) {
        ReportExporter exporter = new ReportExporter();
        exporter.exportToJSON();
    }
}
