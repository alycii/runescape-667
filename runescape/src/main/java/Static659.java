import com.jagex.core.constants.ModeWhere;
import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static659 {

    @OriginalMember(owner = "client!ut", name = "C", descriptor = "F")
    public static float aFloat213;

    @OriginalMember(owner = "client!ut", name = "v", descriptor = "I")
    public static int blockChat = 0;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(III)I")
    public static int method8604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        @Pc(15) int local15 = arg0 * 57 + arg1;
        @Pc(21) int local21 = local15 ^ local15 << 13;
        @Pc(35) int local35 = Integer.MAX_VALUE & local21 * (local21 * 15731 * local21 + 789221) + 1376312589;
        return local35 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "(B)Ljava/lang/String;")
    public static String method8605() {
        @Pc(15) String local15 = "www";
        if (client.modeWhere == ModeWhere.WTRC) {
            local15 = "www-wtrc";
        } else if (client.modeWhere == ModeWhere.WTQA) {
            local15 = "www-wtqa";
        } else if (client.modeWhere == ModeWhere.WIP) {
            local15 = "www-wtwip";
        }
        @Pc(44) String local44 = "";
        if (client.settings != null) {
            local44 = "/p=" + client.settings;
        }
        return "http://" + local15 + "." + client.modeGame.domainName + ".com/l=" + client.language + "/a=" + client.affid + local44 + "/";
    }

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "(B)Lclient!ge;")
    public static Packet method8608() {
        @Pc(6) Packet local6 = Static570.method7552();
        local6.p8(0L);
        local6.pjstr(Static59.aString63);
        local6.p8(Static430.aLong209);
        local6.p8(Static571.aLong269);
        local6.rsaenc(Static374.LOGIN_RSA_MODULUS, Static262.LOGIN_RSA_EXPONENT);
        return local6;
    }
}
