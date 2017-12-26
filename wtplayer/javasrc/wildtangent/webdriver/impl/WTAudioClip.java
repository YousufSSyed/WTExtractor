package wildtangent.webdriver.impl;

public class WTAudioClip extends wildtangent.webdriver.jni.WTAudioClip
    implements wildtangent.webdriver.WTAudioClip {

    public WTAudioClip(long cPtr, boolean cMemoryOwn) {
        super(cPtr, cMemoryOwn);
    }

    public WTAudioClip() {
        super();
    }


    public void start(boolean bl, boolean bl2) {
        this.start(bl ? 1 : 0, bl2 ? 1 : 0);
    }

    public void start(boolean bl) {
        this.start(bl ? 1 : 0, 0);
    }


    public void setOption(int n, Object object) {
        //this.internal_setOption(n, object);
        //this.setOption_xfer(n, object);
    }

    public void setOption(int n, boolean bl) {
        this.setOption(n, new Boolean(bl));
    }

    public void setOption(int n, double d) {
        this.setOption(n, new Double(d));
    }

    public void setOption(int n, float f) {
        this.setOption(n, new Float(f));
    }

    public void setOption(int n, int n2) {
        this.setOption(n, new Integer(n2));
    }

}
