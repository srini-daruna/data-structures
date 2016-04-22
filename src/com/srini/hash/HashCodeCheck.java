 package com.srini.hash;

public class HashCodeCheck {
    
    public static void main(String... args)
    {
	TestClass object1 = new TestClass();
	object1.setName("Srini");
	object1.setUserId("sdaruna");
	object1.setRole("role2");
	
	TestClass object2 = new TestClass();
	object2.setName("Srini");
	object2.setUserId("sdaruna");
	object2.setRole("role3");
	
	if(object1.equals(object2))
	{
	    System.out.println("they are equal" + " object 1 hashcode is " + object1.getHashCode() + " object2 hashcode is " + object2.getHashCode());
	}else
	{
	    System.out.println("they are not equal" + " object 1 hashcode is " + object1.getHashCode() + " object2 hashcode is " + object2.getHashCode());
	}
	
    }

}


class TestClass
{
    String userId;
    String name;
    String role;
    
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((userId == null) ? 0 : userId.hashCode());
	return result;
    }
    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	TestClass other = (TestClass) obj;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	if (userId == null) {
	    if (other.userId != null)
		return false;
	} else if (!userId.equals(other.userId))
	    return false;
	return true;
    }
    
    public Long getHashCode() {
	final Long prime = 31L;
	Long result = 1L;
	result = prime * result
			+ ((userId == null) ? 0 : userId.hashCode());
	result = prime * result + ((userId == null) ? 0 : userId.hashCode());
	result = prime * result
			+ ((name == null) ? 0 : name.hashCode());
	return result;
}
    
    
}