package graphics.scenery.jopenvr;
import com.ochafik.lang.jnaerator.runtime.Union;
import com.sun.jna.Pointer;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VREvent_Data_t extends Union<VREvent_Data_t, VREvent_Data_t.ByValue, VREvent_Data_t.ByReference > {
	public VREvent_Reserved_t reserved;
	public VREvent_Controller_t controller;
	public VREvent_Mouse_t mouse;
	public VREvent_Scroll_t scroll;
	public VREvent_Process_t process;
	public VREvent_Notification_t notification;
	public VREvent_Overlay_t overlay;
	public VREvent_Status_t status;
	public VREvent_Keyboard_t keyboard;
	public VREvent_Ipd_t ipd;
	public VREvent_Chaperone_t chaperone;
	public VREvent_PerformanceTest_t performanceTest;
	public VREvent_TouchPadMove_t touchPadMove;
	public VREvent_SeatedZeroPoseReset_t seatedZeroPoseReset;
	public VREvent_Data_t() {
		super();
	}
	public VREvent_Data_t(VREvent_Reserved_t reserved) {
		super();
		this.reserved = reserved;
		setType(VREvent_Reserved_t.class);
	}
	public VREvent_Data_t(VREvent_Controller_t controller) {
		super();
		this.controller = controller;
		setType(VREvent_Controller_t.class);
	}
	public VREvent_Data_t(VREvent_Mouse_t mouse) {
		super();
		this.mouse = mouse;
		setType(VREvent_Mouse_t.class);
	}
	public VREvent_Data_t(VREvent_Scroll_t scroll) {
		super();
		this.scroll = scroll;
		setType(VREvent_Scroll_t.class);
	}
	public VREvent_Data_t(VREvent_Process_t process) {
		super();
		this.process = process;
		setType(VREvent_Process_t.class);
	}
	public VREvent_Data_t(VREvent_Notification_t notification) {
		super();
		this.notification = notification;
		setType(VREvent_Notification_t.class);
	}
	public VREvent_Data_t(VREvent_Overlay_t overlay) {
		super();
		this.overlay = overlay;
		setType(VREvent_Overlay_t.class);
	}
	public VREvent_Data_t(VREvent_Status_t status) {
		super();
		this.status = status;
		setType(VREvent_Status_t.class);
	}
	public VREvent_Data_t(VREvent_Keyboard_t keyboard) {
		super();
		this.keyboard = keyboard;
		setType(VREvent_Keyboard_t.class);
	}
	public VREvent_Data_t(VREvent_Ipd_t ipd) {
		super();
		this.ipd = ipd;
		setType(VREvent_Ipd_t.class);
	}
	public VREvent_Data_t(VREvent_Chaperone_t chaperone) {
		super();
		this.chaperone = chaperone;
		setType(VREvent_Chaperone_t.class);
	}
	public VREvent_Data_t(VREvent_PerformanceTest_t performanceTest) {
		super();
		this.performanceTest = performanceTest;
		setType(VREvent_PerformanceTest_t.class);
	}
	public VREvent_Data_t(VREvent_TouchPadMove_t touchPadMove) {
		super();
		this.touchPadMove = touchPadMove;
		setType(VREvent_TouchPadMove_t.class);
	}
	public VREvent_Data_t(VREvent_SeatedZeroPoseReset_t seatedZeroPoseReset) {
		super();
		this.seatedZeroPoseReset = seatedZeroPoseReset;
		setType(VREvent_SeatedZeroPoseReset_t.class);
	}
	public VREvent_Data_t(Pointer peer) {
		super(peer);
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected VREvent_Data_t newInstance() { return new VREvent_Data_t(); }
	public static VREvent_Data_t[] newArray(int arrayLength) {
		return Union.newArray(VREvent_Data_t.class, arrayLength);
	}
	public static class ByReference extends VREvent_Data_t implements com.ochafik.lang.jnaerator.runtime.Structure.ByReference {
		
	};
	public static class ByValue extends VREvent_Data_t implements com.ochafik.lang.jnaerator.runtime.Structure.ByValue {
		
	};
}