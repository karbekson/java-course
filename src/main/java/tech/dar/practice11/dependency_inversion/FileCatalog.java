package tech.dar.practice11.dependency_inversion;

import java.util.ArrayList;
import java.util.List;

public class FileCatalog {

    // DB, Disk, Cloud
    private final IFileStorage storage;
    private List<String> fileNames;

    public FileCatalog(IFileStorage storage) {
        this.storage = storage;
        this.fileNames = new ArrayList<>();
    }

    public void addFile(File file) {
        fileNames.add(file.name);
        storage.uploadFile(file.name, file.body);
    }

    public File getFile(String name) throws Exception {
        for (String n: fileNames) {
            if (name.equals(n)) {
                return new File(name, storage.getFile(name));
            }
        }
        throw new Exception("Not found!");
    }

}
