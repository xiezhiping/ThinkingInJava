package reusingclass;

public class SpaceShipDelegation {

	private String name;
	private SpaceShipControls controls = new SpaceShipControls();
	public SpaceShipDelegation(String name) {
		this.name = name;
	}
	// ����ĸ��÷���
	public void up(int velocity) {
		controls.up(velocity);
	}
	public void down(int velocity) {
		controls.down(velocity);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SpaceShipDelegation("Hello").up(100);;
	}

}
