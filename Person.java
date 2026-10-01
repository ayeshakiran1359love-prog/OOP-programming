public class Person{

private String id="SP26-BAI-055";
private String name;
private String email;
private String dob;
private String city;
   Person (String name,String email,String dob,String city){
this.name=name;
this.email=email;
this.dob=dob;
this.city=city;}

Person (String name,String email,String dob){
this.name=name;
this.email=email;
this.dob=dob;}

public void display(){
System.out.println("ID:"+id);
System.out.println("Name:"+name);
System.out.println("Email:"+email);
System.out.println("DOB:"+dob);
System.out.println("City:"+city);
}


}