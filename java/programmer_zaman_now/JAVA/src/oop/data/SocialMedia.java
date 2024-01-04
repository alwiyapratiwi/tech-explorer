package oop.data;

class SocialMedia {
	
	String name;

}

// final class
//final class Facebook extends SocialMedia {
//	
//}

//ERROR
//class FakeFacebook extends Facebook {
//	
//}

//final method
class Facebook extends SocialMedia {
	final void login(String username, String password) {
		
	}
}

class FakeFacebook extends Facebook {
//	ERROR 
//	void login(String username, String password) {
//		
//	}
}