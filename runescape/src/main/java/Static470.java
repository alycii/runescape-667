import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static470 {

    @OriginalMember(owner = "client!or", name = "F", descriptor = "Lclient!pg;")
    public static DoublyLinkedNode_Sub2_Sub16 aClass2_Sub2_Sub16_10;

    @OriginalMember(owner = "client!or", name = "J", descriptor = "S")
    public static short aShort82;

    @OriginalMember(owner = "client!or", name = "H", descriptor = "Lclient!ss;")
    public static final Class345 aClass345_88 = new Class345(19, 3);

    @OriginalMember(owner = "client!or", name = "P", descriptor = "Lclient!hc;")
    public static final Class155 aClass155_32 = new Class155(50);

    @OriginalMember(owner = "client!or", name = "Y", descriptor = "I")
    public static int anInt7112 = -1;

    @OriginalMember(owner = "client!or", name = "Z", descriptor = "I")
    public static int anInt7113 = -1;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!hda;III)V")
    public static void method6383(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        if (arg0.postTypeVertical == 0) {
            arg0.positionY = arg0.basePosY;
        } else if (arg0.postTypeVertical == 1) {
            arg0.positionY = arg0.basePosY + (arg2 - arg0.height) / 2;
        } else if (arg0.postTypeVertical == 2) {
            arg0.positionY = arg2 - arg0.height - arg0.basePosY;
        } else if (arg0.postTypeVertical == 3) {
            arg0.positionY = arg0.basePosY * arg2 >> 14;
        } else if (arg0.postTypeVertical == 4) {
            arg0.positionY = (arg2 - arg0.height) / 2 + (arg2 * arg0.basePosY >> 14);
        } else {
            arg0.positionY = arg2 - (arg0.basePosY * arg2 >> 14) - arg0.height;
        }
        if (arg0.posTypeHorizontal == 0) {
            arg0.positionX = arg0.basePosX;
        } else if (arg0.posTypeHorizontal == 1) {
            arg0.positionX = arg0.basePosX + (arg1 - arg0.width) / 2;
        } else if (arg0.posTypeHorizontal == 2) {
            arg0.positionX = arg1 - arg0.width - arg0.basePosX;
        } else if (arg0.posTypeHorizontal == 3) {
            arg0.positionX = arg0.basePosX * arg1 >> 14;
        } else if (arg0.posTypeHorizontal == 4) {
            arg0.positionX = (arg1 - arg0.width) / 2 + (arg1 * arg0.basePosX >> 14);
        } else {
            arg0.positionX = arg1 - (arg1 * arg0.basePosX >> 14) - arg0.width;
        }
        if (!InterfaceManager.testOpacity) {
            return;
        }
        if (InterfaceManager.serverActiveProperties(arg0).events == 0 && arg0.type != 0) {
            return;
        }
        if (arg0.positionX < 0) {
            arg0.positionX = 0;
        } else if (arg1 < arg0.width + arg0.positionX) {
            arg0.positionX = arg1 - arg0.width;
        }
        if (arg0.positionY < 0) {
            arg0.positionY = 0;
            return;
        }
        if (arg0.positionY + arg0.height > arg2) {
            arg0.positionY = arg2 - arg0.height;
            return;
        }
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(B)V")
    public static void method6386() {
        if (!Static15.aBoolean17) {
            Static552.aFloat207 += (-Static552.aFloat207 - 24.0F) / 2.0F;
            Static15.aBoolean17 = true;
            Static273.aBoolean339 = true;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)Z")
    public static boolean method6387() {
        if (MainLogicManager.step == 3) {
            return Static135.anInt8223 == 0 && Static6.anInt95 == 0;
        } else {
            return false;
        }
    }
}
