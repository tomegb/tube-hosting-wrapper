package com.tube.hosting.java.tube.objects;

import org.jetbrains.annotations.NotNull;

public class BandwidthResponse extends ResponsableObject {

    private final @NotNull String time;
    private final long out;
    private final long in;

    public BandwidthResponse(@NotNull String time, long out, long in) {
        this.time = time;
        this.out = out;
        this.in = in;
    }

    @NotNull
    public String getTime() {
        return time;
    }

    public long getOut() {
        return out;
    }

    public long getIn() {
        return in;
    }
}
