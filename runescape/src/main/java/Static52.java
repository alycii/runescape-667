import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static52 {

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int varcUpdateCount = 0;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)Z")
    public static boolean method1157(@OriginalArg(0) int arg0) {
        return SongManager.anInt10171 == 0 ? Static581.mixBuss.isPlaying() : true;
    }

}
