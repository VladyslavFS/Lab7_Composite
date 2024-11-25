class File extends FileSystemComponent {
    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void displayStructure() {
        System.out.println("File: " + name + " (Size: " + size + " KB)");
    }
}
