package bankDemo;

public class 郵局帳號3 {

	private String 存款人;
	private String 帳號;
	private long 存款金額;
	
	public 郵局帳號3() {
		super();
	}

	//右鍵→source→generate constructor using fields

	public 郵局帳號3(String 存款人, String 帳號, long 存款金額) {
		super();
		this.存款人 = 存款人;
		this.帳號 = 帳號;
		set存款金額 ( 存款金額);
	}

	public long get存款金額() {
		return 存款金額;
	}

	public void set存款金額(long 存款金額) {
		
		if(存款金額<0) {
			System.out.println("非法輸入，請重新再輸入");
		}else {
			this.存款金額 = 存款金額;
		}
		
	}

	public String get存款人() {
		if(存款人!=null) {
			return 存款人+"先生/小姐";
		}else {
			return "匿名存款人";
		}
	}

	public String get帳號() {
		if (帳號 != null) {
			return 帳號.substring(0, 3)+"*****************";
		}else {
			return "帳號為空";
		}
		
	}
	

}
