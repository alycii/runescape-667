import com.jagex.core.datastruct.key.IntNode;
import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rga")
public final class CutsceneAction_Sub19 extends CutsceneAction {

    @OriginalMember(owner = "client!rga", name = "h", descriptor = "J")
    public final long aLong257;

    @OriginalMember(owner = "client!rga", name = "i", descriptor = "I")
    public final int anInt8296;

    @OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(Lclient!ge;Z)V")
    public CutsceneAction_Sub19(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1) {
        super(arg0);
        @Pc(6) int local6 = arg0.g2();
        if (arg1) {
            this.aLong257 = (long) local6 | 0x100000000L;
        } else {
            this.aLong257 = local6;
        }
        this.anInt8296 = arg0.g4();
    }

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(I)V")
    @Override
    public void method9161() {
        @Pc(10) IntNode local10 = (IntNode) Static25.A_HASH_TABLE___4.get(this.aLong257);
        if (local10 == null) {
            Static25.A_HASH_TABLE___4.put(this.aLong257, new IntNode(this.anInt8296));
        } else {
            local10.value = this.anInt8296;
        }
    }
}