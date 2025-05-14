public class Android {
	public static void main(String[] args) {
		SmartPhone android = new SmartPhone();
		System.out.println("Android スマートフォンを操作します。");

		android.play();
		android.stop();
		android.next();
		android.back();
		android.call();
		android.mail();
		android.photo();
		android.internet();
	}
}
