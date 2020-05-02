package com.example.module;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class LibModule {
    @Provides static Source provideSource() {
        return new Source();
    }
}
