package rs2.client.event.mouse;

import com.jagex.core.datastruct.key.Node;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public abstract class MouseLog extends Node {

    public static final int TYPE_RESET = -1;

    public static final int TYPE_PRESS_LEFT = 0;

    public static final int TYPE_PRESS_MIDDLE = 1;

    public static final int TYPE_PRESS_RIGHT = 2;

    public static final int TYPE_RELEASE_LEFT = 3;

    public static final int TYPE_RELEASE_MIDDLE = 4;

    public static final int TYPE_RELEASE_RIGHT = 5;

    public static final int TYPE_SCROLL = 6;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(II)Z")
    public static boolean isPress(@OriginalArg(0) int type) {
        return type == TYPE_PRESS_LEFT
            || type == TYPE_PRESS_MIDDLE
            || type == TYPE_PRESS_RIGHT;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)I")
    public abstract int getType();

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)I")
    public abstract int getX();

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(B)I")
    public abstract int getExtra();

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)I")
    public abstract int getY();

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(B)J")
    public abstract long getTime();
}
