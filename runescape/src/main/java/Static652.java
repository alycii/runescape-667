import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static652 {

    @OriginalMember(owner = "client!uka", name = "x", descriptor = "Lclient!kq;")
    public static Class214 aClass214_1;

    @OriginalMember(owner = "client!uka", name = "o", descriptor = "I")
    public static int anInt9712 = 0;

    @OriginalMember(owner = "client!uka", name = "y", descriptor = "I")
    public static int anInt9713 = 0;

    @OriginalMember(owner = "client!uka", name = "a", descriptor = "(Lclient!ge;I)Lclient!gi;")
    public static Class146 method8531(@OriginalArg(0) Packet arg0) {
        @Pc(16) int local16 = arg0.g4();
        return new Class146(local16);
    }

    @OriginalMember(owner = "client!uka", name = "a", descriptor = "(III)Z")
    public static boolean method8532(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!uka", name = "a", descriptor = "(BILclient!sb;)Lclient!st;")
    public static Sprite method8533(@OriginalArg(1) int arg0, @OriginalArg(2) Class330 arg1) {
        @Pc(16) Sprite local16 = (Sprite) Static594.A_WEIGHTED_CACHE___193.method2156((long) arg0);
        if (local16 == null) {
            if (Static297.aBoolean368) {
                local16 = Static163.aToolkit_17.method7948(Static735.method9379(arg1, arg0), true);
            } else {
                local16 = Static168.method2634(arg1.method7589(arg0));
            }
            Static594.A_WEIGHTED_CACHE___193.put(local16, (long) arg0);
        }
        return local16;
    }
}
