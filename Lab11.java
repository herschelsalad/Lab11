import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Lab11 {
	public static void main(String[] args) {

		String inputFilePath = "src/people.dat";
		String outputFilePath = "src/copy_people.da";

		try (

				DataInputStream dataInputStream = new DataInputStream(new FileInputStream(inputFilePath));
				DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(outputFilePath))) {

			int age = dataInputStream.readInt();
			String firstName = dataInputStream.readUTF();
			String lastName = dataInputStream.readUTF();
			String fullName = firstName + "" + lastName;
			String address = dataInputStream.readUTF();
			int zipCode = dataInputStream.readInt();
			double salary = dataInputStream.readDouble();
			System.out.println("Age: " + age + "\nName: " + fullName + "\nAddress: " + address + "\nZip: " + zipCode
					+ "\nSalary: " + salary);
			while (true) {

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
