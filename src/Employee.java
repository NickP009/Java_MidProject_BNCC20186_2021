import java.util.Random; 

public class Employee
{


		private String ID, Job, userName, gnd, randomString;
		private int gaji, length;

		public Employee(String ID, String userName, String gnd, String Job, int gaji, int length, String randomString)
		{

		    this.ID = ID;
		    this.Job = Job;
		    this.userName = userName;
		    this.gnd = gnd;
		    this.gaji = gaji;

		}


		public String getID()
		{
		    return ID;
		}

		public void setID(String ID)
		{
		    this.ID = ID;
		}

		public String getUserName()
		{
		    return userName;
		}

		public void setUserName(String userName)
		{
		    this.userName = userName;
		}

		public String getgnd()
		{
		    return gnd;
		}
		
		public void setgnd(String gnd)
		{
		    this.gnd = gnd;
		}
		
		public String getJob()
		{
		    return Job;
		}
		
		public void setJob(String Job)
		{
		    this.Job = Job;
		}
		
		if(Job.equals("Manager"))
		{
			gaji = 8000000;
		}
		
		else if(Job.equals("Supervisor"))
		{
			gaji = 6000000;
		}
		
		else if(Job.equals("Admin"))
		{
			gaji = 4000000;
		}
		
		String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	    String num = "0123456789";

	    String alphaNumeric = Alphabet + num;

	    StringBuilder sb = new StringBuilder();

	    Random random = new Random();

	    length = 7;

	    for(int i = 0; i < length; i++)
	    {

	      int index = random.nextInt(alphaNumeric.length());

	      char randomChar = alphaNumeric.charAt(index);

	      sb.append(randomChar);
	    }

	    randomString = sb.toString();

}