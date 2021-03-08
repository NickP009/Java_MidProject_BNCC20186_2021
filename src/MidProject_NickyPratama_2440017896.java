import java.util.Scanner;
import java.util.Random; 

public class MidProject_NickyPratama_2440017896
{

public static void main(String[] args)
{

	static Employee[] empl = new Employee[100];
    static int i = 0;

    public static void main1(String[] args)
    {
    	getMenu();
    }

    public static void getMenu()
    {
    	Scanner sc = new Scanner(System.in);
    	while (true)
    	{

        int select;
        System.out.println("1. Add Employee Data");
        System.out.println("2. View Employee Data");
        System.out.println("3. Update Employee Data");
        System.out.println("4. Delete Employee Data");
        System.out.println("0. Exit");
        select = sc.nextInt();

        switch (select)
        {
        case 1:
        addEmp(empl);

        break;
        case 2:
        viewEmp(empl);

        break;
        
        case 3:
        break;
        
        case 4:
        break;
        
        case 0:
        return;
        
        default:
        System.out.println("Invalid Option");
        }
    }

    }

    public static void addEmp(Employee[] emp)
    {
    Scanner sc = new Scanner(System.in);
    int numID, year;
    String userName, course;

    int addMore;

    do
    {

        System.out.println("1. Masukkan No: ");
        ID = sc.nextLine();
        System.out.println("2. Masukkan  Name");
        userName = sc.nextLine();
        System.out.println("3. Masukkan Jenis Kelamin");
        course = sc.nextLine();
        System.out.println("4. Masukkan Jabatan");
        year = sc.nextInt();
        empl[i] = new Employee(ID, year, userName, course);
        ++i;

        System.out.println("Untuk menambahkan input 1");
        addMore = sc.nextInt();
    } 
    while (addMore == 1);
    }

    public static void viewEmp(Employee[] emp)
    {
    	
    	for (Employee element : emp) 
    	{
    		if (null != element) 
    		{
    			System.out.println("Nomor Karyawan: " + element.getID());
    			System.out.println("Kode Karyawan: " + element.getrandomString());
    			System.out.println("Nama Karyawan: " + element.getUserName());
    			System.out.println("Jenis Kelamin: " + element.getgnd());
    			System.out.println("Jabatan : " + element.getJob());
    			System.out.println("Gaji : " + element.getgaji() + "\n");
    		}
    	}
    }
}

