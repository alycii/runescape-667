import com.jagex.core.util.TimeUtils;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

    @OriginalMember(owner = "client!qka", name = "f", descriptor = "Lclient!lja;")
    public static ConnectionInfo aConnectionInfo_3;

    @OriginalMember(owner = "client!qka", name = "i", descriptor = "[Lclient!nba;")
    public static final Class254[] aClass254Array1 = new Class254[8];

    @OriginalMember(owner = "client!qka", name = "a", descriptor = "(IBIII)V")
    public static void method7081(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
        Static232.anInt3829 = arg1;
        Static240.anInt3955 = arg2;
        Static275.anInt4424 = arg0;
        Static168.anInt2842 = arg3;
    }

    @OriginalMember(owner = "client!qka", name = "c", descriptor = "(I)V")
    public static void method7083() {
        for (@Pc(15) DoublyLinkedNode_Sub2_Sub15 local15 = (DoublyLinkedNode_Sub2_Sub15) Static505.A_DEQUE___77.first(); local15 != null; local15 = (DoublyLinkedNode_Sub2_Sub15) Static505.A_DEQUE___77.next()) {
            @Pc(20) Class8_Sub2_Sub1_Sub1 local20 = local15.aClass8_Sub2_Sub1_Sub1_1;
            if (TimeUtils.clock > local20.anInt697) {
                local15.unlink();
                local20.method815();
            } else if (TimeUtils.clock >= local20.anInt722) {
                local20.method816();
                if (local20.anInt711 > 0) {
                    if (CutsceneManager.state == 3) {
                        @Pc(61) Class8_Sub2_Sub1_Sub2 local61 = Static219.aClass236Array1[local20.anInt711 - 1].method5363();
                        if (local61 != null && local61.anInt10690 >= 0 && local61.anInt10690 < Static720.mapWidth * 512 && local61.anInt10694 >= 0 && local61.anInt10694 < Static501.mapHeight * 512) {
                            local20.method813(Static102.method2025(local20.level, -29754, local61.anInt10694, local61.anInt10690) - local20.lb, TimeUtils.clock, local61.anInt10694, local61.anInt10690);
                        }
                    } else {
                        @Pc(130) Node_Sub45 local130 = (Node_Sub45) Static18.A_HASH_TABLE___2.get((long) (local20.anInt711 - 1));
                        if (local130 != null) {
                            @Pc(135) NPCEntity local135 = local130.aClass8_Sub2_Sub1_Sub2_Sub2_2;
                            if (local135.anInt10690 >= 0 && local135.anInt10690 < Static720.mapWidth * 512 && local135.anInt10694 >= 0 && local135.anInt10694 < Static501.mapHeight * 512) {
                                local20.method813(Static102.method2025(local20.level, -29754, local135.anInt10694, local135.anInt10690) - local20.lb, TimeUtils.clock, local135.anInt10694, local135.anInt10690);
                            }
                        }
                    }
                }
                if (local20.anInt711 < 0) {
                    @Pc(193) int local193 = -local20.anInt711 - 1;
                    @Pc(198) PlayerEntity local198;
                    if (local193 == PlayerList.activePlayerSlot) {
                        local198 = PlayerEntity.self;
                    } else {
                        local198 = PlayerList.highResolutionPlayers[local193];
                    }
                    if (local198 != null && local198.anInt10690 >= 0 && Static720.mapWidth * 512 > local198.anInt10690 && local198.anInt10694 >= 0 && Static501.mapHeight * 512 > local198.anInt10694) {
                        local20.method813(Static102.method2025(local20.level, -29754, local198.anInt10694, local198.anInt10690) - local20.lb, TimeUtils.clock, local198.anInt10694, local198.anInt10690);
                    }
                }
                local20.method819(Static35.currentTick);
                Static102.method2026(local20, true);
            }
        }
    }

    @OriginalMember(owner = "client!qka", name = "a", descriptor = "(III)V")
    public static void method7084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(23) boolean local23 = Static334.activeTiles[0][arg1][arg2] != null && Static334.activeTiles[0][arg1][arg2].aClass291_1 != null;
        for (@Pc(25) int local25 = arg0; local25 >= 0; local25--) {
            if (Static334.activeTiles[local25][arg1][arg2] == null) {
                @Pc(47) Class291 local47 = Static334.activeTiles[local25][arg1][arg2] = new Class291(local25);
                if (local23) {
                    local47.aByte116++;
                }
            }
        }
    }
}
