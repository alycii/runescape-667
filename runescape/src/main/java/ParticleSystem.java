import com.jagex.ParticleList;
import com.jagex.core.datastruct.Node;
import com.jagex.core.datastruct.key.Deque;
import com.jagex.core.datastruct.LinkedList;
import com.jagex.game.runetek6.config.effectortype.ParticleEffectorTypeList;
import com.jagex.game.runetek6.config.emittertype.ParticleEmitterTypeList;
import com.jagex.graphics.particles.ModelParticleEmitter;
import com.jagex.graphics.particles.ModelParticleEffector;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.particles.ParticleLimits;
import com.jagex.js5.js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class ParticleSystem extends Node {

    @OriginalMember(owner = "client!hv", name = "t", descriptor = "[Z")
    public static final boolean[] aBooleanArray7 = new boolean[32];

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "[Z")
    public static final boolean[] aBooleanArray6 = new boolean[8];

    @OriginalMember(owner = "client!kw", name = "y", descriptor = "I")
    public static int systemFreePtr = 0;

    @OriginalMember(owner = "client!jga", name = "l", descriptor = "I")
    public static int systemNextPtr = 0;

    @OriginalMember(owner = "client!rka", name = "Ob", descriptor = "I")
    public static int particleFreePtr = 0;

    @OriginalMember(owner = "client!sv", name = "L", descriptor = "I")
    public static int particleNextPtr = 0;

    @OriginalMember(owner = "client!kp", name = "w", descriptor = "Lclient!fla;")
    public static LinkedList systems;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "[Lclient!pp;")
    public static MovingParticle[] particleCache;

    @OriginalMember(owner = "client!pw", name = "G", descriptor = "I")
    public static int setting = 2;

    @OriginalMember(owner = "client!cka", name = "x", descriptor = "[Lclient!hv;")
    public static ParticleSystem[] systemCache;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!sb;I)V")
    public static void init(@OriginalArg(0) js5 configClient) {
        particleFreePtr = 0;
        particleNextPtr = 0;
        systems = new LinkedList();
        particleCache = new MovingParticle[1024];
        systemCache = new ParticleSystem[ParticleLimits.anIntArray265[setting] + 1];
        systemFreePtr = 0;
        systemNextPtr = 0;
        ParticleEmitterTypeList.setConfigClient(configClient);
        ParticleEffectorTypeList.setConfigClient(configClient);
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(IZ)Lclient!hv;")
    public static ParticleSystem create(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
        if (systemFreePtr == systemNextPtr) {
            return new ParticleSystem(arg0, arg1);
        } else {
            @Pc(6) ParticleSystem system = systemCache[systemNextPtr];
            systemNextPtr = systemNextPtr + 1 & ParticleLimits.anIntArray265[setting];
            system.init(arg0, arg1);
            return system;
        }
    }

    @OriginalMember(owner = "client!hv", name = "u", descriptor = "J")
    public long lastRunningCheck;

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "J")
    public long aLong133;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
    public int anInt4149;

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "Z")
    public boolean aBoolean324 = false;

    @OriginalMember(owner = "client!hv", name = "s", descriptor = "Z")
    public boolean aBoolean323 = false;

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "I")
    public int anInt4147 = 0;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "Lclient!fla;")
    public LinkedList emitters = new LinkedList();

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "I")
    public int anInt4148 = 0;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "Lclient!sia;")
    public Deque aDeque_22 = new Deque();

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "Z")
    public boolean aBoolean326 = false;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "Z")
    public boolean aBoolean325 = false;

    @OriginalMember(owner = "client!hv", name = "r", descriptor = "I")
    public int anInt4150 = 0;

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "Lclient!lk;")
    public final ParticleList aParticleList_1 = new ParticleList();

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "[Lclient!pp;")
    public final MovingParticle[] aMovingParticle = new MovingParticle[8192];

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(IZ)V")
    public ParticleSystem(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
        this.init(arg0, arg1);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!ha;J[Lclient!rv;[Lclient!mn;Z)V")
    public void method3643(@OriginalArg(0) Toolkit arg0, @OriginalArg(1) long arg1, @OriginalArg(2) ModelParticleEmitter[] arg2, @OriginalArg(3) ModelParticleEffector[] arg3) {
        if (!this.aBoolean324) {
            this.method3651(arg0, arg2);
            this.method3648(arg3);
            this.aLong133 = arg1;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "()V")
    public void method3644() {
        this.aBoolean323 = true;
    }

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "()Lclient!lk;")
    public ParticleList method3645() {
        return this.aParticleList_1;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!ha;)V")
    public void method3646(@OriginalArg(0) Toolkit arg0) {
        this.aParticleList_1.particles.clear();
        for (@Pc(10) ParticleEmitter local10 = (ParticleEmitter) this.emitters.first(); local10 != null; local10 = (ParticleEmitter) this.emitters.next()) {
            local10.method7263(this.lastRunningCheck, arg0);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "([Lclient!mn;Z)V")
    public void method3648(@OriginalArg(0) ModelParticleEffector[] arg0) {
        for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
            aBooleanArray6[local1] = false;
        }
        @Pc(21) int local21;
        label71:
        for (@Pc(16) ParticleEffector local16 = (ParticleEffector) this.aDeque_22.first(); local16 != null; local16 = (ParticleEffector) this.aDeque_22.next()) {
            if (arg0 != null) {
                for (local21 = 0; local21 < arg0.length; local21++) {
                    if (local16.aModelParticleEffector_1 == arg0[local21] || local16.aModelParticleEffector_1 == arg0[local21].aModelParticleEffector_2) {
                        aBooleanArray6[local21] = true;
                        local16.method1707();
                        continue label71;
                    }
                }
            }
            local16.unlink();
            this.anInt4150--;
            if (local16.isLinked2()) {
                local16.unlink2();
                Static654.anInt9740--;
            }
        }
        if (arg0 == null) {
            return;
        }
        for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt4150 != 8; local21++) {
            if (!aBooleanArray6[local21]) {
                @Pc(96) ParticleEffector local96 = null;
                if (arg0[local21].type().visibility == 1 && Static654.anInt9740 < 32) {
                    local96 = new ParticleEffector(arg0[local21], this);
                    Static519.aHashTable_1.put(local96, (long) arg0[local21].type);
                    Static654.anInt9740++;
                }
                if (local96 == null) {
                    local96 = new ParticleEffector(arg0[local21], this);
                }
                this.aDeque_22.addLast(local96);
                this.anInt4150++;
                aBooleanArray6[local21] = true;
            }
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(J)V")
    public void method3649(@OriginalArg(0) long arg0) {
        this.aLong133 = arg0;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "()Lclient!lk;")
    public ParticleList method3650() {
        this.aParticleList_1.particles.clear();
        for (@Pc(6) int local6 = 0; local6 < this.aMovingParticle.length; local6++) {
            if (this.aMovingParticle[local6] != null && this.aMovingParticle[local6].aParticleEmitter_1 != null) {
                this.aParticleList_1.particles.add(this.aMovingParticle[local6]);
            }
        }
        return this.aParticleList_1;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!ha;[Lclient!rv;Z)V")
    public void method3651(@OriginalArg(0) Toolkit arg0, @OriginalArg(1) ModelParticleEmitter[] arg1) {
        for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
            aBooleanArray7[local1] = false;
        }
        @Pc(21) int local21;
        label62:
        for (@Pc(16) ParticleEmitter local16 = (ParticleEmitter) this.emitters.first(); local16 != null; local16 = (ParticleEmitter) this.emitters.next()) {
            if (arg1 != null) {
                for (local21 = 0; local21 < arg1.length; local21++) {
                    if (local16.model == arg1[local21] || local16.model == arg1[local21].aModelParticleEmitter_2) {
                        aBooleanArray7[local21] = true;
                        local16.method7264();
                        local16.aBoolean630 = false;
                        continue label62;
                    }
                }
            }
            if (local16.anInt8268 == 0) {
                local16.unlink();
                this.anInt4148--;
            } else {
                local16.aBoolean630 = true;
            }
        }
        if (arg1 == null) {
            return;
        }
        for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt4148 != 32; local21++) {
            if (!aBooleanArray7[local21]) {
                @Pc(104) ParticleEmitter local104 = new ParticleEmitter(arg0, arg1[local21], this, this.aLong133);
                this.emitters.add(local104);
                this.anInt4148++;
                aBooleanArray7[local21] = true;
            }
        }
    }

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "()V")
    public void method3652() {
        this.aBoolean324 = true;
        for (@Pc(8) ParticleEffector local8 = (ParticleEffector) this.aDeque_22.first(); local8 != null; local8 = (ParticleEffector) this.aDeque_22.next()) {
            if (local8.aParticleEffectorType_1.visibility == 1) {
                local8.unlink2();
            }
        }
        for (@Pc(27) int i = 0; i < this.aMovingParticle.length; i++) {
            if (this.aMovingParticle[i] != null) {
                this.aMovingParticle[i].method6697();
                this.aMovingParticle[i] = null;
            }
        }
        this.anInt4147 = 0;
        this.emitters = new LinkedList();
        this.anInt4148 = 0;
        this.aDeque_22 = new Deque();
        this.anInt4150 = 0;
        this.unlink();
        systemCache[systemFreePtr] = this;
        systemFreePtr = systemFreePtr + 1 & ParticleLimits.anIntArray265[setting];
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!ha;J)Z")
    public boolean isRunning(@OriginalArg(0) Toolkit toolkit, @OriginalArg(1) long time) {
        if (this.aLong133 == this.lastRunningCheck) {
            this.method3655();
        } else {
            this.method3644();
        }

        if (time - this.aLong133 > 750L) {
            this.method3652();
            return false;
        }

        @Pc(27) int local27 = (int) (time - this.lastRunningCheck);
        @Pc(36) ParticleEmitter emitter;

        if (this.aBoolean326) {
            for (emitter = (ParticleEmitter) this.emitters.first(); emitter != null; emitter = (ParticleEmitter) this.emitters.next()) {
                for (@Pc(39) int i = 0; i < emitter.type.startupTicks; i++) {
                    emitter.method7261(1, !this.aBoolean323, time, toolkit);
                }
            }
            this.aBoolean326 = false;
        }

        for (emitter = (ParticleEmitter) this.emitters.first(); emitter != null; emitter = (ParticleEmitter) this.emitters.next()) {
            emitter.method7261(local27, !this.aBoolean323, time, toolkit);
        }

        this.lastRunningCheck = time;
        return true;
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "()V")
    public void method3655() {
        this.aBoolean323 = false;
    }

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "()V")
    public void method3656() {
        this.aBoolean326 = true;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZ)V")
    public void init(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
        systems.add(this);
        this.aLong133 = (long) arg0;
        this.lastRunningCheck = (long) arg0;
        this.aBoolean326 = true;
        this.aBoolean325 = arg1;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIII)V")
    public void method3658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
        this.anInt4149 = arg0;
    }
}
