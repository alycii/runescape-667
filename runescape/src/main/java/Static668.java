import com.jagex.core.stringtools.general.StringTools;
import com.jagex.core.util.SystemTimer;
import com.jagex.game.runetek6.config.vartype.bit.VarBitTypeListClient;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public final class Static668 {

    @OriginalMember(owner = "client!vca", name = "r", descriptor = "Lclient!lja;")
    public static ConnectionInfo aConnectionInfo_5;

    @OriginalMember(owner = "client!vca", name = "i", descriptor = "Lclient!pc;")
    public static final Class287 aClass287_16 = new Class287(12, 7);

    @OriginalMember(owner = "client!vca", name = "x", descriptor = "[[I")
    public static final int[][] anIntArrayArray244 = new int[128][128];

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZI)V")
    public static void method8700(@OriginalArg(0) boolean arg0) {
        if (arg0 && WorldMap.area != null) {
            Static357.anInt6504 = WorldMap.area.id;
        } else {
            Static357.anInt6504 = -1;
        }
        WorldMap.aDeque_54 = null;
        WorldMap.component = null;
        WorldMap.area = null;
        WorldMap.loadingPercent = 0;
        WorldMap.method5070();
        WorldMap.elements.clear();
        Static359.aClass327_3 = null;
        Static484.aClass327_6 = null;
        WorldMap.staticElements = null;
        Static651.aClass327_8 = null;
        Static180.anInt3001 = -1;
        Static13.aSprite_4 = null;
        Static142.aClass327_1 = null;
        Static390.aClass327_5 = null;
        Static559.aClass327_7 = null;
        Static364.aClass327_4 = null;
        Static275.aClass327_2 = null;
        WorldMap.anInt3181 = -1;
        if (WorldMap.mapElementTypeList != null) {
            WorldMap.mapElementTypeList.method5586();
            WorldMap.mapElementTypeList.setCaches(128, 64);
        }
        if (WorldMap.msiTypeList != null) {
            WorldMap.msiTypeList.setCache(64, 64);
        }
        if (WorldMap.locTypeList != null) {
            WorldMap.locTypeList.setRecentUse(64);
        }
        VarBitTypeListClient.instance.cacheReset(64);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)Lclient!gw;")
    public static ServerConnection method8701() {
        return MainLogicManager.isAtLobbyScreen(MainLogicManager.step) ? ConnectionManager.LOBBY : ConnectionManager.GAME;
    }

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "(I)V")
    public static void method8703() {
        if (Static460.anInt8472 < 102) {
            Static460.anInt8472 += 6;
        }
        @Pc(26) int local26;
        if (Static523.anInt3885 != -1 && Static305.aLong157 < SystemTimer.safetime()) {
            for (local26 = Static523.anInt3885; local26 < Static144.aStringArray7.length; local26++) {
                if (Static144.aStringArray7[local26].startsWith("pause")) {
                    @Pc(40) int local40 = 5;
                    try {
                        local40 = Integer.parseInt(Static144.aStringArray7[local26].substring(6));
                    } catch (@Pc(49) Exception local49) {
                    }
                    Static79.method1579("Pausing for " + local40 + " seconds...");
                    Static523.anInt3885 = local26 + 1;
                    Static305.aLong157 = (long) (local40 * 1000) + SystemTimer.safetime();
                    return;
                }
                Static110.aString19 = Static144.aStringArray7[local26];
                Static270.method3920(false);
            }
            Static523.anInt3885 = -1;
        }
        if (Static611.mouseWheelRotation != 0) {
            Static213.anInt3471 -= Static611.mouseWheelRotation * 5;
            if (Static213.anInt3471 >= Static512.anInt7664) {
                Static213.anInt3471 = Static512.anInt7664 - 1;
            }
            Static611.mouseWheelRotation = 0;
            if (Static213.anInt3471 < 0) {
                Static213.anInt3471 = 0;
            }
        }
        for (local26 = 0; local26 < Static671.anInt10026; local26++) {
            @Pc(147) Interface27 local147 = Static194.anInterface27Array1[local26];
            @Pc(151) int local151 = local147.method2664();
            @Pc(155) char local155 = local147.method2666();
            @Pc(159) int local159 = local147.method2667();
            if (local151 == 84) {
                Static270.method3920(false);
            }
            if (local151 == 80) {
                Static270.method3920(true);
            } else if (local151 == 66 && (local159 & 0x4) != 0) {
                if (Static175.aClipboard1 != null) {
                    @Pc(467) String local467 = "";
                    for (@Pc(472) int local472 = Static393.aStringArray32.length - 1; local472 >= 0; local472--) {
                        if (Static393.aStringArray32[local472] != null && Static393.aStringArray32[local472].length() > 0) {
                            local467 = local467 + Static393.aStringArray32[local472] + '\n';
                        }
                    }
                    Static175.aClipboard1.setContents(new StringSelection(local467), (ClipboardOwner) null);
                }
            } else if (local151 == 67 && (local159 & 0x4) != 0) {
                if (Static175.aClipboard1 != null) {
                    try {
                        @Pc(207) Transferable local207 = Static175.aClipboard1.getContents((Object) null);
                        if (local207 != null) {
                            @Pc(214) String local214 = (String) local207.getTransferData(DataFlavor.stringFlavor);
                            if (local214 != null) {
                                @Pc(221) String[] local221 = Static189.method2861(local214, '\n');
                                Static363.method6234(local221);
                            }
                        }
                    } catch (@Pc(226) Exception local226) {
                    }
                }
            } else if (local151 == 85 && Static594.anInt8776 > 0) {
                Static110.aString19 = Static110.aString19.substring(0, Static594.anInt8776 - 1) + Static110.aString19.substring(Static594.anInt8776);
                Static594.anInt8776--;
            } else if (local151 == 101 && Static594.anInt8776 < Static110.aString19.length()) {
                Static110.aString19 = Static110.aString19.substring(0, Static594.anInt8776) + Static110.aString19.substring(Static594.anInt8776 + 1);
            } else if (local151 == 96 && Static594.anInt8776 > 0) {
                Static594.anInt8776--;
            } else if (local151 == 97 && Static594.anInt8776 < Static110.aString19.length()) {
                Static594.anInt8776++;
            } else if (local151 == 102) {
                Static594.anInt8776 = 0;
            } else if (local151 == 103) {
                Static594.anInt8776 = Static110.aString19.length();
            } else if (local151 == 104 && Static393.aStringArray32.length > Static625.anInt9472) {
                Static625.anInt9472++;
                Static344.method5046();
                Static594.anInt8776 = Static110.aString19.length();
            } else if (local151 == 105 && Static625.anInt9472 > 0) {
                Static625.anInt9472--;
                Static344.method5046();
                Static594.anInt8776 = Static110.aString19.length();
            } else if (StringTools.isAlphanumeric(local155) || "\\/.:, _-+[]~@".indexOf(local155) != -1) {
                Static110.aString19 = Static110.aString19.substring(0, Static594.anInt8776) + Static194.anInterface27Array1[local26].method2666() + Static110.aString19.substring(Static594.anInt8776);
                Static594.anInt8776++;
            }
        }
        Static216.anInt3530 = 0;
        Static671.anInt10026 = 0;
        InterfaceManager.redrawAll();
    }
}
