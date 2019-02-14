package mate.academy.patterns.adapter;

public class AdapterJavaAppToCppApp implements CppApp {
    private JavaApp javaApp;

    public AdapterJavaAppToCppApp(JavaApp javaApp) {
        this.javaApp = javaApp;
    }

    @Override
    public void insert() {
        javaApp.saveObject();
    }

    @Override
    public void delete() {
        javaApp.deleteObject();
    }
}
