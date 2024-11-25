abstract class FileSystemComponent implements FileSystem {
    protected String name;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    @Override
    public abstract int getSize();

    @Override
    public abstract void displayStructure();
}
