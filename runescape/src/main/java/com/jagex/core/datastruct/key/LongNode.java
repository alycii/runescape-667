package com.jagex.core.datastruct.key;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public final class LongNode extends Node {

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "J")
    public long value;

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
    public LongNode() {
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(J)V")
    public LongNode(@OriginalArg(0) long value) {
        this.value = value;
    }
}
