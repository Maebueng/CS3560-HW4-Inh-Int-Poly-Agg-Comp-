public class Folder {
    private String folderName;
    // array to hold files
    private ArrayList<File> files; 
    // array to hold subfolders
    private ArrayList<Folder> subfolders;

    // default
    public Folder() {
        this.folderName = "New Folder";
    }

    // parameterized
    public Folder(String folderName) {
        this.folderName = folderName;
    }

    // getters
    public String getFolderName() {
        return folderName;
    }

    // setters
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    @Override
    public String toString() {
        return "Folder name: " + folderName;
    }
}