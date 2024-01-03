package tech.dar.practice11.dependency_inversion;

public interface IFileStorage {

    void uploadFile(String name, String body);

    String getFile(String name);

}
