import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

    @OriginalMember(owner = "client!rka", name = "Ub", descriptor = "Lclient!rt;")
    public static Class327 aClass327_7;

    @OriginalMember(owner = "client!rka", name = "Qb", descriptor = "Lclient!cd;")
    public static Class56 aClass56_3;

    @OriginalMember(owner = "client!rka", name = "Ob", descriptor = "I")
    public static int anInt8410 = 0;

    @OriginalMember(owner = "client!rka", name = "b", descriptor = "(ZI)V")
    public static void method7414() {
        @Pc(5) WeightedCache local5 = PlayerModel.BIG_CACHE;
        synchronized (PlayerModel.BIG_CACHE) {
            PlayerModel.BIG_CACHE.method2147(5);
        }
        local5 = PlayerModel.SMALL_CACHE;
        synchronized (PlayerModel.SMALL_CACHE) {
            PlayerModel.SMALL_CACHE.method2147(5);
        }
    }

    @OriginalMember(owner = "client!rka", name = "z", descriptor = "(I)[Lclient!pc;")
    public static Class287[] method7419() {
        return new Class287[]{Static450.aClass287_14, Static481.aClass287_15, Static379.aClass287_12, Static420.aClass287_13, Static328.aClass287_10, Static565.aClass287_8, Static73.aClass287_18, Static210.aClass287_9, Static704.aClass287_17, Static370.aClass287_11, Static3.aClass287_1, Static84.aClass287_6, Static668.aClass287_16, Static77.aClass287_5, Static18.aClass287_2};
    }
}
