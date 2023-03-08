package maincourse;

import java.util.*;
import java.io.*;
public class Helper {
	
	public void searchFile(String file)
	{
		File directory = new File("C:\\Users\\rvissanagan\\CourseProject1\\Module1Project\\FileRepository");
        String[] flist = directory.list();
        int flag = 0;
        if (flist == null) {
            System.out.println("Empty directory.");
        }
        else {
  
            // Linear search in the array
            for (int i = 0; i < flist.length; i++) {
                String filename = flist[i];
                if (filename.equalsIgnoreCase(file)) {
                    System.out.println(filename + " has been found");
                    flag = 1;
                    break;
                }
            }
        }
  
        if (flag == 0) {
            System.out.println("File Not Found");
        }
    }
	public void addFile(String path) throws IOException
	{
		String f = "C:\\Users\\rvissanagan\\CourseProject1\\Module1Project\\FileRepository";
		File f1 = new File(f);
		File newfile = new File(f,path);
		if(newfile.exists())
		{
			System.out.println("File already Exists");
		}
		else {
			try (
				FileOutputStream fstream = new FileOutputStream(newfile);
				DataOutputStream data = new DataOutputStream(fstream)){
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("File Created...!");
		}
	}
	public void ViewFiles()
	{
		String path = "C:\\Users\\rvissanagan\\CourseProject1\\Module1Project\\FileRepository";
		ArrayList<String> al = new ArrayList<String>();
		try {
		File file = new File(path);
	    File filesList[] = file.listFiles();
	    System.out.println("List of files and directories in the specified directory:");
	    for(File f : filesList) {
	         al.add(f.getName());
	      }
	    Collections.sort(al);
	    System.out.println("----------------------------------");
	    System.out.println("The files in the given Path are : ");
	    for(String s:al)
	    {
	    	System.out.println(s);
	    }
	    System.out.println("----------------------------------");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	   }
	public void deleteFile(String Path)
	{
		String p = "C:\\Users\\rvissanagan\\CourseProject1\\Module1Project\\FileRepository";
		File myobj = new File(p);
		try  
		{         
		File f= new File(myobj,Path);       
		if(f.exists()==false) {
			System.out.println("File Doesnt Exits");
			return;
		}
		if(f.delete())                      
		{  
		System.out.println(f.getName() + " deleted");   
		}  
		else  
		{  
		System.out.println("failed");  
		}  
		}  
		catch(Exception e)  
		{  
		e.printStackTrace();  
		}  
	}
}


