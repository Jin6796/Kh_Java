package ajdbc.member3;

public class Member3VO {
	private int    mem_no = 0;
	private String mem_id = "";
	private String mem_pw = "";
	private String mem_name = "";
	private String mem_zipcode = "";
	private String mem_address = "";
	private String command = "";
	private int result = 0; // 1이면 입력|수정|삭제 성공, 0이면 실패
	
	int    mem_nos      [] = new int[5];
	String mem_ids      [] = new String[5];
	String mem_pws      [] = new String[5];
	String mem_names    [] = new String[5];
	String mem_zipcodes [] = new String[5];
	String mem_addresses[] = new String[5];
	
	public Member3VO() {
		
	}
	
	public Member3VO(String mem_id, String mem_pw, String mem_name, String mem_zipcode, String mem_address) {
		
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getMem_pw() {
		return mem_pw;
	}

	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	public String getMem_zipcode() {
		return mem_zipcode;
	}

	public void setMem_zipcode(String mem_zipcode) {
		this.mem_zipcode = mem_zipcode;
	}

	public String getMem_address() {
		return mem_address;
	}

	public void setMem_address(String mem_address) {
		this.mem_address = mem_address;
	}

	public int getMem_no() {
		return mem_no;
	}

	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}

	public String getCommand() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCommand(String string) {
		// TODO Auto-generated method stub
		
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	
	
}
