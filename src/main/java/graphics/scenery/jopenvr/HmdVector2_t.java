package graphics.scenery.jopenvr;
import com.ochafik.lang.jnaerator.runtime.Structure;
import com.sun.jna.Pointer;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class HmdVector2_t extends Structure<HmdVector2_t, HmdVector2_t.ByValue, HmdVector2_t.ByReference > {
	/** float[2] */
	public float[] v = new float[2];
	public HmdVector2_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("v");
	}
	public HmdVector2_t(float v[]) {
		super();
		if ((v.length != this.v.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.v = v;
	}
	public HmdVector2_t(Pointer peer) {
		super(peer);
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected HmdVector2_t newInstance() { return new HmdVector2_t(); }
	public static HmdVector2_t[] newArray(int arrayLength) {
		return Structure.newArray(HmdVector2_t.class, arrayLength);
	}
	public static class ByReference extends HmdVector2_t implements Structure.ByReference {
		
	};
	public static class ByValue extends HmdVector2_t implements Structure.ByValue {
		
	};
}