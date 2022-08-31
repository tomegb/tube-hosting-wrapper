package com.tube.hosting.java.tube.objects;

import org.jetbrains.annotations.NotNull;

public class IpRDNSBody extends ResponsableObject {
    private final @NotNull String rdns;

    public IpRDNSBody(@NotNull String rdns) {
        this.rdns = rdns;
    }

    @NotNull
    public String getRdns() {
        return rdns;
    }
}


