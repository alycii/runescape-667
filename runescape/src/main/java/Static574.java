import com.jagex.game.runetek6.config.bastype.BASTypeList;
import com.jagex.graphics.Toolkit;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.Dimension;

public final class Static574 {

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "Lclient!qp;")
    public static BASTypeList basTypeList;

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "[I")
    public static final int[] anIntArray683 = new int[3];

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(I)V")
    public static void method7572() {
        if (Toolkit.active.method7978()) {
            Toolkit.active.method7972(GameShell.canvas);
            Static208.method3106();
            if (InterfaceManager.aBoolean210) {
                Static720.method9397(GameShell.canvas);
            } else {
                @Pc(26) Dimension local26 = GameShell.canvas.getSize();
                Toolkit.active.method8022(GameShell.canvas, local26.width, local26.height);
            }
            Toolkit.active.method8019(GameShell.canvas);
        } else {
            Static32.method880(ClientOptions.instance.toolkit.getValue(), false);
        }
        InterfaceManager.redrawAll();
        Static75.aBoolean521 = true;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)Z")
    public static boolean method7573() {
        Static334.anInt5456++;
        Static252.aBoolean316 = true;
        return true;
    }
}
