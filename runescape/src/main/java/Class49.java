import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class49 {

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "Lclient!dla;")
    public final WeightedCache aWeightedCache_21 = new WeightedCache(64);

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "Lclient!sb;")
    public final Class330 aClass330_10;

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
    public Class49(@OriginalArg(0) Class377 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2) {
        this.aClass330_10 = arg2;
        if (this.aClass330_10 != null) {
            this.aClass330_10.method7608(11);
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
    public void method1156() {
        @Pc(2) WeightedCache local2 = this.aWeightedCache_21;
        synchronized (this.aWeightedCache_21) {
            this.aWeightedCache_21.method2151();
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)V")
    public void method1158() {
        @Pc(6) WeightedCache local6 = this.aWeightedCache_21;
        synchronized (this.aWeightedCache_21) {
            this.aWeightedCache_21.method2147(5);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
    public void method1160() {
        @Pc(2) WeightedCache local2 = this.aWeightedCache_21;
        synchronized (this.aWeightedCache_21) {
            this.aWeightedCache_21.reset();
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Lclient!po;")
    public Class296 method1161(@OriginalArg(0) int arg0) {
        @Pc(13) WeightedCache local13 = this.aWeightedCache_21;
        @Pc(23) Class296 local23;
        synchronized (this.aWeightedCache_21) {
            local23 = (Class296) this.aWeightedCache_21.method2156((long) arg0);
        }
        if (local23 != null) {
            return local23;
        }
        @Pc(37) Class330 local37 = this.aClass330_10;
        @Pc(46) byte[] local46;
        synchronized (this.aClass330_10) {
            local46 = this.aClass330_10.method7595(arg0, 11);
        }
        local23 = new Class296();
        if (local46 != null) {
            local23.method6673(new Packet(local46));
        }
        @Pc(70) WeightedCache local70 = this.aWeightedCache_21;
        synchronized (this.aWeightedCache_21) {
            this.aWeightedCache_21.put(local23, (long) arg0);
            return local23;
        }
    }
}
