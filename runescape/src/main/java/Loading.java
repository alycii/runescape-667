import com.jagex.Client;
import com.jagex.LibraryList;
import com.jagex.core.util.SystemTimer;
import com.jagex.game.Animator;
import com.jagex.game.PlayerModel;
import com.jagex.game.SimpleFillerDecoder;
import com.jagex.game.collision.CollisionMap;
import com.jagex.game.compression.huffman.Huffman;
import com.jagex.game.compression.huffman.WordPack;
import com.jagex.game.runetek6.client.GameShell;
import com.jagex.game.runetek6.config.bastype.BASTypeList;
import com.jagex.game.runetek6.config.cursortype.CursorTypeList;
import com.jagex.game.runetek6.config.defaults.DefaultsGroup;
import com.jagex.game.runetek6.config.defaults.GraphicsDefaults;
import com.jagex.game.runetek6.config.defaults.WearposDefaults;
import com.jagex.game.runetek6.config.enumtype.EnumTypeList;
import com.jagex.game.runetek6.config.flotype.FloorOverlayTypeList;
import com.jagex.game.runetek6.config.flutype.FloorUnderlayTypeList;
import com.jagex.game.runetek6.config.fonttype.FontTypeList;
import com.jagex.game.runetek6.config.hitmarktype.HitmarkTypeList;
import com.jagex.game.runetek6.config.idktype.IDKTypeList;
import com.jagex.game.runetek6.config.invtype.InvTypeList;
import com.jagex.game.runetek6.config.lighttype.LightTypeList;
import com.jagex.game.runetek6.config.loctype.LocTypeList;
import com.jagex.game.runetek6.config.meltype.MapElementTypeList;
import com.jagex.game.runetek6.config.msitype.MSITypeList;
import com.jagex.game.runetek6.config.npctype.NPCTypeList;
import com.jagex.game.runetek6.config.objtype.ObjTypeList;
import com.jagex.game.runetek6.config.paramtype.ParamTypeList;
import com.jagex.game.runetek6.config.questtype.QuestTypeList;
import com.jagex.game.runetek6.config.seqtype.SeqTypeList;
import com.jagex.game.runetek6.config.skyboxspheretype.SkyBoxSphereTypeList;
import com.jagex.game.runetek6.config.skyboxtype.SkyBoxTypeList;
import com.jagex.game.runetek6.config.spotanimationtype.SpotAnimationTypeList;
import com.jagex.game.runetek6.config.structtype.StructTypeList;
import com.jagex.game.runetek6.config.vartype.TimedVarDomain;
import com.jagex.game.runetek6.config.vartype.VarcTypeList;
import com.jagex.game.runetek6.config.vartype.VarcstrTypeList;
import com.jagex.game.runetek6.config.vartype.bit.VarBitTypeListClient;
import com.jagex.game.runetek6.config.vartype.clan.VarClanSettingTypeList;
import com.jagex.game.runetek6.config.vartype.clan.VarClanTypeList;
import com.jagex.game.runetek6.config.vartype.player.VarPlayerTypeListClient;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.ToolkitType;
import com.jagex.js5.Js5Archive;
import com.jagex.js5.Js5MasterIndex;
import com.jagex.js5.js5;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import rs2.client.loading.LoadState;

