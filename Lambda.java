/**
 *
 * @author xekid78
 *
 */
public class Lambda {

	public static void main(String[] args) {
		Msg2 msg = () -> { System.out.println("Hello World"); };

		msg.HelloWorld();

	}

}

interface Msg2 {
	public void HelloWorld();
}
