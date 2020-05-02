package example.dagger;

import dagger.Component;

@Component(modules = MyModule.class)
public interface MyComponent {
    void inject(App app);
}
