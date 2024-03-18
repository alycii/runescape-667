import com.jagex.core.crypto.Whirlpool;
import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Js5Index {

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "[I")
    public int[] anIntArray595;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "[I")
    public int[] anIntArray596;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "[Lclient!eha;")
    public Class100[] aClass100Array1;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "[[I")
    public int[][] anIntArrayArray185;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public int anInt7366;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "[I")
    public int[] anIntArray597;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public int anInt7367;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "[I")
    public int[] anIntArray598;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public int anInt7368;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "[[B")
    public byte[][] aByteArrayArray24;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "[I")
    public int[] anIntArray599;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "[I")
    public int[] anIntArray600;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "Lclient!eha;")
    public Class100 aClass100_1;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "[[I")
    public int[][] anIntArrayArray186;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public final int crc;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "[B")
    public byte[] whirlpool;

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "([BI[B)V")
    public Js5Index(@OriginalArg(0) byte[] data, @OriginalArg(1) int expectedCrc, @OriginalArg(2) byte[] expectedWhirlpool) {
        this.crc = Packet.getcrc(data.length, data);

        if (expectedCrc != this.crc) {
            throw new RuntimeException("Invalid CRC - expected:" + expectedCrc + " got:" + crc);
        }

        if (expectedWhirlpool != null) {
            if (expectedWhirlpool.length != 64) {
                throw new RuntimeException("Invalid expectedwhirlpool - must be 64 bytes long");
            }

            this.whirlpool = Whirlpool.digest(data, data.length, 0);

            for (@Pc(45) int i = 0; i < 64; i++) {
                if (expectedWhirlpool[i] != this.whirlpool[i]) {
                    throw new RuntimeException("Invalid Whirlpool - expected:" + js5.whirlpoolToString(expectedWhirlpool) + " got:" + js5.whirlpoolToString(whirlpool));
                }
            }
        }

        this.method6568(data);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([BZ)V")
    public void method6568(@OriginalArg(0) byte[] arg0) {
        @Pc(12) Packet local12 = new Packet(Static590.method7744(arg0));
        @Pc(16) int local16 = local12.g1();
        if (local16 < 5 || local16 > 7) {
            throw new RuntimeException();
        }
        if (local16 >= 6) {
            this.anInt7366 = local12.g4();
        } else {
            this.anInt7366 = 0;
        }
        @Pc(54) int local54 = local12.g1();
        @Pc(63) boolean local63 = (local54 & 0x1) != 0;
        @Pc(75) boolean local75 = (local54 & 0x2) != 0;
        if (local16 >= 7) {
            this.anInt7367 = local12.gSmart2or4();
        } else {
            this.anInt7367 = local12.g2();
        }
        @Pc(101) int local101 = 0;
        @Pc(103) int local103 = -1;
        this.anIntArray600 = new int[this.anInt7367];
        @Pc(115) int local115;
        if (local16 >= 7) {
            for (local115 = 0; local115 < this.anInt7367; local115++) {
                this.anIntArray600[local115] = local101 += local12.gSmart2or4();
                if (this.anIntArray600[local115] > local103) {
                    local103 = this.anIntArray600[local115];
                }
            }
        } else {
            for (local115 = 0; local115 < this.anInt7367; local115++) {
                this.anIntArray600[local115] = local101 += local12.g2();
                if (local103 < this.anIntArray600[local115]) {
                    local103 = this.anIntArray600[local115];
                }
            }
        }
        this.anInt7368 = local103 + 1;
        this.anIntArray599 = new int[this.anInt7368];
        if (local75) {
            this.aByteArrayArray24 = new byte[this.anInt7368][];
        }
        this.anIntArray597 = new int[this.anInt7368];
        this.anIntArray595 = new int[this.anInt7368];
        this.anIntArray598 = new int[this.anInt7368];
        this.anIntArrayArray185 = new int[this.anInt7368][];
        @Pc(265) int local265;
        if (local63) {
            this.anIntArray596 = new int[this.anInt7368];
            for (local115 = 0; local115 < this.anInt7368; local115++) {
                this.anIntArray596[local115] = -1;
            }
            for (local265 = 0; local265 < this.anInt7367; local265++) {
                this.anIntArray596[this.anIntArray600[local265]] = local12.g4();
            }
            this.aClass100_1 = new Class100(this.anIntArray596);
        }
        for (local115 = 0; local115 < this.anInt7367; local115++) {
            this.anIntArray599[this.anIntArray600[local115]] = local12.g4();
        }
        if (local75) {
            for (local265 = 0; local265 < this.anInt7367; local265++) {
                @Pc(339) byte[] local339 = new byte[64];
                local12.gdata(0, 64, local339);
                this.aByteArrayArray24[this.anIntArray600[local265]] = local339;
            }
        }
        for (local265 = 0; local265 < this.anInt7367; local265++) {
            this.anIntArray597[this.anIntArray600[local265]] = local12.g4();
        }
        @Pc(423) int local423;
        @Pc(432) int local432;
        @Pc(439) int local439;
        @Pc(441) int local441;
        @Pc(449) int local449;
        @Pc(466) int local466;
        @Pc(398) int local398;
        if (local16 < 7) {
            for (local398 = 0; local398 < this.anInt7367; local398++) {
                this.anIntArray598[this.anIntArray600[local398]] = local12.g2();
            }
            for (local423 = 0; local423 < this.anInt7367; local423++) {
                local432 = this.anIntArray600[local423];
                local101 = 0;
                local439 = this.anIntArray598[local432];
                local441 = -1;
                this.anIntArrayArray185[local432] = new int[local439];
                for (local449 = 0; local449 < local439; local449++) {
                    local466 = this.anIntArrayArray185[local432][local449] = local101 += local12.g2();
                    if (local441 < local466) {
                        local441 = local466;
                    }
                }
                this.anIntArray595[local432] = local441 + 1;
                if (local439 == local441 + 1) {
                    this.anIntArrayArray185[local432] = null;
                }
            }
        } else {
            for (local398 = 0; local398 < this.anInt7367; local398++) {
                this.anIntArray598[this.anIntArray600[local398]] = local12.gSmart2or4();
            }
            for (local423 = 0; local423 < this.anInt7367; local423++) {
                local432 = this.anIntArray600[local423];
                local439 = this.anIntArray598[local432];
                local101 = 0;
                local441 = -1;
                this.anIntArrayArray185[local432] = new int[local439];
                for (local449 = 0; local449 < local439; local449++) {
                    local466 = this.anIntArrayArray185[local432][local449] = local101 += local12.gSmart2or4();
                    if (local466 > local441) {
                        local441 = local466;
                    }
                }
                this.anIntArray595[local432] = local441 + 1;
                if (local441 + 1 == local439) {
                    this.anIntArrayArray185[local432] = null;
                }
            }
        }
        if (!local63) {
            return;
        }
        this.aClass100Array1 = new Class100[local103 + 1];
        this.anIntArrayArray186 = new int[local103 + 1][];
        for (local398 = 0; local398 < this.anInt7367; local398++) {
            local423 = this.anIntArray600[local398];
            local432 = this.anIntArray598[local423];
            this.anIntArrayArray186[local423] = new int[this.anIntArray595[local423]];
            for (local439 = 0; local439 < this.anIntArray595[local423]; local439++) {
                this.anIntArrayArray186[local423][local439] = -1;
            }
            for (local441 = 0; local441 < local432; local441++) {
                if (this.anIntArrayArray185[local423] == null) {
                    local449 = local441;
                } else {
                    local449 = this.anIntArrayArray185[local423][local441];
                }
                this.anIntArrayArray186[local423][local449] = local12.g4();
            }
            this.aClass100Array1[local423] = new Class100(this.anIntArrayArray186[local423]);
        }
    }
}
