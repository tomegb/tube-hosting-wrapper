package com.tube.hosting.java.tube.objects;

import org.jetbrains.annotations.NotNull;

public record VpsReinstall(int osId, @NotNull String password, @NotNull String hostname) {

}
