import com.jagex.graphics.ClippingMask;
import com.jagex.graphics.Sprite;
import com.jagex.math.Trig1;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int anInt94 = 0;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "J")
    public static long aLong8 = 0L;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int anInt95 = 0;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BILclient!aa;Lclient!st;IILclient!hda;I)V")
    public static void method107(@OriginalArg(1) int arg0, @OriginalArg(2) ClippingMask arg1, @OriginalArg(3) Sprite arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Component arg5, @OriginalArg(7) int arg6) {
        if (arg2 == null) {
            return;
        }
        @Pc(15) int local15;
        if (Camera.mode == 4) {
            local15 = (int) Camera.playerCameraYaw & 0x3FFF;
        } else {
            local15 = (int) Camera.playerCameraYaw + Camera.yawOffset & 0x3FFF;
        }
        @Pc(37) int local37 = Math.max(arg5.width / 2, arg5.height / 2) + 10;
        @Pc(45) int local45 = arg3 * arg3 + arg4 * arg4;
        if (local37 * local37 < local45) {
            return;
        }
        @Pc(60) int local60 = Trig1.SIN[local15];
        @Pc(64) int local64 = Trig1.COS[local15];
        if (Camera.mode != 4) {
            local60 = local60 * 256 / (Camera.scaleOffset + 256);
            local64 = local64 * 256 / (Camera.scaleOffset + 256);
        }
        @Pc(98) int local98 = local64 * arg4 + local60 * arg3 >> 14;
        @Pc(109) int local109 = arg3 * local64 - arg4 * local60 >> 14;
        arg2.method8195(local98 + arg5.width / 2 + arg6 - arg2.scaleWidth() / 2, arg5.height / 2 + arg0 - local109 + -(arg2.scaleHeight() / 2), arg1, arg6, arg0);
    }
}
