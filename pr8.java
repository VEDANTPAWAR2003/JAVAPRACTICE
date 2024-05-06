class College{
	String clgName;
	
	College(String clgName){
		this.clgName = clgName;
	}
	

 class Department{
	String deptName;
	
	Department(String deptName){
		this.deptName = deptName;
	}
	
	
	public static void main(String args[]){
		College sggs1 = new College("sggs uni");
		
		System.out.println(sggs1.clgName);
		
		Department d1 = sggs1.new Department("IT department");
		
		
		System.out.println("hello" +sggs1);

	}
}
}
