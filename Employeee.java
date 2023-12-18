class Employeee{
int empId;
String name;
double salary;
public double getSalary()
{
return salary;
}
public void setSalary(double salary)
{
this.salary=salary;
}
public int getEmpId()
{
return empId;
}
public void setEmpId(int empId)
{
this.empId=empId;
}
public String getName()
{
return name;
}
public void setName(String name)
{
this.name=name;
}
}
class PermanentEmployee extends Employeee{
double basicPay,hra;
int experience;
public double getBasicPay(){
return basicPay;
}
public void setBasicPay(double basicPay){
this.basicPay=basicPay;
}
public double getHra(){
return hra;
}
public void setHra(double hra){
this.hra=hra;
}
public int getExperience(){
return experience;
}
public void setExperience(int experience){
this.experience=experience;
}
public void calculateSalary(){
double varCom;
if(experience<3){
varCom=0;
}
else if((experience>=3) && (experience<5)){
varCom=basicPay*0.05;
}
else if((experience>=5) && (experience>7)){
varCom=basicPay*0.07;
}
else{
varCom=basicPay*0.12;
}
salary=varCom+basicPay+hra;
System.out.println("Permanent Employee : Your salary is: "+salary);
}
}
class ContractEmployee extends Employeee{
double wages;
int hours;
public double getWages(){
return wages;
}
public void setWages(double wages){
this.wages=wages;
}
public int getHours(){
return hours;
}
public void setHours(int hours){
this.hours=hours;
}
public void calculateSalary(){
System.out.println("Contract Employee: Your salary is: "+(hours*wages));
}
}
class EmployeeRecords{
public static void main(String args[]){
PermanentEmployee pemp=new PermanentEmployee();
pemp.setName("Anil");
pemp.setEmpId(101);
pemp.setBasicPay(10000);
pemp.setHra(1500);
pemp.setExperience(3);
pemp.calculateSalary();
ContractEmployee cemp=new ContractEmployee();
cemp.setName("Ankit");
cemp.setEmpId(102);
cemp.setWages(500);
cemp.setHours(10);
cemp.calculateSalary();
}
}