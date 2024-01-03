package tech.dar.practice11.dependency_inversion;

public class CloudStorage implements IFileStorage {

    public void uploadFile(String name, String body) {
        // http.post("aws/s3/1234", body);
    }

    public String getFile(String name) {
        // http.get("aws/s3/1234/" + name);
        return "";
    }

}
