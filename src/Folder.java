import java.util.ArrayList;
import java.util.List;

class Folder extends FileSystemComponent {
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }

    @Override
    public void displayStructure() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent component : components) {
            component.displayStructure();
        }
    }
}
