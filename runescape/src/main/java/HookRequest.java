import com.jagex.core.datastruct.key.Node;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class HookRequest extends Node {

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public int mouseY;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "Lclient!hda;")
    public Component aComponent_13;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "Z")
    public boolean mouseEvent;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "[Ljava/lang/Object;")
    public Object[] arguments;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public int anInt7216;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "Lclient!hda;")
    public Component source;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public int mouseX;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "Ljava/lang/String;")
    public String aString84;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public int anInt7219;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public int anInt7220;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public int anInt7221;
}