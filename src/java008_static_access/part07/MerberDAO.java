package java008_static_access.part07;

public class MerberDAO {
	
	public MerberDAO() {

	}

	
	private static MerberDAO dao = new MerberDAO();

	public static MerberDAO getInstance() {
		return dao;
	}

	public void display() {
		System.out.println("display");
	}

}
