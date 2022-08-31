package com.tube.hosting.java.tube.objects;

import org.jetbrains.annotations.NotNull;

public record BandwithResponse(@NotNull String time, long out, long in) {

}
