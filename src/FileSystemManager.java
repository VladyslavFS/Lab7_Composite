public class FileSystemManager {
    public static void main(String[] args) {
        Folder rootFolder = new Folder("Root");

        // Створюємо файли
        File file1 = new File("Document.txt", 120);
        File file2 = new File("Photo.jpg", 350);

        // Додаємо файли в папку
        rootFolder.addComponent(file1);
        rootFolder.addComponent(file2);

        Folder homeFolder = new Folder("Home");
        rootFolder.addComponent(homeFolder);

        // Виводимо структуру каталогу
        rootFolder.displayStructure();

        // Обчислюємо загальний розмір
        System.out.println("Total size: " + rootFolder.getSize() + " KB");
    }
}
