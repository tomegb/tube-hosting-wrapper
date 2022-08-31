package com.tube.hosting.java.tube.objects;

import org.jetbrains.annotations.NotNull;

public class StatusMessageUserData extends ResponsableObject {
    private final @NotNull String readTime;

    public StatusMessageUserData(@NotNull String readTime) {
        this.readTime = readTime;
    }

    @NotNull
    public String getReadTime() {
        return readTime;
    }
}
