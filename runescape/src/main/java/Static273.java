import com.jagex.ServerProt;
import com.jagex.core.io.BitPacket;
import com.jagex.js5.js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "I")
    public static int anInt4395 = 100;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "Lclient!lga;")
    public static final ServerProt A_SERVER_PROT___113 = new ServerProt(1, -1);

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "Z")
    public static boolean aBoolean339 = true;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!bd;ZIILclient!sb;II)V")
    public static void method3961(@OriginalArg(0) Node_Sub6_Sub1 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) js5 arg2, @OriginalArg(5) int arg3) {
        Static611.method8229(arg1, arg3, arg2);
        Static117.aClass2_Sub6_Sub1_2 = arg0;
    }

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "(I)Lclient!fk;")
    public static ClientMessage method3962() {
        @Pc(6) ClientMessage local6 = Static119.method2174();
        local6.aClientProt_32 = null;
        local6.anInt2986 = 0;
        local6.bitPacket = new BitPacket(5000);
        return local6;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIII)I")
    public static int method3966(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
        if (arg2 == arg0) {
            return arg2;
        }
        @Pc(14) int local14 = 128 - arg1;
        @Pc(29) int local29 = local14 * (arg2 & 0x7F) + (arg0 & 0x7F) * arg1 >> 7;
        @Pc(43) int local43 = (arg2 & 0x380) * local14 + (arg0 & 0x380) * arg1 >> 7;
        @Pc(57) int local57 = arg1 * (arg0 & 0xFC00) + local14 * (arg2 & 0xFC00) >> 7;
        return local43 & 0x380 | local57 & 0xFC00 | local29 & 0x7F;
    }
}
