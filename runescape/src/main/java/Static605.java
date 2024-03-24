import com.jagex.core.util.JagException;
import com.jagex.core.util.TimeUtils;
import com.jagex.game.runetek6.config.bastype.BASType;
import com.jagex.game.runetek6.config.loctype.LocType;
import com.jagex.game.runetek6.config.loctype.LocTypeCustomisation;
import com.jagex.game.runetek6.config.loctype.LocTypeList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

    @OriginalMember(owner = "client!tba", name = "h", descriptor = "Lclient!lga;")
    public static final ServerProt A_SERVER_PROT___220 = new ServerProt(108, 12);

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(ILclient!pc;)V")
    public static void method7912(@OriginalArg(1) Class287 arg0) {
        @Pc(8) PacketBuffer local8 = ConnectionManager.GAME.buffer;
        @Pc(15) int local15;
        @Pc(21) int local21;
        @Pc(25) int local25;
        @Pc(34) int local34;
        @Pc(38) int local38;
        @Pc(42) int local42;
        @Pc(46) int local46;
        @Pc(52) int local52;
        if (arg0 == Static704.aClass287_17) {
            local15 = local8.g1();
            local21 = (local15 & 0x7) + Static270.anInt4354;
            local25 = WorldMap.areaBaseZ + local21;
            local34 = Static626.anInt9476 + (local15 >> 4 & 0x7);
            local38 = WorldMap.areaBaseX + local34;
            local42 = local8.g2();
            local46 = local8.g2();
            local52 = local8.g2();
            if (Static497.stacks != null) {
                @Pc(69) ObjStack local69 = (ObjStack) Static497.stacks.get(Static87.anInt1810 << 28 | local25 << 14 | local38);
                if (local69 != null) {
                    for (@Pc(77) ObjStackEntry local77 = (ObjStackEntry) local69.objs.first(); local77 != null; local77 = (ObjStackEntry) local69.objs.next()) {
                        if ((local42 & 0x7FFF) == local77.id && local77.count == local46) {
                            local77.unlink();
                            local77.count = local52;
                            Static2.sortAllObjs(Static87.anInt1810, local25, local38, local77);
                            break;
                        }
                    }
                    if (local34 >= 0 && local21 >= 0 && Static720.mapWidth > local34 && Static501.mapHeight > local21) {
                        Static468.method7641(Static87.anInt1810, local21, local34);
                    }
                }
            }
            return;
        }
        @Pc(212) int local212;
        @Pc(219) int local219;
        @Pc(290) int local290;
        @Pc(353) int local353;
        @Pc(217) int local217;
        @Pc(322) int local322;
        if (Static379.aClass287_12 == arg0) {
            local15 = local8.g1_alt1();
            local21 = local15 >> 2;
            local25 = Static310.anIntArray379[local21];
            local34 = local8.g1();
            local38 = local8.g1_alt3();
            local42 = Static626.anInt9476 + (local38 >> 4 & 0x7);
            local46 = (local38 & 0x7) + Static270.anInt4354;
            local52 = local8.ig2();
            if (local21 == 11) {
                local21 = 10;
            }
            @Pc(210) LocType local210 = LocTypeList.instance.list(local52);
            local212 = 0;
            if (local210.modelShapes != null) {
                local217 = -1;
                for (local219 = 0; local219 < local210.modelShapes.length; local219++) {
                    if (local210.modelShapes[local219] == local21) {
                        local217 = local219;
                        break;
                    }
                }
                local212 = local210.models[local217].length;
            }
            local217 = 0;
            if (local210.recol_d != null) {
                local217 = local210.recol_d.length;
            }
            local219 = 0;
            if (local210.retex_d != null) {
                local219 = local210.retex_d.length;
            }
            if ((local34 & 0x1) == 1) {
                Static296.method4361(null, Static87.anInt1810, local25, local42, local46);
            } else {
                @Pc(278) int[] local278 = null;
                if ((local34 & 0x2) == 2) {
                    local278 = new int[local212];
                    for (local290 = 0; local290 < local212; local290++) {
                        local278[local290] = local8.g2();
                    }
                }
                @Pc(310) short[] local310 = null;
                if ((local34 & 0x4) == 4) {
                    local310 = new short[local217];
                    for (local322 = 0; local322 < local217; local322++) {
                        local310[local322] = (short) local8.g2();
                    }
                }
                @Pc(343) short[] local343 = null;
                if ((local34 & 0x8) == 8) {
                    local343 = new short[local219];
                    for (local353 = 0; local353 < local219; local353++) {
                        local343[local353] = (short) local8.g2();
                    }
                }
                Static296.method4361(new LocTypeCustomisation(Static356.aLong177++, local278, local310, local343), Static87.anInt1810, local25, local42, local46);
            }
        } else if (arg0 == Static420.aClass287_13) {
            local15 = local8.g2_alt3();
            if (local15 == 65535) {
                local15 = -1;
            }
            local21 = local8.g1_alt1();
            local25 = Static626.anInt9476 + (local21 >> 4 & 0x7);
            local34 = (local21 & 0x7) + Static270.anInt4354;
            local38 = local8.g1();
            local42 = local38 >> 2;
            local46 = local38 & 0x3;
            local52 = Static310.anIntArray379[local42];
            Static198.method2953(Static87.anInt1810, local34, local42, local15, local25, local46, local52);
        } else if (arg0 == Static328.aClass287_10) {
            local15 = local8.g2();
            local21 = local8.g1();
            LocTypeList.instance.list(local15).loadedModels(local21);
        } else {
            @Pc(537) int local537;
            if (arg0 == Static481.aClass287_15) {
                local15 = local8.g1();
                local21 = Static626.anInt9476 + (local15 >> 4 & 0x7);
                local25 = (local15 & 0x7) + Static270.anInt4354;
                local34 = local8.g2();
                if (local34 == 65535) {
                    local34 = -1;
                }
                local38 = local8.g1();
                local42 = local38 >> 4 & 0xF;
                local46 = local38 & 0x7;
                local52 = local8.g1();
                local537 = local8.g1();
                local212 = local8.g2();
                if (local21 >= 0 && local25 >= 0 && local21 < Static720.mapWidth && Static501.mapHeight > local25) {
                    local217 = local42 + 1;
                    if (local21 - local217 <= PlayerEntity.self.pathX[0] && local217 + local21 >= PlayerEntity.self.pathX[0] && PlayerEntity.self.pathY[0] >= local25 - local217 && local217 + local25 >= PlayerEntity.self.pathY[0]) {
                        Static165.method2608(local537, local52, local34, local46, local212, local42 + (local25 << 8) + (Static87.anInt1810 << 24) + (local21 << 16));
                    }
                }
            } else if (arg0 == Static450.aClass287_14) {
                local15 = local8.g1();
                local21 = Static626.anInt9476 + (local15 >> 4 & 0x7);
                local25 = (local15 & 0x7) + Static270.anInt4354;
                local34 = local8.g1();
                local38 = local34 >> 2;
                local42 = local34 & 0x3;
                local46 = Static310.anIntArray379[local38];
                local52 = local8.g2_alt2();
                if (Static55.method1218(Static117.anInt2282) || local21 >= 0 && local25 >= 0 && Static720.mapWidth > local21 && Static501.mapHeight > local25) {
                    Static553.method7289(local42, local52, local46, local21, Static87.anInt1810, local38, local25);
                }
            } else {
                @Pc(812) int local812;
                if (arg0 == Static3.aClass287_1) {
                    local15 = local8.g1();
                    local21 = Static626.anInt9476 * 2 + (local15 >> 4 & 0xF);
                    local25 = (local15 & 0xF) + Static270.anInt4354 * 2;
                    local34 = local8.g1();
                    @Pc(764) boolean local764 = (local34 & 0x1) != 0;
                    @Pc(773) boolean local773 = (local34 & 0x2) != 0;
                    local46 = local773 ? local34 >> 2 : -1;
                    local52 = local8.g1b() + local21;
                    local537 = local25 + local8.g1b();
                    local212 = local8.g2s();
                    local217 = local8.g2s();
                    local219 = local8.g2();
                    local812 = local8.g1();
                    if (local773) {
                        local812 = (byte) local812;
                    } else {
                        local812 *= 4;
                    }
                    local290 = local8.g1() * 4;
                    local322 = local8.g2();
                    local353 = local8.g2();
                    @Pc(843) int local843 = local8.g1();
                    @Pc(847) int local847 = local8.g2();
                    if (local843 == 255) {
                        local843 = -1;
                    }
                    if (local21 >= 0 && local25 >= 0 && local21 < Static720.mapWidth * 2 && local25 < Static720.mapWidth * 2 && local52 >= 0 && local537 >= 0 && Static501.mapHeight * 2 > local52 && Static501.mapHeight * 2 > local537 && local219 != 65535) {
                        local52 = local52 * 256;
                        local847 <<= 0x2;
                        local25 = local25 * 256;
                        local537 *= 256;
                        local812 <<= 0x2;
                        local290 <<= 0x2;
                        local21 *= 256;
                        if (local212 != 0 && local46 != -1) {
                            @Pc(948) PathingEntity local948 = null;
                            @Pc(957) int local957;
                            if (local212 >= 0) {
                                local957 = local212 - 1;
                                @Pc(964) NPCEntityNode local964 = (NPCEntityNode) NPCList.local.get(local957);
                                if (local964 != null) {
                                    local948 = local964.npc;
                                }
                            } else {
                                local957 = -local212 - 1;
                                if (local957 == PlayerList.activePlayerSlot) {
                                    local948 = PlayerEntity.self;
                                } else {
                                    local948 = PlayerList.highResolutionPlayers[local957];
                                }
                            }
                            if (local948 != null) {
                                @Pc(991) BASType local991 = local948.method9317();
                                if (local991.wornTransformations != null && local991.wornTransformations[local46] != null) {
                                    local812 -= local991.wornTransformations[local46][1];
                                }
                                if (local991.graphicOffsets != null && local991.graphicOffsets[local46] != null) {
                                    local812 -= local991.graphicOffsets[local46][1];
                                }
                            }
                        }
                        @Pc(1053) Class8_Sub2_Sub1_Sub1 local1053 = new Class8_Sub2_Sub1_Sub1(local219, Static87.anInt1810, Static87.anInt1810, local21, local25, local812, local322 + TimeUtils.clock, TimeUtils.clock + local353, local843, local847, local212, local217, local290, local764, local46);
                        local1053.method813(Static102.method2025(Static87.anInt1810, -29754, local537, local52) - local290, local322 + TimeUtils.clock, local537, local52);
                        Static505.A_DEQUE___77.addLast(new DoublyLinkedNode_Sub2_Sub15(local1053));
                    }
                } else if (Static77.aClass287_5 == arg0) {
                    local15 = local8.g2_alt2();
                    local21 = local8.g1_alt1();
                    local25 = Static270.anInt4354 + (local21 & 0x7);
                    local34 = local25 + WorldMap.areaBaseZ;
                    local38 = Static626.anInt9476 + (local21 >> 4 & 0x7);
                    local42 = WorldMap.areaBaseX + local38;
                    local46 = local8.ig2();
                    local52 = local8.g2();
                    if (local15 != PlayerList.activePlayerSlot) {
                        @Pc(1151) boolean local1151 = local38 >= 0 && local25 >= 0 && Static720.mapWidth > local38 && local25 < Static501.mapHeight;
                        if (local1151 || Static55.method1218(Static117.anInt2282)) {
                            Static2.sortAllObjs(Static87.anInt1810, local34, local42, new ObjStackEntry(local46, local52));
                            if (local1151) {
                                Static468.method7641(Static87.anInt1810, local25, local38);
                            }
                        }
                    }
                } else if (Static84.aClass287_6 == arg0) {
                    local15 = local8.g1();
                    local21 = (local15 >> 4 & 0x7) + Static626.anInt9476;
                    local25 = (local15 & 0x7) + Static270.anInt4354;
                    local34 = local8.g2();
                    if (local34 == 65535) {
                        local34 = -1;
                    }
                    local38 = local8.g1();
                    local42 = local38 >> 4 & 0xF;
                    local46 = local38 & 0x7;
                    local52 = local8.g1();
                    local537 = local8.g1();
                    local212 = local8.g2();
                    if (local21 >= 0 && local25 >= 0 && Static720.mapWidth > local21 && Static501.mapHeight > local25) {
                        local217 = local42 + 1;
                        if (PlayerEntity.self.pathX[0] >= local21 - local217 && local217 + local21 >= PlayerEntity.self.pathX[0] && PlayerEntity.self.pathY[0] >= local25 - local217 && PlayerEntity.self.pathY[0] <= local25 + local217) {
                            Static179.method2770(local46, local52, local42 + (local25 << 8) + (Static87.anInt1810 << 24) + (local21 << 16), local212, local537, local34);
                        }
                    }
                } else if (arg0 == Static565.aClass287_8) {
                    local15 = local8.g2();
                    local21 = local8.g1();
                    local25 = (local21 & 0x7) + Static270.anInt4354;
                    local34 = local25 + WorldMap.areaBaseZ;
                    local38 = (local21 >> 4 & 0x7) + Static626.anInt9476;
                    local42 = local38 + WorldMap.areaBaseX;
                    @Pc(1389) ObjStack local1389 = (ObjStack) Static497.stacks.get(local34 << 14 | Static87.anInt1810 << 28 | local42);
                    if (local1389 != null) {
                        for (@Pc(1399) ObjStackEntry local1399 = (ObjStackEntry) local1389.objs.first(); local1399 != null; local1399 = (ObjStackEntry) local1389.objs.next()) {
                            if (local1399.id == (local15 & 0x7FFF)) {
                                local1399.unlink();
                                break;
                            }
                        }
                        if (local1389.objs.isEmpty()) {
                            local1389.unlink();
                        }
                        if (local38 >= 0 && local25 >= 0 && local38 < Static720.mapWidth && local25 < Static501.mapHeight) {
                            Static468.method7641(Static87.anInt1810, local25, local38);
                        }
                    }
                } else if (Static370.aClass287_11 == arg0) {
                    local8.g1();
                    local15 = local8.g1();
                    local21 = Static626.anInt9476 + (local15 >> 4 & 0x7);
                    local25 = (local15 & 0x7) + Static270.anInt4354;
                    local34 = local8.g2();
                    local38 = local8.g1();
                    local42 = local8.g3();
                    @Pc(1511) String local1511 = local8.gjstr();
                    Static540.method6539(Static87.anInt1810, local34, local1511, local42, local38, local21, local25);
                } else if (Static73.aClass287_18 == arg0) {
                    local15 = local8.g1();
                    @Pc(1540) boolean local1540 = (local15 & 0x80) != 0;
                    local25 = Static626.anInt9476 + (local15 >> 3 & 0x7);
                    local34 = (local15 & 0x7) + Static270.anInt4354;
                    local38 = local25 + local8.g1b();
                    local42 = local34 + local8.g1b();
                    local46 = local8.g2s();
                    local52 = local8.g2();
                    local537 = local8.g1() * 4;
                    local212 = local8.g1() * 4;
                    local217 = local8.g2();
                    local219 = local8.g2();
                    local812 = local8.g1();
                    local290 = local8.g2();
                    if (local812 == 255) {
                        local812 = -1;
                    }
                    if (local25 >= 0 && local34 >= 0 && Static720.mapWidth > local25 && local34 < Static501.mapHeight && local38 >= 0 && local42 >= 0 && Static720.mapWidth > local38 && local42 < Static501.mapHeight && local52 != 65535) {
                        local42 = local42 * 512 + 256;
                        local290 <<= 0x2;
                        local537 <<= 0x2;
                        local25 = local25 * 512 + 256;
                        local212 <<= 0x2;
                        local38 = local38 * 512 + 256;
                        local34 = local34 * 512 + 256;
                        @Pc(1728) Class8_Sub2_Sub1_Sub1 local1728 = new Class8_Sub2_Sub1_Sub1(local52, Static87.anInt1810, Static87.anInt1810, local25, local34, local537, local217 + TimeUtils.clock, local219 + TimeUtils.clock, local812, local290, 0, local46, local212, local1540, -1);
                        local1728.method813(Static102.method2025(Static87.anInt1810, -29754, local42, local38) - local212, TimeUtils.clock + local217, local42, local38);
                        Static505.A_DEQUE___77.addLast(new DoublyLinkedNode_Sub2_Sub15(local1728));
                    }
                } else if (Static210.aClass287_9 == arg0) {
                    local15 = local8.g1_alt2();
                    local21 = Static626.anInt9476 + (local15 >> 4 & 0x7);
                    local25 = (local15 & 0x7) + Static270.anInt4354;
                    local34 = local8.g1();
                    local38 = local34 >> 2;
                    local42 = local34 & 0x3;
                    local46 = Static310.anIntArray379[local38];
                    if (Static55.method1218(Static117.anInt2282) || local21 >= 0 && local25 >= 0 && Static720.mapWidth > local21 && local25 < Static501.mapHeight) {
                        Static553.method7289(local42, -1, local46, local21, Static87.anInt1810, local38, local25);
                    }
                } else if (Static18.aClass287_2 == arg0) {
                    local15 = local8.g1_alt2();
                    local21 = Static270.anInt4354 + (local15 & 0x7);
                    local25 = local21 + WorldMap.areaBaseZ;
                    local34 = (local15 >> 4 & 0x7) + Static626.anInt9476;
                    local38 = WorldMap.areaBaseX + local34;
                    local42 = local8.g2_alt2();
                    local46 = local8.g2();
                    @Pc(1886) boolean local1886 = local34 >= 0 && local21 >= 0 && local34 < Static720.mapWidth && local21 < Static501.mapHeight;
                    if (local1886 || Static55.method1218(Static117.anInt2282)) {
                        Static2.sortAllObjs(Static87.anInt1810, local25, local38, new ObjStackEntry(local42, local46));
                        if (local1886) {
                            Static468.method7641(Static87.anInt1810, local21, local34);
                        }
                    }
                } else if (arg0 == Static668.aClass287_16) {
                    local15 = local8.g1();
                    local21 = Static626.anInt9476 + (local15 >> 4 & 0x7);
                    local25 = (local15 & 0x7) + Static270.anInt4354;
                    local34 = local8.g2();
                    if (local34 == 65535) {
                        local34 = -1;
                    }
                    local38 = local8.g1();
                    local42 = local8.g2();
                    local46 = local8.g1();
                    if (local21 >= 0 && local25 >= 0 && local21 < Static720.mapWidth && Static501.mapHeight > local25) {
                        if (local34 == -1) {
                            @Pc(2004) DoublyLinkedNode_Sub2_Sub20 local2004 = (DoublyLinkedNode_Sub2_Sub20) Static346.A_HASH_TABLE___29.get(local21 << 16 | local25);
                            if (local2004 != null) {
                                local2004.aClass8_Sub2_Sub1_Sub5_1.method6600();
                                local2004.unlink();
                                return;
                            }
                        } else {
                            local52 = local21 * 512 + 256;
                            local537 = local25 * 512 + 256;
                            local212 = Static87.anInt1810;
                            if (local212 < 3 && Static441.method5968(local25, local21)) {
                                local212++;
                            }
                            @Pc(2065) Class8_Sub2_Sub1_Sub5 local2065 = new Class8_Sub2_Sub1_Sub5(local34, local42, Static87.anInt1810, local212, local52, Static102.method2025(Static87.anInt1810, -29754, local537, local52) - local38, local537, local21, local21, local25, local25, local46, false);
                            Static346.A_HASH_TABLE___29.put(local21 << 16 | local25, new DoublyLinkedNode_Sub2_Sub20(local2065));
                        }
                    }
                } else {
                    JagException.sendTrace(null, "T3 - " + arg0);
                    Login.logout(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(B)V")
    public static void method7914() {
        Minimap.flagX = -1;
        Minimap.toggle = 0;
        Minimap.flagY = -1;
    }
}