public final class Loading {

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int spritesCrc;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int screensCrc;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)I")
    public static int getSpritesCrc() {
        return spritesCrc;
    }

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "(I)I")
    public static int getScreensCrc() {
        return screensCrc;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)I")
    public static int method3448() {
        @Pc(12) int local12;
        if (ClientOptions.instance.safeMode.getValue() == 0) {
            for (local12 = 0; local12 < Static671.anInt10026; local12++) {
                if (Static194.AN_KEYBOARD_EVENT_ARRAY_1[local12].getKeyChar() == 's' || Static194.AN_KEYBOARD_EVENT_ARRAY_1[local12].getKeyChar() == 'S') {
                    ClientOptions.instance.update(1, ClientOptions.instance.safeMode);
                    Static416.aBoolean472 = true;
                    break;
                }
            }
        }
        @Pc(74) int local74;
        if (LoadState.WAIT_FOR_MEMORY == Static473.aLoadState_22) {
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
        if (LoadState.INIT_LOADING_SCREEN_ARCHIVES == Static473.aLoadState_22) {
            if (Static228.js5MasterIndex == null) {
                Static228.js5MasterIndex = new Js5MasterIndex(Client.js5WorkerThread, Static66.aCachedResourceWorker_1, Static442.JS5_RSA_EXPONENT, Static670.JS5_RSA_MODULUS);
            }
            if (!Static228.js5MasterIndex.method5800()) {
                return 0;
            }
            Static595.setToolkit(null, true, 0);
            Static297.loadingSpritesRaw = !Static589.method7721();
            js5.LOADING_SPRITES = client.createJs5(false, Static297.loadingSpritesRaw ? Js5Archive.LOADING_SPRITES_RAW : Js5Archive.LOADING_SPRITES, 1);
            js5.LOADING_SCREENS = client.createJs5(false, Js5Archive.LOADING_SCREENS, 1);
            js5.FONTMETRICS = client.createJs5(false, Js5Archive.FONTMETRICS, 1);
        }
        @Pc(184) boolean local184;
        if (LoadState.FETCH_LOADING_SCREEN_RESOURCES == Static473.aLoadState_22) {
            local184 = js5.LOADING_SCREENS.isComplete();
            local74 = Client.js5ResourceProviders[33].indexPercentage();
            local74 += Client.js5ResourceProviders[Static297.loadingSpritesRaw ? 34 : 32].indexPercentage();
            local74 += Client.js5ResourceProviders[13].indexPercentage();
            local74 += local184 ? 100 : js5.LOADING_SCREENS.completePercentage();
            if (local74 != 400) {
                return local74 / 4;
            }
            spritesCrc = js5.LOADING_SPRITES.indexCrc();
            screensCrc = js5.LOADING_SCREENS.indexCrc();
            Fonts.load(js5.LOADING_SPRITES);
            @Pc(250) int local250 = ClientOptions.instance.loadingSequence.getValue();
            Static333.aClass279_1 = new Class279(Client.modeGame, Client.language, js5.LOADING_SCREENS);
            @Pc(262) int[] local262 = Static333.aClass279_1.method6275(local250);
            if (local262.length == 0) {
                local262 = Static333.aClass279_1.method6275(0);
            }
            @Pc(276) LoadingScreenOpFactory local276 = new LoadingScreenOpFactory(js5.LOADING_SPRITES, js5.FONTMETRICS);
            if (local262.length > 0) {
                Static234.anLoadingScreenArray1 = new LoadingScreen[local262.length];
                for (@Pc(285) int local285 = 0; local285 < Static234.anLoadingScreenArray1.length; local285++) {
                    Static234.anLoadingScreenArray1[local285] = new Class354(Static333.aClass279_1.method6277(local262[local285]), local276);
                }
            }
        }
        if (LoadState.INIT_FONT_INFO == Static473.aLoadState_22) {
            FontTypeList.init(js5.FONTMETRICS, js5.LOADING_SPRITES, Fonts.groups());
        }
        if (LoadState.LOAD_FONTS == Static473.aLoadState_22) {
            local12 = FontTypeList.readyCount();
            local74 = FontTypeList.totalCount();
            if (local74 > local12) {
                return local12 * 100 / local74;
            }
        }
        if (LoadState.FETCH_FONTS == Static473.aLoadState_22) {
            if (Static234.anLoadingScreenArray1 != null && Static234.anLoadingScreenArray1.length > 0) {
                if (Static234.anLoadingScreenArray1[0].method8460() < 100) {
                    return 0;
                }
                if (Static234.anLoadingScreenArray1.length > 1 && Static333.aClass279_1.method6276() && Static234.anLoadingScreenArray1[1].method8460() < 100) {
                    return 0;
                }
            }
            FontTypeList.method7549(Toolkit.active);
            Fonts.init(Toolkit.active);
            MainLogicManager.setStep(1);
        }
        if (LoadState.CREATE_COLLISION_MAPS == Static473.aLoadState_22) {
            for (local12 = 0; local12 < 4; local12++) {
                Client.collisionMaps[local12] = CollisionMap.create(Static720.mapWidth, Static501.mapLength);
            }
        }
        if (Static473.aLoadState_22 == LoadState.OPEN_JS5_ARCHIVES) {
            js5.SPRITES = client.createJs5(false, Js5Archive.SPRITES, 1);
            js5.ANIMS = client.createJs5(false, Js5Archive.ANIMS, 1);
            js5.BASES = client.createJs5(false, Js5Archive.BASES, 1);
            js5.CONFIG = client.createJs5(false, Js5Archive.CONFIG, 1);
            js5.INTERFACES = client.createJs5(false, Js5Archive.INTERFACES, 1);
            js5.SYNTH_SOUNDS = client.createJs5(false, Js5Archive.SYNTH_SOUNDS, 1);
            js5.MAPS = client.createJs5(true, Js5Archive.MAPS, 1);
            js5.MIDI_SONGS = client.createJs5(true, Js5Archive.MIDI_SONGS, 1);
            js5.MODELS = client.createJs5(false, Js5Archive.MODELS, 1);
            js5.TEXTURES = client.createJs5(false, Js5Archive.TEXTURES, 1);
            js5.BINARY = client.createJs5(false, Js5Archive.BINARY, 1);
            js5.MIDI_JINGLES = client.createJs5(false, Js5Archive.MIDI_JINGLES, 1);
            js5.CLIENTSCRIPTS = client.createJs5(false, Js5Archive.CLIENTSCRIPTS, 1);
            js5.VORBIS = client.createJs5(false, Js5Archive.VORBIS, 1);
            js5.js5_15 = client.createJs5(false, 15, 1);
            js5.CONFIG_LOC = client.createJs5(false, Js5Archive.CONFIG_LOC, 1);
            js5.CONFIG_ENUM = client.createJs5(false, Js5Archive.CONFIG_ENUM, 1);
            js5.CONFIG_NPC = client.createJs5(false, Js5Archive.CONFIG_NPC, 1);
            js5.CONFIG_OBJ = client.createJs5(false, Js5Archive.CONFIG_OBJ, 1);
            js5.CONFIG_SEQ = client.createJs5(false, Js5Archive.CONFIG_SEQ, 1);
            js5.CONFIG_SPOT = client.createJs5(false, Js5Archive.CONFIG_SPOT, 1);
            js5.CONFIG_STRUCT = client.createJs5(false, Js5Archive.CONFIG_STRUCT, 1);
            js5.WORLDMAPDATA = client.createJs5(true, Js5Archive.WORLDMAPDATA, 1);
            js5.QUICKCHAT = client.createJs5(false, Js5Archive.QUICKCHAT, 1);
            js5.QUICKCHAT_GLOBAL = client.createJs5(false, Js5Archive.QUICKCHAT_GLOBAL, 1);
            js5.MATERIALS = client.createJs5(true, Js5Archive.MATERIALS, 1);
            js5.CONFIG_PARTICLE = client.createJs5(false, Js5Archive.CONFIG_PARTICLE, 1);
            js5.DEFAULTS = client.createJs5(true, Js5Archive.DEFAULTS, 1);
            js5.CONFIG_BILLBOARD = client.createJs5(false, Js5Archive.CONFIG_BILLBOARD, 1);
            js5.CUTSCENES = client.createJs5(true, Js5Archive.CUTSCENES, 1);
            js5.DLLS = client.createJs5(true, Js5Archive.DLLS, 1);
            js5.SHADERS = client.createJs5(true, Js5Archive.SHADERS, 1);
            js5.VIDEOS = client.createJs5(true, 36, 2);
        }
        if (Static473.aLoadState_22 == LoadState.GET_JS5_INDEXES) {
            local12 = 0;
            for (local74 = 0; local74 < 37; local74++) {
                if (Client.js5ResourceProviders[local74] != null) {
                    local12 += Client.js5ResourceProviders[local74].indexPercentage() * Static462.anIntArray556[local74] / 100;
                }
            }
            if (local12 != 100) {
                if (Static669.anInt9996 < 0) {
                    Static669.anInt9996 = local12;
                }
                return (local12 - Static669.anInt9996) * 100 / (100 - Static669.anInt9996);
            }
            Sprites.getJs5Indexes(js5.SPRITES);
            FontTypeList.init(js5.FONTMETRICS, js5.SPRITES, Fonts.groups());
        }
        if (Static473.aLoadState_22 == LoadState.PLAY_THEME_MUSIC) {
            @Pc(746) byte[] local746 = js5.DEFAULTS.getfile(4);
            if (local746 == null) {
                return 0;
            }
            Static9.method124(local746);
            Static674.method8806();
            MainLogicManager.setStep(2);
        }
        if (LoadState.SETUP_LIB_PATH == Static473.aLoadState_22) {
            LibraryList.init(js5.DLLS, GameShell.signLink);
        }
        if (LoadState.DOWNLOAD_STUFF == Static473.aLoadState_22) {
            local12 = Static460.method6266();
            if (local12 < 100) {
                return local12;
            }
            Static502.decodeMapDefaults(js5.DEFAULTS.getfile(DefaultsGroup.MAP));
            GraphicsDefaults.instance = new GraphicsDefaults(js5.DEFAULTS);
            PlayerModel.recol_s = GraphicsDefaults.instance.recol_s;
            PlayerModel.recol_d = GraphicsDefaults.instance.recol_d;
            WearposDefaults.instance = new WearposDefaults(js5.DEFAULTS);
        }
        if (LoadState.SETUP_CONFIG_DECODERS == Static473.aLoadState_22) {
            if (GraphicsDefaults.instance.profilingModel != -1 && !js5.MODELS.requestdownload(0, GraphicsDefaults.instance.profilingModel)) {
                return 99;
            }
            Js5TextureSource.instance = new Js5TextureSource(js5.MATERIALS, js5.TEXTURES, js5.SPRITES);
            ParamTypeList.instance = new ParamTypeList(Client.modeGame, Client.language, js5.CONFIG);
            BASTypeList.instance = new BASTypeList(Client.modeGame, Client.language, js5.CONFIG, WearposDefaults.instance);
            CursorTypeList.instance = new CursorTypeList(Client.modeGame, Client.language, js5.CONFIG, js5.SPRITES);
            EnumTypeList.instance = new EnumTypeList(Client.modeGame, Client.language, js5.CONFIG_ENUM);
            FloorOverlayTypeList.instance = new FloorOverlayTypeList(Client.modeGame, Client.language, js5.CONFIG);
            FloorUnderlayTypeList.instance = new FloorUnderlayTypeList(Client.modeGame, Client.language, js5.CONFIG);
            HitmarkTypeList.instance = new HitmarkTypeList(Client.modeGame, Client.language, js5.CONFIG, js5.SPRITES);
            IDKTypeList.instance = new IDKTypeList(Client.modeGame, Client.language, js5.CONFIG, js5.MODELS);
            InvTypeList.instance = new InvTypeList(Client.modeGame, Client.language, js5.CONFIG);
            LightTypeList.instance = new LightTypeList(Client.modeGame, Client.language, js5.CONFIG);
            LocTypeList.instance = new LocTypeList(Client.modeGame, Client.language, true, js5.CONFIG_LOC, js5.MODELS);
            MapElementTypeList.instance = new MapElementTypeList(Client.modeGame, Client.language, js5.CONFIG, js5.SPRITES);
            MSITypeList.instance = new MSITypeList(Client.modeGame, Client.language, js5.CONFIG, js5.SPRITES);
            NPCTypeList.instance = new NPCTypeList(Client.modeGame, Client.language, true, js5.CONFIG_NPC, js5.MODELS);
            ObjTypeList.instance = new ObjTypeList(Client.modeGame, Client.language, true, ParamTypeList.instance, js5.CONFIG_OBJ, js5.MODELS);
            QuestTypeList.instance = new QuestTypeList(Client.modeGame, Client.language, js5.CONFIG);
            SeqTypeList.instance = new SeqTypeList(Client.modeGame, Client.language, js5.CONFIG_SEQ, js5.ANIMS, js5.BASES);
            SkyBoxTypeList.instance = new SkyBoxTypeList(Client.modeGame, Client.language, js5.CONFIG);
            SkyBoxSphereTypeList.instance = new SkyBoxSphereTypeList(Client.modeGame, Client.language, js5.CONFIG);
            SpotAnimationTypeList.instance = new SpotAnimationTypeList(Client.modeGame, Client.language, js5.CONFIG_SPOT, js5.MODELS);
            StructTypeList.instance = new StructTypeList(Client.modeGame, Client.language, js5.CONFIG);
            VarcstrTypeList.instance = new VarcstrTypeList(Client.modeGame, Client.language, js5.CONFIG);
            VarcTypeList.instance = new VarcTypeList(Client.modeGame, Client.language, js5.CONFIG);
            VarBitTypeListClient.instance = new VarBitTypeListClient(Client.modeGame, Client.language, js5.CONFIG_STRUCT);
            VarPlayerTypeListClient.instance = new VarPlayerTypeListClient(Client.modeGame, Client.language, js5.CONFIG);
            VarClanSettingTypeList.instance = new VarClanSettingTypeList(Client.modeGame, Client.language, js5.CONFIG);
            VarClanTypeList.instance = new VarClanTypeList(Client.modeGame, Client.language, js5.CONFIG);
            InterfaceManager.init(js5.INTERFACES, js5.FONTMETRICS, js5.SPRITES, js5.MODELS);
            Static110.setBillboardJs5(js5.CONFIG_BILLBOARD);
            QuickChatCatTypeList.instance = new QuickChatCatTypeList(Client.language, js5.QUICKCHAT, js5.QUICKCHAT_GLOBAL);
            QuickChatPhraseTypeList.instance = new QuickChatPhraseTypeList(Client.language, js5.QUICKCHAT, js5.QUICKCHAT_GLOBAL, new SimpleFillerDecoder());
            PlayerEntity.initWornObjIds();
            LocTypeList.instance.setAnimateBackground(ClientOptions.instance.animateBackground.getValue() == 0);
            TimedVarDomain.instance = new TimedVarDomain();
            Static296.updateFeatureMask();
            Animator.setSeqTL(SeqTypeList.instance);
            ParticleManager.init(js5.CONFIG_PARTICLE);
            Static405.method5592(Js5TextureSource.instance, js5.MODELS);
            @Pc(1119) Huffman codec = new Huffman(js5.BINARY.getfile("huffman", ""));
            WordPack.setHuffman(codec);

            try {
                jagmisc.init();
            } catch (@Pc(1126) Throwable ignored) {
                /* empty */
            }

            GameShell.aClass27_1 = GameShell.method7550();
            SystemInfo.instance = new SystemInfo(true, GameShell.signLink);
        }
        if (LoadState.SETUP_STATIC_SPRITES == Static473.aLoadState_22) {
            local12 = Sprites.readyCount(js5.SPRITES) + FontTypeList.readyCount(true);
            local74 = Sprites.totalCount() + FontTypeList.totalCount();
            if (local12 < local74) {
                return local12 * 100 / local74;
            }
        }
        if (LoadState.SETUP_WORLD_MAP == Static473.aLoadState_22) {
            WorldMap.init(js5.WORLDMAPDATA, FloorOverlayTypeList.instance, FloorUnderlayTypeList.instance, LocTypeList.instance, MapElementTypeList.instance, MSITypeList.instance, TimedVarDomain.instance);
        }
        if (LoadState.SETUP_VARC_SYSTEM == Static473.aLoadState_22) {
            Static37.aStringArray4 = new String[VarcstrTypeList.instance.num];
            Static511.varcs = new int[VarcTypeList.instance.num];
            Static118.permVarcs = new boolean[VarcTypeList.instance.num];
            for (local12 = 0; local12 < VarcTypeList.instance.num; local12++) {
                if (VarcTypeList.instance.list(local12).temporary == 0) {
                    Static118.permVarcs[local12] = true;
                    Static319.permVarcCount++;
                }
                Static511.varcs[local12] = -1;
            }
            Static218.method3189();
            js5.MAPS.clearNames(false, true);
            js5.MIDI_SONGS.clearNames(true, true);
            js5.SPRITES.clearNames(true, true);
            js5.FONTMETRICS.clearNames(true, true);
            js5.BINARY.clearNames(true, true);
            js5.CONFIG.discardunpacked = 2;
            Client.cleanCaches = true;
            js5.CONFIG_ENUM.discardunpacked = 2;
            js5.CONFIG_LOC.discardunpacked = 2;
            js5.CONFIG_NPC.discardunpacked = 2;
            js5.CONFIG_OBJ.discardunpacked = 2;
            js5.CONFIG_SEQ.discardunpacked = 2;
            js5.CONFIG_SPOT.discardunpacked = 2;
        }
        if (Static473.aLoadState_22 == LoadState.LOAD_LOGIN_WINDOW) {
            if (!InterfaceList.load(GraphicsDefaults.instance.login_interface)) {
                return 0;
            }
            local184 = true;
            for (local74 = 0; local74 < InterfaceList.interfaces[GraphicsDefaults.instance.login_interface].length; local74++) {
                @Pc(1315) Component local1315 = InterfaceList.interfaces[GraphicsDefaults.instance.login_interface][local74];
                if (local1315.type == 5 && local1315.graphic != -1 && !js5.SPRITES.requestdownload(0, local1315.graphic)) {
                    local184 = false;
                }
            }
            if (!local184) {
                return 0;
            }
        }
        if (LoadState.SHOW_LOGIN_WINDOW == Static473.aLoadState_22) {
            InterfaceManager.openLogin(true);
        }
        if (LoadState.CLEANUP == Static473.aLoadState_22) {
            Static449.aLoadingScreenRenderer_1.method8372();
            try {
                Static242.aThread1.join();
            } catch (@Pc(1370) InterruptedException local1370) {
                return 0;
            }
            Static234.anLoadingScreenArray1 = null;
            Static449.aLoadingScreenRenderer_1 = null;
            js5.LOADING_SPRITES = null;
            js5.LOADING_SCREENS = null;
            Static242.aThread1 = null;
            Static333.aClass279_1 = null;
            Static9.method123();
            Static3.chooseSafeMode = ClientOptions.instance.safeMode.getValue() == 1;
            ClientOptions.instance.update(1, ClientOptions.instance.safeMode);
            if (Static3.chooseSafeMode) {
                ClientOptions.instance.update(0, ClientOptions.instance.toolkitDefault);
            } else if (ClientOptions.instance.toolkitDefault.dflt && SystemInfo.instance.totalMemory < 512 && SystemInfo.instance.totalMemory != 0) {
                ClientOptions.instance.update(0, ClientOptions.instance.toolkitDefault);
            }
            ClientOptions.save();
            if (Static3.chooseSafeMode) {
                Static32.setToolkit(ToolkitType.JAVA, false);
            } else {
                Static32.setToolkit(ClientOptions.instance.toolkitDefault.getValue(), false);
            }
            InterfaceManager.changeWindowMode(ClientOptions.instance.screenSizeDefault.getValue(), -1, false, -1);
            FontTypeList.method7549(Toolkit.active);
            Fonts.init(Toolkit.active);
            Sprites.init(js5.SPRITES, Toolkit.active);
            MiniMenu.setIcons(Sprites.nameIcons);
        }
        return Static694.method9030();
    }
}