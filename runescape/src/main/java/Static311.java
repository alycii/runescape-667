import com.jagex.game.runetek6.config.objtype.ObjType;
import com.jagex.game.runetek6.config.objtype.ObjTypeList;
import com.jagex.game.runetek6.config.paramtype.ParamType;
import com.jagex.game.runetek6.config.paramtype.ParamTypeList;
import com.jagex.js5.js5;
import com.jagex.sound.Class123;
import com.jagex.sound.midi.MidiSong;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!bn;I)Z")
    public static boolean method4537(@OriginalArg(0) MidiSong arg0) {
        if (arg0 == null) {
            return true;
        }
        Static62.aClass2_Sub8_3 = null;
        SongManager.anInt10171 = 0;
        Static12.aClass123_4 = null;
        SongManager.aClass2_Sub6_Sub1_2 = null;
        if (arg0 != Static62.aClass2_Sub8_2) {
            Static159.anInt2788 = 0;
            Static62.aClass2_Sub8_2 = arg0;
        }
        SongManager.midiSongs = null;
        if (Static159.anInt2788 == 0) {
            Static270.aClass123_2 = new Class123(Static91.synthSoundsJs5, Static296.vorbisJs5);
            Static581.mixBuss.method927();
            Static159.anInt2788 = 1;
        }
        if (Static159.anInt2788 == 1) {
            if (!Static581.mixBuss.method944(Static270.aClass123_2, Static86.js5_15, arg0)) {
                return false;
            }
            Static270.aClass123_2 = null;
            Static62.aClass2_Sub8_2 = null;
            Static159.anInt2788 = 0;
        }
        return true;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ZBZIILjava/lang/String;Ljava/lang/String;)V")
    public static void method4538(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5) {
        js5.CONFIG_OBJ.discardunpacked = 1;
        @Pc(9) String local9 = arg4.toLowerCase();
        @Pc(12) short[] local12 = new short[16];
        @Pc(14) int local14 = -1;
        @Pc(16) String local16 = null;
        if (arg3 != -1) {
            @Pc(25) ParamType local25 = ParamTypeList.instance.list(arg3);
            if (local25 == null || local25.isString() != arg0) {
                return;
            }
            if (local25.isString()) {
                local16 = local25.defaultstr;
            } else {
                local14 = local25.defaultint;
            }
        }
        @Pc(54) int local54 = 0;
        for (@Pc(56) int local56 = 0; local56 < ObjTypeList.instance.num; local56++) {
            @Pc(62) ObjType local62 = ObjTypeList.instance.list(local56);
            if ((!arg1 || local62.stockmarket) && local62.certtemplate == -1 && local62.lenttemplate == -1 && local62.boughttemplate == -1 && local62.dummyitem == 0 && local62.name.toLowerCase().indexOf(local9) != -1) {
                if (arg3 != -1) {
                    if (arg0) {
                        if (!arg5.equals(local62.param(local16, arg3))) {
                            continue;
                        }
                    } else if (arg2 != local62.param(arg3, local14)) {
                        continue;
                    }
                }
                if (local54 >= 250) {
                    Static256.aShortArray63 = null;
                    Static606.anInt8947 = -1;
                    return;
                }
                if (local12.length <= local54) {
                    @Pc(164) short[] local164 = new short[local12.length * 2];
                    for (@Pc(166) int local166 = 0; local166 < local54; local166++) {
                        local164[local166] = local12[local166];
                    }
                    local12 = local164;
                }
                local12[local54++] = (short) local56;
            }
        }
        Static606.anInt8947 = local54;
        Static143.anInt4054 = 0;
        Static256.aShortArray63 = local12;
        @Pc(203) String[] local203 = new String[Static606.anInt8947];
        for (@Pc(205) int local205 = 0; local205 < Static606.anInt8947; local205++) {
            local203[local205] = ObjTypeList.instance.list(local12[local205]).name;
        }
        Static554.method7292(local203, Static256.aShortArray63);
        js5.CONFIG_OBJ.discardUnpacked();
        js5.CONFIG_OBJ.discardunpacked = 2;
    }
}
