package assignment;

class Sports {
	String getName() {
		return "Genertic Sports";
	}
	
	void getNumberOfTeamMembers() {
		System.out.println("Each team has n players in " + getName());
	}
}

class Soccer extends Sports {
	String getName() {
		return "Soccer Class";
	}
	
	void getNumberOfTeamMembers() {
		System.out.println("Each team has 11 players in " + getName());
	}
}

class Solution {
	
	public static void main(String []args) {
		Sports c1 = new Sports();
		Sports c2 = new Soccer();
		System.out.println(c1.getName());
		c1.getNumberOfTeamMembers();
		System.out.println(c2.getName());
		c2.getNumberOfTeamMembers();
	}
}