public class File {
    private String fileName;

    // default
    public File() {
        this.fileName = "File.exe";
    }

    // parameterized
    public File(String fileName) {
        this.fileName = fileName;
    }

    // getters
    public String getFileName() {
        return fileName;
    }

    // setters
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "File name: " + fileName;
    }
}