package example.dagger;

import com.example.module.LibModule;
import com.example.module.Source;
import dagger.Module;
import dagger.Provides;

@Module(includes = LibModule.class)
public abstract class MyModule {

    @Provides static String provideString(Source source) {
        return source.magic;
    }
}
