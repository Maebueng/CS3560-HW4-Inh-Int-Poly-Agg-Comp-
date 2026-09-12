public class Folder {
    private String folderName;
    // array to hold files
    private ArrayList<File> files; 
    // array to hold subfolders
    private ArrayList<Folder> subfolders;

    // default
    public Folder() {
        this.folderName = "New Folder";
        // initialization of folders
        this.files = new ArrayList<>();
        this.subfolders = new ArrayList<>();
    }

    // parameterized
    public Folder(String folderName) {
        this.folderName = folderName;
        this.files = new ArrayList<>();
        this.subfolders = new ArrayList<>();
    }

    // getters
    public String getFolderName() {
        return folderName;
    }

    // setters
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    // helper methods to add contents to both files and subfolders to a folder
    public void addFile(File file) {
        this.files.add(file);
    }

    public void addFolder(Folder folder) {
        this.subfolders.add(folder);
    }

    // helper method to remove subfolders
    public void removeFolder(String folderName) {
        // removeIf instead of for loop for cleaner code / bug prevention
        // conditional: folder name matches folder name passed through argument
        this.subfolders.removeIf(folder -> folder.getFolderName().equals(folderName));

        // goes deeper to for removal
        for (Folder sub : subfolders) {
            sub.removeFolder(folderName);
        }
    }

    public void print() {
        System.out.println("Folder: " + folderName);

        // recursive call to print contents of folder
        for (Folder subfolder : subFolders) {
            subfolder.print();
        }

        for (File file : files) {
            System.out.println(" | File: " + file.getFileName());
        }
    }

    /*@Override
    public String toString() {
        return "Folder name: " + folderName;
    }*/
}