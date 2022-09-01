
public class JNE extends Shipper implements ShipperInterface {
	//constructor
	public JNE() {
		name = "JNE";
	}
	
	public void sendPackage(Order order) {
		System.out.println("Paket " + order.getGoodsName()
		+ " telah dikirimkan oleh " + name);
	}
}
