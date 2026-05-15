package day10;

import java.util.Objects;

public class Name {
    String firstName;           					// 이름
    String lastName;            					// 성
    Name(String firstName, String lastName) {           	
        this.firstName = firstName;
        this.lastName = lastName;
    }
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
	}    
    
}
