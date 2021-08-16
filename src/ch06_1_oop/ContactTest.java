package ch06_1_oop;

public class ContactTest {
	public static void main(String[] args) {
		Contact contact = new Contact();
		contact.setName("ÇÏÇå¹Î");
		System.out.println(contact.getName());
		
		contact.setEmailAddress("hhm7761@naver.com");
		System.out.println(contact.getEmailAddress());
	}
}

class Contact {
	String emailAddress;
	String faxNumber;
	String name;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
