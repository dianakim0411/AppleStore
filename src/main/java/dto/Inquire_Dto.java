package dto;

public class Inquire_Dto {

			int inquire_code;
			String cust_id;
			String product_code;
			String inquire_date;
			String inquire_content;
			String answer_content;
			
			
			
			public Inquire_Dto() {
				// TODO Auto-generated constructor stub
			}
			
			
			
			
			public Inquire_Dto(int inquire_code, String cust_id, String product_code, String inquire_date,
					String inquire_content, String answer_content) {
				super();
				this.inquire_code = inquire_code;
				this.cust_id = cust_id;
				this.product_code = product_code;
				this.inquire_date = inquire_date;
				this.inquire_content = inquire_content;
				this.answer_content = answer_content;
			}




			public int getInquire_code() {
				return inquire_code;
			}




			public void setInquire_code(int inquire_code) {
				this.inquire_code = inquire_code;
			}




			public String getCust_id() {
				return cust_id;
			}




			public void setCust_id(String cust_id) {
				this.cust_id = cust_id;
			}




			public String getProduct_code() {
				return product_code;
			}




			public void setProduct_code(String product_code) {
				this.product_code = product_code;
			}




			public String getInquire_date() {
				return inquire_date;
			}




			public void setInquire_date(String inquire_date) {
				this.inquire_date = inquire_date;
			}




			public String getInquire_content() {
				return inquire_content;
			}




			public void setInquire_content(String inquire_content) {
				this.inquire_content = inquire_content;
			}




			public String getAnswer_content() {
				return answer_content;
			}




			public void setAnswer_content(String answer_content) {
				this.answer_content = answer_content;
			}
			
	
	
	
}
