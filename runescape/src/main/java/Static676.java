import com.jagex.graphics.Toolkit;
import com.jagex.js5.js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static676 {

    @OriginalMember(owner = "client!vha", name = "I", descriptor = "Lclient!sb;")
    public static js5 aJs5_121;

    @OriginalMember(owner = "client!vha", name = "w", descriptor = "I")
    public static int crossX = 0;

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lclient!ha;Z)V")
    public static void method8859(@OriginalArg(0) Toolkit arg0) {
        if (MiniMenu.open) {
            Static39.method1022(arg0);
        } else {
            MiniMenu.method7301(arg0);
        }
    }
}
