import com.jagex.SignLink;
import com.jagex.core.io.Packet;
import com.jagex.core.util.SystemTimer;
import com.jagex.game.runetek6.config.paramtype.ParamTypeList;
import com.jagex.js5.Js5MasterIndex;
import com.jagex.js5.js5;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int anInt3882;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int anInt3888;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "Lclient!hh;")
    public static final Class162 aClass162_3 = new Class162("LIVE", 0);

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public static int anInt3885 = -1;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Z")
    public static boolean method3444(@OriginalArg(0) int arg0) {
        if (arg0 == 19 || arg0 == 13 || arg0 == 46 || arg0 == 8 || arg0 == 1010 || arg0 == 1008) {
            return true;
        } else {
            return arg0 == 60;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!ge;Ljava/lang/String;)I")
    public static int method3446(@OriginalArg(1) Packet arg0, @OriginalArg(2) String arg1) {
        @Pc(12) int local12 = arg0.pos;
        @Pc(16) byte[] local16 = Static469.method6361(arg1);
        arg0.psmarts(local16.length);
        arg0.pos += Static636.aClass197_1.method4440(arg0.pos, 0, local16.length, arg0.data, local16);
        return arg0.pos - local12;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)V")
    public static void method3447(@OriginalArg(0) boolean arg0) {
        if (Static449.aClass364_1 == null) {
            Static229.method3368();
        }
        if (arg0) {
            Static449.aClass364_1.method8371();
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)I")
    public static int method3448() {
        @Pc(12) int local12;
        if (Static400.instance.aClass57_Sub10_1.method3519() == 0) {
            for (local12 = 0; local12 < Static671.anInt10026; local12++) {
                if (Static194.anInterface27Array1[local12].method2666() == 's' || Static194.anInterface27Array1[local12].method2666() == 'S') {
                    Static400.instance.method5104(1, Static400.instance.aClass57_Sub10_1);
                    Static416.aBoolean472 = true;
                    break;
                }
            }
        }
        @Pc(74) int local74;
        if (Static198.aClass140_1 == Static473.aClass140_22) {
            @Pc(65) Runtime local65 = Runtime.getRuntime();
            local74 = (int) ((local65.totalMemory() - local65.freeMemory()) / 1024L);
            @Pc(77) long local77 = SystemTimer.safetime();
            if (Static6.aLong8 == 0L) {
                Static6.aLong8 = local77;
            }
            if (local74 > 16384 && local77 - Static6.aLong8 < 5000L) {
                if (local77 - Static549.aLong282 > 1000L) {
                    System.gc();
                    Static549.aLong282 = local77;
                }
                return 0;
            }
        }
        if (Static198.aClass140_2 == Static473.aClass140_22) {
            if (Static228.js5MasterIndex == null) {
                Static228.js5MasterIndex = new Js5MasterIndex(client.js5WorkerThread, Static66.aCachedResourceWorker_1, Static442.JS5_RSA_EXPONENT, Static670.JS5_RSA_MODULUS);
            }
            if (!Static228.js5MasterIndex.method5800()) {
                return 0;
            }
            Static595.method7807((String) null, true, 0);
            Static297.aBoolean368 = !Static589.method7721();
            Static177.aJs5_35 = client.load(false, Static297.aBoolean368 ? 34 : 32, 1);
            Static516.aJs5_97 = client.load(false, 33, 1);
            Static697.aJs5_123 = client.load(false, 13, 1);
        }
        @Pc(184) boolean local184;
        if (Static198.aClass140_3 == Static473.aClass140_22) {
            local184 = Static516.aJs5_97.isComplete();
            local74 = client.js5ResourceProviders[33].indexPercentage();
            local74 += client.js5ResourceProviders[Static297.aBoolean368 ? 34 : 32].indexPercentage();
            local74 += client.js5ResourceProviders[13].indexPercentage();
            local74 += local184 ? 100 : Static516.aJs5_97.method7582();
            if (local74 != 400) {
                return local74 / 4;
            }
            Static324.anInt5129 = Static177.aJs5_35.indexCrc();
            Static466.anInt7042 = Static516.aJs5_97.indexCrc();
            Static616.method8284(Static177.aJs5_35);
            @Pc(250) int local250 = Static400.instance.aClass57_Sub11_1.method3603();
            Static333.aClass279_1 = new Class279(Static392.aModeGame_4, Static51.anInt1052, Static516.aJs5_97);
            @Pc(262) int[] local262 = Static333.aClass279_1.method6275(local250);
            if (local262.length == 0) {
                local262 = Static333.aClass279_1.method6275(0);
            }
            @Pc(276) Class398 local276 = new Class398(Static177.aJs5_35, Static697.aJs5_123);
            if (local262.length > 0) {
                Static234.anInterface22Array1 = new Interface22[local262.length];
                for (@Pc(285) int local285 = 0; local285 < Static234.anInterface22Array1.length; local285++) {
                    Static234.anInterface22Array1[local285] = new Class354(Static333.aClass279_1.method6277(local262[local285]), local276);
                }
            }
        }
        if (Static198.aClass140_4 == Static473.aClass140_22) {
            Static82.method1592(Static697.aJs5_123, Static177.aJs5_35, Static52.method1159());
        }
        if (Static198.aClass140_5 == Static473.aClass140_22) {
            local12 = Static359.method5226();
            local74 = Static714.method9339();
            if (local74 > local12) {
                return local12 * 100 / local74;
            }
        }
        if (Static198.aClass140_6 == Static473.aClass140_22) {
            if (Static234.anInterface22Array1 != null && Static234.anInterface22Array1.length > 0) {
                if (Static234.anInterface22Array1[0].method8460() < 100) {
                    return 0;
                }
                if (Static234.anInterface22Array1.length > 1 && Static333.aClass279_1.method6276() && Static234.anInterface22Array1[1].method8460() < 100) {
                    return 0;
                }
            }
            Static570.method7549(Static163.activeToolkit);
            Static469.method6358(Static163.activeToolkit);
            Static81.method1586(1);
        }
        if (Static198.aClass140_7 == Static473.aClass140_22) {
            for (local12 = 0; local12 < 4; local12++) {
                Static577.aClass110Array1[local12] = Static125.method2219(Static720.anInt10859, Static501.anInt7568);
            }
        }
        if (Static473.aClass140_22 == Static198.aClass140_8) {
            Static721.aJs5_128 = client.load(false, 8, 1);
            Static344.aJs5_73 = client.load(false, 0, 1);
            Static142.aJs5_25 = client.load(false, 1, 1);
            Static6.aJs5_1 = client.load(false, 2, 1);
            Static554.aJs5_105 = client.load(false, 3, 1);
            Static281.aJs5_60 = client.load(false, 4, 1);
            Static93.aJs5_16 = client.load(true, 5, 1);
            Static398.aJs5_81 = client.load(true, 6, 1);
            Static190.aJs5_38 = client.load(false, 7, 1);
            Static534.aJs5_104 = client.load(false, 9, 1);
            Static463.aJs5_93 = client.load(false, 10, 1);
            Static340.aJs5_69 = client.load(false, 11, 1);
            Static31.aJs5_6 = client.load(false, 12, 1);
            Static147.aJs5_26 = client.load(false, 14, 1);
            Static405.aJs5_84 = client.load(false, 15, 1);
            Static459.aJs5_91 = client.load(false, 16, 1);
            Static20.aJs5_3 = client.load(false, 17, 1);
            Static333.aJs5_66 = client.load(false, 18, 1);
            Static380.aJs5_79 = client.load(false, 19, 1);
            Static668.aJs5_119 = client.load(false, 20, 1);
            Static271.aJs5_59 = client.load(false, 21, 1);
            Static233.aJs5_52 = client.load(false, 22, 1);
            Static120.aJs5_19 = client.load(true, 23, 1);
            Static58.aJs5_12 = client.load(false, 24, 1);
            Static244.aJs5_55 = client.load(false, 25, 1);
            Static199.aJs5_42 = client.load(true, 26, 1);
            Static88.aJs5_14 = client.load(false, 27, 1);
            js5.DEFAULTS = client.load(true, 28, 1);
            Static140.aJs5_24 = client.load(false, 29, 1);
            Static504.aJs5_95 = client.load(true, 35, 1);
            Static614.aJs5_114 = client.load(true, 30, 1);
            Static124.aJs5_20 = client.load(true, 31, 1);
            Static709.aJs5_127 = client.load(true, 36, 2);
        }
        if (Static473.aClass140_22 == Static198.aClass140_9) {
            local12 = 0;
            for (local74 = 0; local74 < 37; local74++) {
                if (client.js5ResourceProviders[local74] != null) {
                    local12 += client.js5ResourceProviders[local74].indexPercentage() * Static462.anIntArray556[local74] / 100;
                }
            }
            if (local12 != 100) {
                if (Static669.anInt9996 < 0) {
                    Static669.anInt9996 = local12;
                }
                return (local12 - Static669.anInt9996) * 100 / (100 - Static669.anInt9996);
            }
            Static204.method3079(Static721.aJs5_128);
            Static82.method1592(Static697.aJs5_123, Static721.aJs5_128, Static52.method1159());
        }
        if (Static473.aClass140_22 == Static198.aClass140_10) {
            @Pc(746) byte[] local746 = js5.DEFAULTS.getfile(4);
            if (local746 == null) {
                return 0;
            }
            Static9.method124(local746);
            Static674.method8806();
            Static81.method1586(2);
        }
        if (Static198.aClass140_11 == Static473.aClass140_22) {
            Static529.method7096(Static614.aJs5_114, SignLink.instance);
        }
        if (Static198.aClass140_12 == Static473.aClass140_22) {
            local12 = Static460.method6266();
            if (local12 < 100) {
                return local12;
            }
            Static502.method6721(js5.DEFAULTS.getfile(1));
            GraphicsDefaults.INSTANCE = new GraphicsDefaults(js5.DEFAULTS);
            PlayerModel.recol_s = GraphicsDefaults.INSTANCE.recol_s;
            PlayerModel.recol_d = GraphicsDefaults.INSTANCE.recol_d;
            Static125.aWearposDefaults_1 = new WearposDefaults(js5.DEFAULTS);
        }
        if (Static198.aClass140_13 == Static473.aClass140_22) {
            if (GraphicsDefaults.INSTANCE.profilingModel != -1 && !Static190.aJs5_38.requestdownload(0, GraphicsDefaults.INSTANCE.profilingModel)) {
                return 99;
            }
            Static56.anTextureSource_3 = new Class303(Static199.aJs5_42, Static534.aJs5_104, Static721.aJs5_128);
            ParamTypeList.instance = new ParamTypeList(Static392.aModeGame_4, Static51.anInt1052, Static6.aJs5_1);
            Static574.aBASTypeList_2 = new BASTypeList(Static392.aModeGame_4, Static51.anInt1052, Static6.aJs5_1, Static125.aWearposDefaults_1);
            Static354.aClass267_1 = new Class267(Static392.aModeGame_4, Static51.anInt1052, Static6.aJs5_1, Static721.aJs5_128);
            Static619.aClass387_2 = new Class387(Static392.aModeGame_4, Static51.anInt1052, Static20.aJs5_3);
            Static467.aClass96_3 = new Class96(Static392.aModeGame_4, Static51.anInt1052, Static6.aJs5_1);
            Static540.aClass79_6 = new Class79(Static392.aModeGame_4, Static51.anInt1052, Static6.aJs5_1);
            Static561.aClass220_2 = new Class220(Static392.aModeGame_4, Static51.anInt1052, Static6.aJs5_1, Static721.aJs5_128);
            Static68.aIDKTypeList_3 = new IDKTypeList(Static392.aModeGame_4, Static51.anInt1052, Static6.aJs5_1, Static190.aJs5_38);
            Static503.aClass335_1 = new Class335(Static392.aModeGame_4, Static51.anInt1052, Static6.aJs5_1);
            Static48.aClass384_1 = new Class384(Static392.aModeGame_4, Static51.anInt1052, Static6.aJs5_1);
            Static354.aClass142_4 = new Class142(Static392.aModeGame_4, Static51.anInt1052, true, Static459.aJs5_91, Static190.aJs5_38);
            Static577.aClass246_4 = new Class246(Static392.aModeGame_4, Static51.anInt1052, Static6.aJs5_1, Static721.aJs5_128);
            Static720.aClass363_4 = new Class363(Static392.aModeGame_4, Static51.anInt1052, Static6.aJs5_1, Static721.aJs5_128);
            Static690.aNPCTypeList_2 = new NPCTypeList(Static392.aModeGame_4, Static51.anInt1052, true, Static333.aJs5_66, Static190.aJs5_38);
            Static419.aObjTypeList_1 = new ObjTypeList(Static392.aModeGame_4, Static51.anInt1052, true, ParamTypeList.instance, Static380.aJs5_79, Static190.aJs5_38);
            Static272.aClass45_1 = new Class45(Static392.aModeGame_4, Static51.anInt1052, Static6.aJs5_1);
            Static25.aSeqTypeList_1 = new SeqTypeList(Static392.aModeGame_4, Static51.anInt1052, Static668.aJs5_119, Static344.aJs5_73, Static142.aJs5_25);
            Static324.aClass307_1 = new Class307(Static392.aModeGame_4, Static51.anInt1052, Static6.aJs5_1);
            Static99.aClass78_1 = new Class78(Static392.aModeGame_4, Static51.anInt1052, Static6.aJs5_1);
            Static23.aClass128_1 = new Class128(Static392.aModeGame_4, Static51.anInt1052, Static271.aJs5_59, Static190.aJs5_38);
            Static652.aClass214_1 = new Class214(Static392.aModeGame_4, Static51.anInt1052, Static6.aJs5_1);
            Static718.aClass176_1 = new Class176(Static392.aModeGame_4, Static51.anInt1052, Static6.aJs5_1);
            Static691.aClass210_1 = new Class210(Static392.aModeGame_4, Static51.anInt1052, Static6.aJs5_1);
            Static529.aClass161_1 = new Class161(Static392.aModeGame_4, Static51.anInt1052, Static233.aJs5_52);
            Static36.aClass260_1 = new Class260(Static392.aModeGame_4, Static51.anInt1052, Static6.aJs5_1);
            Static628.aClass342_5 = new Class342(Static392.aModeGame_4, Static51.anInt1052, Static6.aJs5_1);
            Static648.aClass17_1 = new Class17(Static392.aModeGame_4, Static51.anInt1052, Static6.aJs5_1);
            Static444.method5987(Static554.aJs5_105, Static697.aJs5_123, Static721.aJs5_128, Static190.aJs5_38);
            Static110.method2081(Static140.aJs5_24);
            Static68.aClass151_3 = new Class151(Static51.anInt1052, Static58.aJs5_12, Static244.aJs5_55);
            Static288.aClass139_2 = new Class139(Static51.anInt1052, Static58.aJs5_12, Static244.aJs5_55, new Class251());
            Static412.method5693();
            Static354.aClass142_4.method3061(Static400.instance.aClass57_Sub19_2.method5960() == 0);
            Static34.aClass304_1 = new Class304();
            Static296.updateFeatureMask();
            Static44.method1074(Static25.aSeqTypeList_1);
            Static187.method2844(Static88.aJs5_14);
            Static405.method5592(Static56.anTextureSource_3, Static190.aJs5_38);
            @Pc(1119) Class197 local1119 = new Class197(Static463.aJs5_93.method7600("huffman", ""));
            Static342.method4462(local1119);
            try {
                jagmisc.init();
            } catch (@Pc(1126) Throwable local1126) {
            }
            Static600.aClass27_1 = Static570.method7550();
            Static292.aClass2_Sub43_2 = new Node_Sub43(true, SignLink.instance);
        }
        if (Static198.aClass140_15 == Static473.aClass140_22) {
            local12 = Static188.method2860(Static721.aJs5_128) + Static372.method5291(true);
            local74 = Static688.method8974() + Static714.method9339();
            if (local12 < local74) {
                return local12 * 100 / local74;
            }
        }
        if (Static198.aClass140_16 == Static473.aClass140_22) {
            Static30.method5065(Static120.aJs5_19, Static467.aClass96_3, Static540.aClass79_6, Static354.aClass142_4, Static577.aClass246_4, Static720.aClass363_4, Static34.aClass304_1);
        }
        if (Static198.aClass140_17 == Static473.aClass140_22) {
            Static37.aStringArray4 = new String[Static718.aClass176_1.anInt4266];
            Static511.anIntArray614 = new int[Static691.aClass210_1.anInt5473];
            Static118.aBooleanArray4 = new boolean[Static691.aClass210_1.anInt5473];
            for (local12 = 0; local12 < Static691.aClass210_1.anInt5473; local12++) {
                if (Static691.aClass210_1.method4947(local12).anInt7174 == 0) {
                    Static118.aBooleanArray4[local12] = true;
                    Static319.anInt5078++;
                }
                Static511.anIntArray614[local12] = -1;
            }
            Static218.method3189();
            Static93.aJs5_16.clearNames(false, true);
            Static398.aJs5_81.clearNames(true, true);
            Static721.aJs5_128.clearNames(true, true);
            Static697.aJs5_123.clearNames(true, true);
            Static463.aJs5_93.clearNames(true, true);
            Static6.aJs5_1.discardunpacked = 2;
            Static666.aBoolean766 = true;
            Static20.aJs5_3.discardunpacked = 2;
            Static459.aJs5_91.discardunpacked = 2;
            Static333.aJs5_66.discardunpacked = 2;
            Static380.aJs5_79.discardunpacked = 2;
            Static668.aJs5_119.discardunpacked = 2;
            Static271.aJs5_59.discardunpacked = 2;
        }
        if (Static473.aClass140_22 == Static198.aClass140_18) {
            if (!Static571.method7566(GraphicsDefaults.INSTANCE.login_interface)) {
                return 0;
            }
            local184 = true;
            for (local74 = 0; local74 < Static453.aClass158ArrayArray2[GraphicsDefaults.INSTANCE.login_interface].length; local74++) {
                @Pc(1315) Class158 local1315 = Static453.aClass158ArrayArray2[GraphicsDefaults.INSTANCE.login_interface][local74];
                if (local1315.anInt3820 == 5 && local1315.anInt3810 != -1 && !Static721.aJs5_128.requestdownload(0, local1315.anInt3810)) {
                    local184 = false;
                }
            }
            if (!local184) {
                return 0;
            }
        }
        if (Static198.aClass140_19 == Static473.aClass140_22) {
            Static456.method6228(true);
        }
        if (Static198.aClass140_20 == Static473.aClass140_22) {
            Static449.aClass364_1.method8372();
            try {
                Static242.aThread1.join();
            } catch (@Pc(1370) InterruptedException local1370) {
                return 0;
            }
            Static234.anInterface22Array1 = null;
            Static449.aClass364_1 = null;
            Static177.aJs5_35 = null;
            Static516.aJs5_97 = null;
            Static242.aThread1 = null;
            Static333.aClass279_1 = null;
            Static9.method123();
            Static3.aBoolean4 = Static400.instance.aClass57_Sub10_1.method3519() == 1;
            Static400.instance.method5104(1, Static400.instance.aClass57_Sub10_1);
            if (Static3.aBoolean4) {
                Static400.instance.method5104(0, Static400.instance.aClass57_Sub29_2);
            } else if (Static400.instance.aClass57_Sub29_2.aBoolean674 && Static292.aClass2_Sub43_2.anInt7610 < 512 && Static292.aClass2_Sub43_2.anInt7610 != 0) {
                Static400.instance.method5104(0, Static400.instance.aClass57_Sub29_2);
            }
            Static666.method8693(1);
            if (Static3.aBoolean4) {
                Static32.method880(0, false);
            } else {
                Static32.method880(Static400.instance.aClass57_Sub29_2.method7915(), false);
            }
            Static409.method5657(Static400.instance.screenSize.getValue(), -1, false, -1);
            Static570.method7549(Static163.activeToolkit);
            Static469.method6358(Static163.activeToolkit);
            Static239.method3472(Static721.aJs5_128, Static163.activeToolkit);
            Static331.method4925(Static679.aSpriteArray14);
        }
        return Static694.method9030();
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZLclient!hda;)V")
    public static void method3449(@OriginalArg(1) Class158 arg0) {
        if (Static376.anInt5921 != arg0.anInt3806) {
            return;
        }
        if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9 == null) {
            arg0.obj = 0;
            arg0.objData = 0;
            return;
        }
        arg0.anInt3807 = 150;
        arg0.anInt3811 = (int) (Math.sin((double) Static333.anInt5455 / 40.0D) * 256.0D) & 0x7FF;
        arg0.anInt3823 = 5;
        arg0.obj = Static312.anInt5000;
        arg0.objData = Static214.method3157(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9);
        @Pc(55) Animator local55 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aAnimator_10;
        if (local55 == null) {
            arg0.aAnimator_6 = null;
            return;
        }
        if (arg0.aAnimator_6 == null) {
            arg0.aAnimator_6 = new Animator_Sub1();
        }
        arg0.anInt3789 = local55.getAnimationId();
        arg0.aAnimator_6.method9096(local55);
    }
}
