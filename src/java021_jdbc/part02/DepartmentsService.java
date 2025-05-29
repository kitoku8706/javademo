package java021_jdbc.part02;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import java021_jdbc.template.JdbcTemplate;

public class DepartmentsService {
	DepartmentsDAO dao = null;

	public DepartmentsService() {
		// TODO Auto-generated constructor stub
	}

	public List<DepartmentsDTO> getdepartmentsList() {
		List<DepartmentsDTO> aList = null;
		Connection conn = JdbcTemplate.getconnConnection();
		dao = DepartmentsDAO.getInstance();

		try {
			conn.setAutoCommit(false);
			aList = dao.getListMethod(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return aList;

	}

}
