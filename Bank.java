package collectionconstructor;
import java.util.List;
import java.util.Set;
import java.util.Map;
public class Bank {
private int id;
private String name;
List<String>bankname;
Set<Integer>bankid;
Map<Integer,String>bankidname;
public Bank(int id, String name, List<String> bankname, Set<Integer> bankid, Map<Integer, String> bankidname) {
	super();
	this.id = id;
	this.name = name;
	this.bankname = bankname;
	this.bankid = bankid;
	this.bankidname = bankidname;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getBankname() {
	return bankname;
}
public void setBankname(List<String> bankname) {
	this.bankname = bankname;
}
public Set<Integer> getBankid() {
	return bankid;
}
public void setBankid(Set<Integer> bankid) {
	this.bankid = bankid;
}
public Map<Integer, String> getBankidname() {
	return bankidname;
}
public void setBankidname(Map<Integer, String> bankidname) {
	this.bankidname = bankidname;
}
@Override
public String toString() {
	return "Bank [id=" + id + ", name=" + name + ", bankname=" + bankname + ", bankid=" + bankid + ", bankidname="
			+ bankidname + "]";
}

}
