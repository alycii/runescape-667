package com.jagex.graphics;

import com.jagex.ParticleList;
import com.jagex.Class67;
import com.jagex.IndexedImage;
import com.jagex.Interface26;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.Canvas;
import java.awt.Rectangle;

@OriginalClass("client!ha")
public abstract class Toolkit {

    private static final int COUNT = 8;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "[Z")
    public static final boolean[] inuse = new boolean[COUNT];

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Lclient!ha;")
    public static Toolkit active;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Lclient!d;")
    public final TextureSource textureSource;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public final int index;

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!d;)V")
    public Toolkit(@OriginalArg(0) TextureSource source) {
        this.textureSource = source;

        @Pc(6) int freeIndex = -1;
        for (@Pc(8) int i = 0; i < COUNT; i++) {
            if (!inuse[i]) {
                inuse[i] = true;
                freeIndex = i;
                break;
            }
        }

        if (freeIndex == -1) {
            throw new IllegalStateException("NFTI");
        } else {
            this.index = freeIndex;
        }
    }

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

    /**
     * verticalLine
     */
    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void P(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int colour, @OriginalArg(4) int arg4);

    /**
     * setZPlanes
     */
    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void f(@OriginalArg(0) int near, @OriginalArg(1) int far);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method7935(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()Z")
    public abstract boolean method7936();

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()Z")
    public abstract boolean method7937();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!za;)V")
    public abstract void method7938(@OriginalArg(0) Node_Sub13 arg0);

    /**
     * fillRect
     */
    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void aa(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int colour, @OriginalArg(5) int mode);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!gaa;)V")
    public abstract void method7939(@OriginalArg(0) Interface9 arg0);

    /**
     * setClipping
     */
    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void KA(@OriginalArg(0) int x1, @OriginalArg(1) int y1, @OriginalArg(2) int x2, @OriginalArg(3) int y2);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
    public final void free() {
        inuse[this.index] = false;
        this.method7987();
    }

    /**
     * getClipping
     */
    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void K(@OriginalArg(0) int[] arg0);

    /**
     * createPointLight
     */
    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lclient!lca;")
    public abstract PointLight method7941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
    public abstract void method7942(@OriginalArg(0) int x1, @OriginalArg(1) int y1, @OriginalArg(2) int x2, @OriginalArg(3) int y2, @OriginalArg(4) int colour, @OriginalArg(6) ClippingMask mask, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10);

    /**
     * polyCount
     */
    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int I();

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()V")
    public abstract void restoreSurface();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method7944(@OriginalArg(0) int[] arg0);

    /**
     * offheapSize
     */
    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int E();

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIBI)V")
    public final void outlineRect(@OriginalArg(5) int x, @OriginalArg(0) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(1) int colour) {
        this.outlineRect(x, y, width, height, colour, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III[III)Lclient!st;")
    public final Sprite createSprite(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
        return this.method7958(arg3, arg1, arg0, arg2, true);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method7947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!wp;Z)Lclient!st;")
    public abstract Sprite createSprite(@OriginalArg(0) IndexedImage arg0, @OriginalArg(1) boolean arg1);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()Z")
    public abstract boolean method7949();

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()V")
    public abstract void method7950();

    /**
     * setSubclipping
     */
    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
    public abstract void line(@OriginalArg(0) int x1, @OriginalArg(1) int y1, @OriginalArg(2) int x2, @OriginalArg(3) int y2, @OriginalArg(4) int colour, @OriginalArg(5) int mode);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!dv;IIII)Lclient!ka;")
    public abstract Model createModel(@OriginalArg(0) Mesh mesh, @OriginalArg(1) int functionMask, @OriginalArg(2) int featureMask, @OriginalArg(3) int ambient, @OriginalArg(4) int contrast);

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()Lclient!tt;")
    public abstract Matrix createMatrix();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
    public final void line(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
        this.line(arg4, arg1, arg2, arg0, arg3, 1);
    }

    /**
     * resetClipping
     */
    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void la();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()I")
    public abstract int getMaxLights();

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)V")
    public abstract void method7956(@OriginalArg(0) int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lclient!st;")
    public abstract Sprite method7958(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method7959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
    public abstract int compareFunctionMasks(@OriginalArg(0) int maskA, @OriginalArg(1) int maskB);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)Lclient!za;")
    public abstract Node_Sub13 method7961(@OriginalArg(0) int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lclient!eca;")
    public abstract Surface method7962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lclient!st;")
    public abstract Sprite createSprite(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lclient!st;")
    public abstract Sprite createSprite(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

    /**
     * setGlobalSun
     */
    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void ZA(@OriginalArg(0) int colour, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

    /**
     * cls
     */
    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void GA(@OriginalArg(0) int colour);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
    public abstract void method7965(@OriginalArg(0) int x1, @OriginalArg(1) int y1, @OriginalArg(2) int x2, @OriginalArg(3) int y2, @OriginalArg(4) int colour, @OriginalArg(6) ClippingMask mask, @OriginalArg(7) int offsetX, @OriginalArg(8) int offsetY);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIBI)V")
    public final void method7966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
        this.za(arg2, arg0, arg3, arg1, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!lk;I)V")
    public abstract void renderOrtho(@OriginalArg(0) ParticleList arg0, @OriginalArg(1) int arg1);

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()Z")
    public abstract boolean increaseRenderDistance();

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()V")
    public abstract void method7969();

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
    public abstract boolean supportsBloom();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIBII)V")
    public final void fillRect(@OriginalArg(4) int x, @OriginalArg(2) int y, @OriginalArg(0) int width, @OriginalArg(1) int height, @OriginalArg(5) int colour) {
        this.aa(x, y, width, height, colour, 1);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method7972(@OriginalArg(0) Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!pu;)V")
    public abstract void method7973(@OriginalArg(0) Class67 arg0);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()V")
    public abstract void method7974();

    /**
     * setZWrite
     */
    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void C(@OriginalArg(0) boolean arg0);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)V")
    public abstract void flip(@OriginalArg(0) int x, @OriginalArg(1) int y) throws Exception_Sub1;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V")
    public abstract void outlineRect(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int colour, @OriginalArg(5) int mode);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public abstract void tick(@OriginalArg(0) int time);

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
    public abstract boolean method7978();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
    public abstract boolean method7979();

    /**
     * getArea
     */
    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()V")
    public abstract void stopBloom();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()Lclient!dp;")
    public abstract Renderer renderer();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
    public abstract boolean method7983();

    /**
     * horizontalLine
     */
    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void U(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int height, @OriginalArg(3) int colour, @OriginalArg(4) int arg4);

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public final void flip() throws Exception_Sub1 {
        this.flip(0, 0);
    }

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()Lclient!tt;")
    public abstract Matrix scratchMatrix();

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)Lclient!wja;")
    public abstract Interface26 method7986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
    @Override
    public void finalize() {
        this.free();
    }

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()V")
    protected abstract void method7987();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!eca;Lclient!wja;)Lclient!gaa;")
    public abstract Interface9 method7988(@OriginalArg(0) Surface arg0, @OriginalArg(1) Interface26 arg1);

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] Y();

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public abstract void setTextureSize(@OriginalArg(0) int size);

    /**
     * zFar
     */
    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int XA();

    /**
     * modelCount
     */
    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int M();

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()Z")
    public abstract boolean method7990();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIZI)V")
    public final void horizontalLine(@OriginalArg(0) int y, @OriginalArg(1) int colour, @OriginalArg(2) int x, @OriginalArg(4) int height) {
        this.U(x, y, height, colour, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
    public abstract boolean method7992();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method7993(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method7994();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method7995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
    public abstract Ground createGround(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public abstract void method7997(@OriginalArg(0) boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
    public final void verticalLine(@OriginalArg(0) int width, @OriginalArg(1) int y, @OriginalArg(2) int colour, @OriginalArg(3) int x) {
        this.P(x, y, width, colour, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!tt;)V")
    public abstract void setCamera(@OriginalArg(0) Matrix matrix);

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "()Z")
    public abstract boolean method8001();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!st;I)V")
    public final void method8002(@OriginalArg(0) Sprite arg0) {
        this.method7939(this.method7988(arg0, this.method7986(arg0.getWidth(), arg0.getHeight())));
    }

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void pa();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public abstract void method8003();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Lclient!aa;")
    public abstract ClippingMask createMask(@OriginalArg(0) int width, @OriginalArg(1) int height, @OriginalArg(2) int[] offsets, @OriginalArg(3) int[] widths);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB[Ljava/awt/Rectangle;)V")
    public final void method8005(@OriginalArg(0) int arg0, @OriginalArg(2) Rectangle[] arg1) throws Exception_Sub1 {
        this.method8011(arg1, arg0, 0, 0);
    }

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
    public abstract boolean hardShadow();

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

    /**
     * fillCircle
     */
    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    protected abstract void za(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int radius, @OriginalArg(3) int colour, @OriginalArg(4) int mode);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!pu;Lclient!pu;FLclient!pu;)Lclient!pu;")
    public abstract Class67 method8007(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class67 arg3);

    /**
     * setGlobalAmbient
     */
    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void xa(@OriginalArg(0) float globalAmbient);

    /**
     * clearZBuffer
     */
    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void ya();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)Lclient!pu;")
    public abstract Class67 method8008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lclient!lca;)V")
    public abstract void method8009(@OriginalArg(0) int arg0, @OriginalArg(1) PointLight[] arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ve;[Lclient!wp;Z)Lclient!da;")
    public abstract Font createFont(@OriginalArg(0) FontMetrics arg0, @OriginalArg(1) IndexedImage[] arg1, @OriginalArg(2) boolean arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method8011(@OriginalArg(0) Rectangle[] rectangles, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1;

    /**
     * clsMasked
     */
    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILclient!aa;II)V")
    public abstract void A(@OriginalArg(0) int colour, @OriginalArg(1) ClippingMask clippingMask, @OriginalArg(2) int x, @OriginalArg(3) int y);

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()V")
    public abstract void cacheReset();

    /**
     * combineFunctionMasks
     */
    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)I")
    public abstract int combineFunctionMasks(@OriginalArg(0) int maskA, @OriginalArg(1) int maskB);

    /**
     * zNear
     */
    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int i();

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
    public abstract boolean bloom();

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()Z")
    public abstract boolean method8015();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public abstract void method8016(@OriginalArg(0) int arg0);

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()Lclient!tt;")
    public abstract Matrix method8017();

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public abstract void method8018(@OriginalArg(0) boolean arg0);

    /**
     * setProjection
     */
    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void DA(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height);

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void X(@OriginalArg(0) int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method8019(@OriginalArg(0) Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "(I)V")
    public abstract void method8020(@OriginalArg(0) int arg0);

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!lk;)V")
    public abstract void render(@OriginalArg(0) ParticleList arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method8022(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
