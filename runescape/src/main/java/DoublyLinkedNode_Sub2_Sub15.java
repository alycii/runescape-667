import com.jagex.collect.DoublyLinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public final class DoublyLinkedNode_Sub2_Sub15 extends DoublyLinkedList.Node {

    @OriginalMember(owner = "client!oea", name = "t", descriptor = "Lclient!b;")
    public final Class8_Sub2_Sub1_Sub1 aClass8_Sub2_Sub1_Sub1_1;

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(Lclient!b;)V")
    public DoublyLinkedNode_Sub2_Sub15(@OriginalArg(0) Class8_Sub2_Sub1_Sub1 arg0) {
        this.aClass8_Sub2_Sub1_Sub1_1 = arg0;
    }
}
