import com.jagex.graphics.Toolkit;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

    @OriginalMember(owner = "client!pja", name = "kb", descriptor = "I")
    public static int anInt7409;

    @OriginalMember(owner = "client!pja", name = "rb", descriptor = "I")
    public static int runWeight = 0;

    @OriginalMember(owner = "client!pja", name = "e", descriptor = "(B)V")
    public static void method6597() {
        Static659.blockChat = 0;
        @Pc(17) int local17 = (PlayerEntity.self.x >> 9) + WorldMap.areaBaseX;
        @Pc(24) int local24 = WorldMap.areaBaseZ + (PlayerEntity.self.z >> 9);
        if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
            Static659.blockChat = 1;
        }
        if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
            Static659.blockChat = 1;
        }
        if (Static659.blockChat == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
            Static659.blockChat = 0;
        }
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static void method6599(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
        @Pc(6) String local6 = arg0.toLowerCase();
        @Pc(9) short[] local9 = new short[16];
        @Pc(11) int local11 = 0;
        @Pc(18) int local18 = arg1 ? 32768 : 0;
        @Pc(29) int local29 = (arg1 ? QuickChatPhraseTypeList.instance.anInt3261 : QuickChatPhraseTypeList.instance.anInt3264) + local18;
        @Pc(80) int local80;
        for (@Pc(31) int local31 = local18; local31 < local29; local31++) {
            @Pc(37) QuickChatPhraseType local37 = QuickChatPhraseTypeList.instance.get(local31);
            if (local37.searchable && local37.getText().toLowerCase().indexOf(local6) != -1) {
                if (local11 >= 50) {
                    ObjFinder.results = null;
                    ObjFinder.resultCount = -1;
                    return;
                }
                if (local11 >= local9.length) {
                    @Pc(78) short[] local78 = new short[local9.length * 2];
                    for (local80 = 0; local80 < local11; local80++) {
                        local78[local80] = local9[local80];
                    }
                    local9 = local78;
                }
                local9[local11++] = (short) local31;
            }
        }
        ObjFinder.pointer = 0;
        ObjFinder.resultCount = local11;
        ObjFinder.results = local9;
        @Pc(120) String[] local120 = new String[ObjFinder.resultCount];
        for (local80 = 0; local80 < ObjFinder.resultCount; local80++) {
            local120[local80] = QuickChatPhraseTypeList.instance.get(local9[local80]).getText();
        }
        ObjFinder.quicksort(local120, ObjFinder.results);
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(ILclient!dda;ILclient!ha;)V")
    public static void method6601(@OriginalArg(0) int arg0, @OriginalArg(1) LocOccluder arg1, @OriginalArg(3) Toolkit arg2) {
        @Pc(15) int local15;
        if (Static617.anIntArray726 != null && arg0 <= arg1.aByte44) {
            for (local15 = 0; local15 < Static617.anIntArray726.length; local15++) {
                if (Static617.anIntArray726[local15] != -1000000 && (arg1.anIntArray186[0] <= Static617.anIntArray726[local15] || Static617.anIntArray726[local15] >= arg1.anIntArray186[1] || Static617.anIntArray726[local15] >= arg1.anIntArray186[2] || Static617.anIntArray726[local15] >= arg1.anIntArray186[3]) && (Static419.anIntArray500[local15] >= arg1.anIntArray185[0] || arg1.anIntArray185[1] <= Static419.anIntArray500[local15] || arg1.anIntArray185[2] <= Static419.anIntArray500[local15] || Static419.anIntArray500[local15] >= arg1.anIntArray185[3]) && (arg1.anIntArray185[0] >= Static714.anIntArray880[local15] || Static714.anIntArray880[local15] <= arg1.anIntArray185[1] || arg1.anIntArray185[2] >= Static714.anIntArray880[local15] || Static714.anIntArray880[local15] <= arg1.anIntArray185[3]) && (arg1.anIntArray188[0] <= Static219.anIntArray288[local15] || arg1.anIntArray188[1] <= Static219.anIntArray288[local15] || Static219.anIntArray288[local15] >= arg1.anIntArray188[2] || Static219.anIntArray288[local15] >= arg1.anIntArray188[3]) && (Static665.anIntArray779[local15] <= arg1.anIntArray188[0] || Static665.anIntArray779[local15] <= arg1.anIntArray188[1] || Static665.anIntArray779[local15] <= arg1.anIntArray188[2] || Static665.anIntArray779[local15] <= arg1.anIntArray188[3])) {
                    return;
                }
            }
        }
        @Pc(323) int local323;
        @Pc(353) int local353;
        @Pc(375) boolean local375;
        @Pc(410) float local410;
        if (arg1.aByte43 == 1) {
            local15 = Static35.anInt813 + arg1.aShort26 - Static403.anInt6246;
            if (local15 >= 0 && local15 <= Static35.anInt813 + Static35.anInt813) {
                local323 = arg1.aShort23 + Static35.anInt813 - Static550.anInt8271;
                if (local323 < 0) {
                    local323 = 0;
                } else if (local323 > Static35.anInt813 + Static35.anInt813) {
                    return;
                }
                local353 = Static35.anInt813 + arg1.aShort25 - Static550.anInt8271;
                if (Static35.anInt813 + Static35.anInt813 < local353) {
                    local353 = Static35.anInt813 + Static35.anInt813;
                } else if (local353 < 0) {
                    return;
                }
                local375 = false;
                while (local323 <= local353) {
                    if (Static258.aBooleanArrayArray3[local15][local323++]) {
                        local375 = true;
                        break;
                    }
                }
                if (local375) {
                    local410 = (float) (Static499.anInt7492 - arg1.anIntArray185[0]);
                    if (local410 < 0.0F) {
                        local410 *= -1.0F;
                    }
                    if (!((float) Static86.anInt1803 > local410) && (Static219.method3190(0, arg1) && (Static219.method3190(1, arg1) && (Static219.method3190(2, arg1) && Static219.method3190(3, arg1))))) {
                        Static560.aLocOccluderArray3[Static469.activeOccluderCount++] = arg1;
                    }
                }
            }
        } else if (arg1.aByte43 == 2) {
            local15 = Static35.anInt813 + arg1.aShort23 - Static550.anInt8271;
            if (local15 >= 0 && local15 <= Static35.anInt813 + Static35.anInt813) {
                local323 = Static35.anInt813 + arg1.aShort26 - Static403.anInt6246;
                if (local323 < 0) {
                    local323 = 0;
                } else if (local323 > Static35.anInt813 + Static35.anInt813) {
                    return;
                }
                local353 = Static35.anInt813 + arg1.aShort24 - Static403.anInt6246;
                if (Static35.anInt813 + Static35.anInt813 < local353) {
                    local353 = Static35.anInt813 + Static35.anInt813;
                } else if (local353 < 0) {
                    return;
                }
                local375 = false;
                while (local323 <= local353) {
                    if (Static258.aBooleanArrayArray3[local323++][local15]) {
                        local375 = true;
                        break;
                    }
                }
                if (local375) {
                    local410 = (float) (Static715.anInt10810 - arg1.anIntArray188[0]);
                    if (local410 < 0.0F) {
                        local410 *= -1.0F;
                    }
                    if (!(local410 < (float) Static86.anInt1803) && (Static219.method3190(0, arg1) && (Static219.method3190(1, arg1) && (Static219.method3190(2, arg1) && Static219.method3190(3, arg1))))) {
                        Static560.aLocOccluderArray3[Static469.activeOccluderCount++] = arg1;
                    }
                }
            }
        } else if (arg1.aByte43 == 16 || arg1.aByte43 == 8) {
            local15 = arg1.aShort26 + Static35.anInt813 - Static403.anInt6246;
            if (local15 >= 0 && Static35.anInt813 + Static35.anInt813 >= local15) {
                local323 = arg1.aShort23 + Static35.anInt813 - Static550.anInt8271;
                if (local323 >= 0 && Static35.anInt813 + Static35.anInt813 >= local323 && Static258.aBooleanArrayArray3[local15][local323]) {
                    @Pc(697) float local697 = (float) (Static499.anInt7492 - arg1.anIntArray185[0]);
                    if (local697 < 0.0F) {
                        local697 *= -1.0F;
                    }
                    @Pc(714) float local714 = (float) (Static715.anInt10810 - arg1.anIntArray188[0]);
                    if (local714 < 0.0F) {
                        local714 *= -1.0F;
                    }
                    if ((!((float) Static86.anInt1803 > local697) || !((float) Static86.anInt1803 > local714)) && (Static219.method3190(0, arg1) && (Static219.method3190(1, arg1) && (Static219.method3190(2, arg1) && Static219.method3190(3, arg1))))) {
                        Static560.aLocOccluderArray3[Static469.activeOccluderCount++] = arg1;
                    }
                }
            }
        } else if (arg1.aByte43 == 4) {
            @Pc(787) float local787 = (float) (arg1.anIntArray186[0] - Static523.anInt3882);
            if (!(local787 <= (float) Static663.anInt9874)) {
                local323 = arg1.aShort23 + Static35.anInt813 - Static550.anInt8271;
                if (local323 < 0) {
                    local323 = 0;
                } else if (local323 > Static35.anInt813 + Static35.anInt813) {
                    return;
                }
                local353 = Static35.anInt813 + arg1.aShort25 - Static550.anInt8271;
                if (Static35.anInt813 + Static35.anInt813 < local353) {
                    local353 = Static35.anInt813 + Static35.anInt813;
                } else if (local353 < 0) {
                    return;
                }
                @Pc(856) int local856 = arg1.aShort26 + Static35.anInt813 - Static403.anInt6246;
                if (local856 < 0) {
                    local856 = 0;
                } else if (Static35.anInt813 + Static35.anInt813 < local856) {
                    return;
                }
                @Pc(881) int local881 = Static35.anInt813 + arg1.aShort24 - Static403.anInt6246;
                if (Static35.anInt813 + Static35.anInt813 < local881) {
                    local881 = Static35.anInt813 + Static35.anInt813;
                } else if (local881 < 0) {
                    return;
                }
                @Pc(900) boolean local900 = false;
                label283:
                for (@Pc(902) int local902 = local856; local902 <= local881; local902++) {
                    for (@Pc(908) int local908 = local323; local908 <= local353; local908++) {
                        if (Static258.aBooleanArrayArray3[local902][local908]) {
                            local900 = true;
                            break label283;
                        }
                    }
                }
                if (local900 && (Static219.method3190(0, arg1) && (Static219.method3190(1, arg1) && (Static219.method3190(2, arg1) && Static219.method3190(3, arg1))))) {
                    Static560.aLocOccluderArray3[Static469.activeOccluderCount++] = arg1;
                }
            }
        }
    }
}
