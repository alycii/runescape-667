import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bka")
public final class Class45 {

    @OriginalMember(owner = "client!bka", name = "d", descriptor = "Lclient!dla;")
    public final WeightedCache aWeightedCache_17 = new WeightedCache(64);

    @OriginalMember(owner = "client!bka", name = "h", descriptor = "Lclient!sb;")
    public final Class330 aClass330_9;

    @OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
    public Class45(@OriginalArg(0) Class377 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2) {
        this.aClass330_9 = arg2;
        if (this.aClass330_9 != null) {
            this.aClass330_9.method7608(35);
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(B)V")
    public void method1093() {
        @Pc(6) WeightedCache local6 = this.aWeightedCache_17;
        synchronized (this.aWeightedCache_17) {
            this.aWeightedCache_17.method2151();
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(IB)Lclient!la;")
    public Class218 method1094(@OriginalArg(0) int arg0) {
        @Pc(6) WeightedCache local6 = this.aWeightedCache_17;
        @Pc(16) Class218 local16;
        synchronized (this.aWeightedCache_17) {
            local16 = (Class218) this.aWeightedCache_17.method2156((long) arg0);
        }
        if (local16 != null) {
            return local16;
        }
        @Pc(30) Class330 local30 = this.aClass330_9;
        @Pc(39) byte[] local39;
        synchronized (this.aClass330_9) {
            local39 = this.aClass330_9.method7595(arg0, 35);
        }
        local16 = new Class218();
        if (local39 != null) {
            local16.method5127(new Packet(local39));
        }
        local16.method5123();
        @Pc(66) WeightedCache local66 = this.aWeightedCache_17;
        synchronized (this.aWeightedCache_17) {
            this.aWeightedCache_17.put(local16, (long) arg0);
            return local16;
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(II)V")
    public void method1096() {
        @Pc(11) WeightedCache local11 = this.aWeightedCache_17;
        synchronized (this.aWeightedCache_17) {
            this.aWeightedCache_17.method2147(5);
        }
    }

    @OriginalMember(owner = "client!bka", name = "b", descriptor = "(I)V")
    public void method1098() {
        @Pc(2) WeightedCache local2 = this.aWeightedCache_17;
        synchronized (this.aWeightedCache_17) {
            this.aWeightedCache_17.reset();
        }
    }
}
