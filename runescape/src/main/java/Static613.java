import com.jagex.graphics.Toolkit;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static613 {

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lclient!ha;III)V")
    public static void method8239(@OriginalArg(0) Toolkit arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
        Static665.aEnvironmentArrayArray1 = new Environment[arg2][arg1];
        Static425.aToolkit_13 = arg0;
        if (Static449.anIntArray546 != null) {
            Static226.aClass67_9 = Static373.method5301(Static449.anIntArray546[4], Static449.anIntArray546[1], Static449.anIntArray546[2], Static449.anIntArray546[3], Static449.anIntArray546[5], Static449.anIntArray546[0]);
        }
        Static495.aClass148_4 = null;
        Static556.aEnvironment_2 = new Environment();
        Static508.method6750();
    }
}
