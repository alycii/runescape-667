import com.jagex.game.runetek6.config.iftype.ServerActiveProperties;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

    @OriginalMember(owner = "client!br", name = "B", descriptor = "I")
    public static int anInt1125;

    @OriginalMember(owner = "client!br", name = "z", descriptor = "I")
    public static int anInt1124 = 0;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IILclient!pg;I)V")
    public static void method1217(@OriginalArg(0) int arg0, @OriginalArg(2) DoublyLinkedNode_Sub2_Sub16 arg1, @OriginalArg(3) int arg2) {
        if (arg1 == null || arg1 == Static693.A_DEQUE___79.sentinel) {
            return;
        }
        @Pc(16) int local16 = arg1.anInt7316;
        @Pc(19) int local19 = arg1.anInt7313;
        @Pc(22) int local22 = arg1.anInt7314;
        @Pc(26) int local26 = (int) arg1.aLong233;
        if (local22 >= 2000) {
            local22 -= 2000;
        }
        @Pc(35) long local35 = arg1.aLong233;
        if (local22 == 44) {
            @Pc(44) PlayerEntity local44 = PlayerList.highResolutionPlayers[local26];
            if (local44 != null) {
                Static481.anInt7215 = 0;
                Static676.anInt10206 = arg2;
                Static616.anInt9417 = 2;
                Static305.anInt4882 = arg0;
                @Pc(64) ClientMessage local64 = Static293.method4335(Static664.aClass345_115, ConnectionManager.GAME.cipher);
                local64.buffer.p2_alt1(local26);
                local64.buffer.p4_alt1(Static450.anInt6819);
                local64.buffer.p2(Static162.anInt2799);
                local64.buffer.p1_alt3(KeyMonitor.instance.isPressed(82) ? 1 : 0);
                local64.buffer.p2_alt3(Static77.anInt1614);
                ConnectionManager.GAME.send(local64);
                Static147.method2419(0, local44.pathY[0], local44.boundSize((byte) 99), true, local44.pathX[0], 0, -2, local44.boundSize((byte) 110));
            }
        }
        @Pc(147) ClientMessage local147;
        if (local22 == 4) {
            Static616.anInt9417 = 2;
            Static305.anInt4882 = arg0;
            Static481.anInt7215 = 0;
            Static676.anInt10206 = arg2;
            local147 = Static293.method4335(Static664.aClass345_115, ConnectionManager.GAME.cipher);
            local147.buffer.p2_alt1(PlayerEntity.self.anInt10740);
            local147.buffer.p4_alt1(Static450.anInt6819);
            local147.buffer.p2(Static162.anInt2799);
            local147.buffer.p1_alt3(KeyMonitor.instance.isPressed(82) ? 1 : 0);
            local147.buffer.p2_alt3(Static77.anInt1614);
            ConnectionManager.GAME.send(local147);
        }
        if (local22 == 12) {
            @Pc(197) Component local197 = InterfaceList.getComponent(local16, local19);
            if (local197 != null) {
                InterfaceManager.endTargetMode();
                @Pc(206) ServerActiveProperties local206 = InterfaceManager.serverActiveProperties(local197);
                InterfaceManager.enterTargetMode(local206.getTargetMask(), local197, local206.targetParam);
                InterfaceManager.targetVerb = InterfaceManager.getComponentTargetVerb(local197);
                InterfaceManager.targetedVerb = local197.opBase + "<col=ffffff>";
                if (InterfaceManager.targetVerb == null) {
                    InterfaceManager.targetVerb = "Null";
                }
            }
            return;
        }
        if (local22 == 58) {
            if (Static608.staffModLevel > 0 && KeyMonitor.instance.isPressed(82) && KeyMonitor.instance.isPressed(81)) {
                Static624.teleport(PlayerEntity.self.level, Static116.areaBaseY + local19, Static691.areaBaseX + local16);
            } else {
                local147 = Static32.method878(local16, local19, local26);
                if (local26 == 1) {
                    local147.buffer.p1(-1);
                    local147.buffer.p1(-1);
                    local147.buffer.p2((int) Static171.aFloat64);
                    local147.buffer.p1(57);
                    local147.buffer.p1(Static29.anInt723);
                    local147.buffer.p1(Static660.anInt9835);
                    local147.buffer.p1(89);
                    local147.buffer.p2(PlayerEntity.self.anInt10690);
                    local147.buffer.p2(PlayerEntity.self.anInt10694);
                    local147.buffer.p1(63);
                } else {
                    Static305.anInt4882 = arg0;
                    Static616.anInt9417 = 1;
                    Static481.anInt7215 = 0;
                    Static676.anInt10206 = arg2;
                }
                ConnectionManager.GAME.send(local147);
                Static147.method2419(0, local19, 1, true, local16, 0, -4, 1);
            }
        }
        if (local22 == 10 && InterfaceManager.dialog == null) {
            Static479.method6461(local16, local19);
            InterfaceManager.dialog = InterfaceList.getComponent(local16, local19);
            InterfaceManager.redraw(InterfaceManager.dialog);
        }
        @Pc(389) Class345 local389 = null;
        if (local22 == 2) {
            local389 = Static424.aClass345_79;
        } else if (local22 == 22) {
            local389 = Static53.aClass345_7;
        } else if (local22 == 52) {
            local389 = Static412.aClass345_74;
        } else if (local22 == 30) {
            local389 = Static587.aClass345_104;
        } else if (local22 == 53) {
            local389 = Static675.aClass345_118;
        } else if (local22 == 9) {
            local389 = Static173.aClass345_30;
        } else if (local22 == 51) {
            local389 = Static273.aClass345_55;
        } else if (local22 == 15) {
            local389 = Static494.aClass345_89;
        } else if (local22 == 48) {
            local389 = Static571.aClass345_103;
        } else if (local22 == 16) {
            local389 = Static470.aClass345_88;
        }
        @Pc(494) ClientMessage local494;
        if (local389 != null) {
            @Pc(474) PlayerEntity local474 = PlayerList.highResolutionPlayers[local26];
            if (local474 != null) {
                Static481.anInt7215 = 0;
                Static305.anInt4882 = arg0;
                Static616.anInt9417 = 2;
                Static676.anInt10206 = arg2;
                local494 = Static293.method4335(local389, ConnectionManager.GAME.cipher);
                local494.buffer.p1(KeyMonitor.instance.isPressed(82) ? 1 : 0);
                local494.buffer.p2(local26);
                ConnectionManager.GAME.send(local494);
                Static147.method2419(0, local474.pathY[0], local474.boundSize((byte) 125), true, local474.pathX[0], 0, -2, local474.boundSize((byte) 60));
            }
        }
        @Pc(548) Class345 local548 = null;
        if (local22 == 25) {
            local548 = Static235.aClass345_48;
        } else if (local22 == 5) {
            local548 = Static405.aClass345_73;
        } else if (local22 == 50) {
            local548 = Static631.aClass345_120;
        } else if (local22 == 6) {
            local548 = Static555.aClass345_99;
        } else if (local22 == 45) {
            local548 = Static87.aClass345_17;
        } else if (local22 == 1007) {
            local548 = Static214.aClass345_39;
        }
        if (local548 != null) {
            Static305.anInt4882 = arg0;
            Static481.anInt7215 = 0;
            Static616.anInt9417 = 2;
            Static676.anInt10206 = arg2;
            local494 = Static293.method4335(local548, ConnectionManager.GAME.cipher);
            local494.buffer.p2_alt2(local26);
            local494.buffer.p1(KeyMonitor.instance.isPressed(82) ? 1 : 0);
            local494.buffer.p2(local19 + Static116.areaBaseY);
            local494.buffer.p2_alt1(Static691.areaBaseX + local16);
            ConnectionManager.GAME.send(local494);
            Static414.method5697(local19, local16);
        }
        if (local22 == 11) {
            if (Static608.staffModLevel > 0 && KeyMonitor.instance.isPressed(82) && KeyMonitor.instance.isPressed(81)) {
                Static624.teleport(PlayerEntity.self.level, Static116.areaBaseY + local19, Static691.areaBaseX + local16);
            } else {
                Static481.anInt7215 = 0;
                Static676.anInt10206 = arg2;
                Static616.anInt9417 = 1;
                Static305.anInt4882 = arg0;
                local494 = Static293.method4335(Static512.aClass345_96, ConnectionManager.GAME.cipher);
                local494.buffer.p2_alt3(local19 + Static116.areaBaseY);
                local494.buffer.p2_alt1(Static691.areaBaseX + local16);
                ConnectionManager.GAME.send(local494);
            }
        }
        if (local22 == 18) {
            @Pc(741) Component local741 = InterfaceList.getComponent(local16, local19);
            if (local741 != null) {
                Static312.method4542(local741);
            }
        }
        @Pc(750) Class345 local750 = null;
        if (local22 == 49) {
            local750 = Static297.aClass345_59;
        } else if (local22 == 59) {
            local750 = Static546.aClass345_97;
        } else if (local22 == 47) {
            local750 = Static131.aClass345_25;
        } else if (local22 == 57) {
            local750 = Static305.aClass345_60;
        } else if (local22 == 3) {
            local750 = Static420.aClass345_78;
        } else if (local22 == 1011) {
            local750 = Static591.aClass345_107;
        }
        if (local750 != null) {
            @Pc(806) Node_Sub45 local806 = (Node_Sub45) Static18.A_HASH_TABLE___2.get((long) local26);
            if (local806 != null) {
                Static676.anInt10206 = arg2;
                @Pc(813) NPCEntity local813 = local806.aClass8_Sub2_Sub1_Sub2_Sub2_2;
                Static616.anInt9417 = 2;
                Static305.anInt4882 = arg0;
                Static481.anInt7215 = 0;
                @Pc(831) ClientMessage local831 = Static293.method4335(local750, ConnectionManager.GAME.cipher);
                local831.buffer.p1_alt1(KeyMonitor.instance.isPressed(82) ? 1 : 0);
                local831.buffer.p2_alt2(local26);
                ConnectionManager.GAME.send(local831);
                Static147.method2419(0, local813.pathY[0], local813.boundSize((byte) 76), true, local813.pathX[0], 0, -2, local813.boundSize((byte) 103));
            }
        }
        @Pc(878) Class345 local878 = null;
        if (local22 == 19) {
            local878 = Static57.aClass345_10;
        } else if (local22 == 13) {
            local878 = Static180.aClass345_33;
        } else if (local22 == 46) {
            local878 = Static402.aClass345_72;
        } else if (local22 == 8) {
            local878 = Static185.aClass345_35;
        } else if (local22 == 1010) {
            local878 = Static236.aClass345_50;
        } else if (local22 == 1008) {
            local878 = Static342.aClass345_61;
        }
        @Pc(949) ClientMessage local949;
        if (local878 != null) {
            Static305.anInt4882 = arg0;
            Static616.anInt9417 = 2;
            Static481.anInt7215 = 0;
            Static676.anInt10206 = arg2;
            local949 = Static293.method4335(local878, ConnectionManager.GAME.cipher);
            local949.buffer.p1_alt1(KeyMonitor.instance.isPressed(82) ? 1 : 0);
            local949.buffer.p2_alt2(Static691.areaBaseX + local16);
            local949.buffer.p2_alt3((int) (local35 >>> 32) & Integer.MAX_VALUE);
            local949.buffer.p2_alt1(local19 + Static116.areaBaseY);
            ConnectionManager.GAME.send(local949);
            Static38.method1001(local16, local35, local19);
        }
        if (local22 == 1003 || local22 == 1001 || local22 == 1006 || local22 == 1009 || local22 == 1004) {
            Static578.method7624(local16, local26, local22);
        }
        if (local22 == 21) {
            Static676.anInt10206 = arg2;
            Static616.anInt9417 = 1;
            Static305.anInt4882 = arg0;
            Static481.anInt7215 = 0;
            local949 = Static293.method4335(Static181.aClass345_34, ConnectionManager.GAME.cipher);
            local949.buffer.p2_alt2(Static691.areaBaseX + local16);
            local949.buffer.p2_alt1(Static162.anInt2799);
            local949.buffer.p4_alt2(Static450.anInt6819);
            local949.buffer.p2_alt2(Static116.areaBaseY + local19);
            local949.buffer.p2(Static77.anInt1614);
            ConnectionManager.GAME.send(local949);
            Static147.method2419(0, local19, 1, true, local16, 0, -4, 1);
        }
        if (local22 == 17) {
            Static616.anInt9417 = 2;
            Static481.anInt7215 = 0;
            Static305.anInt4882 = arg0;
            Static676.anInt10206 = arg2;
            local949 = Static293.method4335(Static175.aClass345_31, ConnectionManager.GAME.cipher);
            local949.buffer.p2(local16 + Static691.areaBaseX);
            local949.buffer.p2(Static116.areaBaseY + local19);
            local949.buffer.p2_alt3(Static162.anInt2799);
            local949.buffer.p4_alt3(Static450.anInt6819);
            local949.buffer.p2_alt1(Static77.anInt1614);
            local949.buffer.p1(KeyMonitor.instance.isPressed(82) ? 1 : 0);
            local949.buffer.p2_alt1(local26);
            ConnectionManager.GAME.send(local949);
            Static414.method5697(local19, local16);
        }
        if (local22 == 23) {
            @Pc(1200) Node_Sub45 local1200 = (Node_Sub45) Static18.A_HASH_TABLE___2.get((long) local26);
            if (local1200 != null) {
                @Pc(1205) NPCEntity local1205 = local1200.aClass8_Sub2_Sub1_Sub2_Sub2_2;
                Static481.anInt7215 = 0;
                Static616.anInt9417 = 2;
                Static676.anInt10206 = arg2;
                Static305.anInt4882 = arg0;
                @Pc(1223) ClientMessage local1223 = Static293.method4335(Static503.aClass345_94, ConnectionManager.GAME.cipher);
                local1223.buffer.p2_alt3(Static77.anInt1614);
                local1223.buffer.p2_alt1(Static162.anInt2799);
                local1223.buffer.p2_alt1(local26);
                local1223.buffer.p4_alt3(Static450.anInt6819);
                local1223.buffer.p1(KeyMonitor.instance.isPressed(82) ? 1 : 0);
                ConnectionManager.GAME.send(local1223);
                Static147.method2419(0, local1205.pathY[0], local1205.boundSize((byte) 44), true, local1205.pathX[0], 0, -2, local1205.boundSize((byte) 50));
            }
        }
        if (local22 == 20 || local22 == 1002) {
            InterfaceManager.ifButtonXSend(local19, local16, arg1.aString86, local26);
        }
        if (local22 == 60) {
            Static676.anInt10206 = arg2;
            Static481.anInt7215 = 0;
            Static305.anInt4882 = arg0;
            Static616.anInt9417 = 2;
            local949 = Static293.method4335(Static419.aClass345_77, ConnectionManager.GAME.cipher);
            local949.buffer.p1_alt2(KeyMonitor.instance.isPressed(82) ? 1 : 0);
            local949.buffer.p2_alt1(Static116.areaBaseY + local19);
            local949.buffer.p2_alt1(Static77.anInt1614);
            local949.buffer.p4_alt1(Static450.anInt6819);
            local949.buffer.p2_alt3(Static162.anInt2799);
            local949.buffer.p2_alt1(local16 + Static691.areaBaseX);
            local949.buffer.p2_alt2(Integer.MAX_VALUE & (int) (local35 >>> 32));
            ConnectionManager.GAME.send(local949);
            Static38.method1001(local16, local35, local19);
        }
        if (InterfaceManager.isTargeting) {
            InterfaceManager.endTargetMode();
        }
        if (Static67.aComponent_10 != null && Static499.anInt7501 == 0) {
            InterfaceManager.redraw(Static67.aComponent_10);
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(II)Z")
    public static boolean method1218(@OriginalArg(0) int arg0) {
        return arg0 == 3 || arg0 == 4;
    }
}
