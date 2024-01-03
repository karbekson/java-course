package tech.dar.practice11.dependency_inversion;

public class DBStorage implements IFileStorage {

    public void uploadFile(String name, String body) {
        // "INSERT INTO files(`name`, `body`) VALUES (:name, :body)"
    }

    public String getFile(String name) {
        // "SELECT * FROM files WHERE `name` = :name
        return "";
    }

}
