package java021_jdbc.part03;

import java.util.HashMap;
import java.util.List;

public class MemController {
	private MemService service;
	
	public MemController() {
		service =new MemService();
	
	}
	public int deleteExecute(int num) {
		return service.getDeleteProcess(num);
	}
	
	public int updateExecute(HashMap<String, Object> hMap) { //MemDTO dto
		return service.getUpdateprocess(hMap);
		
	}
	public int insertExecute(MemDTO dto) {
		return service.getInsertProcess(dto);
	}
	
	public List<MemDTO> listExecute(){
		return service.getListProcess();
	}
	
	
}
