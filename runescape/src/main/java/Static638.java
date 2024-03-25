import com.jagex.SignLink;
import com.jagex.core.datastruct.LinkedList;
import com.jagex.game.runetek6.sound.Audio;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.Component;

public final class Static638 {

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(I)V")
    public static void method8393() {
        @Pc(5) LinkedList[] local5 = Class43.A_ENTITY_LIST_ARRAY_1;
        synchronized (Class43.A_ENTITY_LIST_ARRAY_1) {
            for (@Pc(9) int local9 = 0; local9 < Class43.A_ENTITY_LIST_ARRAY_1.length; local9++) {
                Class43.A_ENTITY_LIST_ARRAY_1[local9] = new LinkedList();
                Static159.anIntArray245[local9] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!vq;BIILjava/awt/Component;)Lclient!cd;")
    public static Class56 method8394(@OriginalArg(0) SignLink arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
        if (Audio.sampleRate == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 2) {
            throw new IllegalArgumentException();
        } else {
            try {
                @Pc(41) Class56 local41 = (Class56) Class.forName("Class56_Sub1").getDeclaredConstructor().newInstance();
                local41.anIntArray315 = new int[(Static316.aBoolean644 ? 2 : 1) * 256];
                local41.anInt4098 = arg2;
                local41.method3593(arg3);
                local41.anInt4097 = (-1024 & arg2) + 1024;
                if (local41.anInt4097 > 16384) {
                    local41.anInt4097 = 16384;
                }
                local41.method3588(local41.anInt4097);
                if (Static156.anInt2679 > 0 && Static232.aClass119_1 == null) {
                    Static232.aClass119_1 = new Class119();
                    Static232.aClass119_1.aSignLink_2 = arg0;
                    arg0.startThread(Static232.aClass119_1, Static156.anInt2679);
                }
                if (Static232.aClass119_1 != null) {
                    if (Static232.aClass119_1.aClass56Array1[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Static232.aClass119_1.aClass56Array1[arg1] = local41;
                }
                return local41;
            } catch (@Pc(135) Throwable local135) {
                try {
                    @Pc(141) Class56_Sub2 local141 = new Class56_Sub2(arg0, arg1);
                    local141.anIntArray315 = new int[(Static316.aBoolean644 ? 2 : 1) * 256];
                    local141.anInt4098 = arg2;
                    local141.method3593(arg3);
                    local141.anInt4097 = 16384;
                    local141.method3588(local141.anInt4097);
                    if (Static156.anInt2679 > 0 && Static232.aClass119_1 == null) {
                        Static232.aClass119_1 = new Class119();
                        Static232.aClass119_1.aSignLink_2 = arg0;
                        arg0.startThread(Static232.aClass119_1, Static156.anInt2679);
                    }
                    if (Static232.aClass119_1 != null) {
                        if (Static232.aClass119_1.aClass56Array1[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        Static232.aClass119_1.aClass56Array1[arg1] = local141;
                    }
                    return local141;
                } catch (@Pc(211) Throwable local211) {
                    return new Class56();
                }
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIIII)V")
    public static void method8397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
        Camera.lookZ = arg1;
        Camera.lookY = arg3;
        Static314.anInt5035 = arg0;
        Static179.anInt2991 = arg4;
        Camera.lookX = arg2;
        if (Static179.anInt2991 >= 100) {
            @Pc(22) int local22 = Camera.lookX * 512 + 256;
            @Pc(28) int local28 = Camera.lookZ * 512 + 256;
            @Pc(36) int local36 = Static102.averageHeight(Camera.renderingLevel, -29754, local28, local22) - Camera.lookY;
            @Pc(41) int local41 = local22 - Camera.x;
            @Pc(46) int local46 = local36 - Camera.y;
            @Pc(51) int local51 = local28 - Camera.z;
            @Pc(62) int local62 = (int) Math.sqrt(local51 * local51 + local41 * local41);
            Camera.pitch = (int) (Math.atan2(local46, local62) * 2607.5945876176133D) & 0x3FFF;
            Camera.yaw = (int) (-2607.5945876176133D * Math.atan2(local41, local51)) & 0x3FFF;
            if (Camera.pitch < 1024) {
                Camera.pitch = 1024;
            }
            Camera.roll = 0;
            if (Camera.pitch > 3072) {
                Camera.pitch = 3072;
            }
        }
        Static693.anInt10383 = -1;
        Static692.anInt10376 = -1;
        Camera.mode = 2;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(III)Lclient!nda;")
    public static Class8_Sub2_Sub5 method8398(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
        @Pc(7) Tile local7 = Static334.activeTiles[level][x][z];

        if (local7 == null) {
            return null;
        } else {
            @Pc(15) Class8_Sub2_Sub5 local15 = local7.aClass8_Sub2_Sub5_1;
            local7.aClass8_Sub2_Sub5_1 = null;
            Static109.hide(local15);
            return local15;
        }
    }
}
