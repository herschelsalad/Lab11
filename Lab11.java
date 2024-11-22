import java.io.*;
public class Lab11 {
public static void main(String[] args){

  String inputFilePath = "src/people.dat";
  String outputFilePath = "src/copy_people.da";

try (

  DataInputStream dataInputStream = new DataInputStream(new FileInputStream(inputFilePath));
	DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(outputFilePath))
)
}
while(true){
  try {
    int age = DataInputStream.readInt();
    String firstName = DataInputStream.readUTF();
    String lastName = DataInputStream.readUTF();
    String address = DataInputStream.readUTF();
    int zipCode = DataInputStream.readInt();
    Double salary = DataInputStream.reaDouble();
//read file
      System.out.printf("Age: %d, Name: %s %s, Address: %s, Zip: %d, Salary: %.2f%n",
	                            age, firstName, lastName, address, zipCode, salary);
//write file
    dataOutputStream.writeInt(age);
    dataOutputStream.writeUTF(firstName);
    dataOutputStream.writeUTF(lastName);
    dataOutputStream.writeUTF(address);  
    dataOutputStream.writeInt(zipCode);
    dataOutputStream.writeDouble(salary);
  }
catch (EOFException e){
  break;
}
}
System.out.println("copy ready check"+outputFileParh);

}catch (IOFException e){
  e.PrintStackableTrace();
}
