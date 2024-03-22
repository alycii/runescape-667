import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public final class ServerProt {

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!lga;")
    public static final ServerProt A_SERVER_PROT___43 = new ServerProt(37, -2);

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "Lclient!lga;")
    public static final ServerProt A_SERVER_PROT___45 = new ServerProt(33, -2);

    @OriginalMember(owner = "client!dma", name = "k", descriptor = "Lclient!lga;")
    public static final ServerProt A_SERVER_PROT___47 = new ServerProt(137, 8);

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "Lclient!lga;")
    public static final ServerProt A_SERVER_PROT___147 = new ServerProt(51, 0);

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "Lclient!lga;")
    public static final ServerProt A_SERVER_PROT___49 = new ServerProt(5, 7);

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "Lclient!lga;")
    public static final ServerProt A_SERVER_PROT___52 = new ServerProt(60, 7);

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "Lclient!lga;")
    public static final ServerProt A_SERVER_PROT___53 = new ServerProt(75, 3);

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "Lclient!lga;")
    public static final ServerProt A_SERVER_PROT___54 = new ServerProt(91, -1);

    @OriginalMember(owner = "client!lga", name = "e", descriptor = "I")
    public final int opcode;

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "I")
    public final int size;

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(II)V")
    public ServerProt(@OriginalArg(0) int opcode, @OriginalArg(1) int size) {
        this.opcode = opcode;
        this.size = size;
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)I")
    public int getOpcode() {
        return this.opcode;
    }

    @OriginalMember(owner = "client!lga", name = "toString", descriptor = "()Ljava/lang/String;")
    @Override
    public String toString() {
        throw new IllegalStateException();
    }
}