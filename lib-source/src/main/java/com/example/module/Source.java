package com.example.module;

import javax.inject.Inject;

public class Source {

    public final String magic;

    @Inject
    public Source() {
        this.magic = "42";
    }
}
