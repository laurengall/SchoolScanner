import java.io.File; // File class
import java.util.ArrayList;
import java.util.Scanner; 

public class Subject {
    ArrayList<Integer> grades = new ArrayList<Integer>();
    String input = "";
    int comma = 0;
    int period = 0;
    String gradeS = "";
    String className = "";
    String fileName = "";
    ArrayList<String> roster = new ArrayList<String>(); 

    public ArrayList<Integer> getGrades() {
		return grades;
	}

	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public int getComma() {
		return comma;
	}

	public void setComma(int comma) {
		this.comma = comma;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public String getGradeS() {
		return gradeS;
	}

	public void setGradeS(String gradeS) {
		this.gradeS = gradeS;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

    public String getAv() {
		return fileName;
	}

    public int getAvgGrade() {
		return avgGrade(grades);
	}
public ArrayList<String> getRoster() {
  return roster;
  
	}

  	public void setRoster(ArrayList<String> roster) {
		this.roster = roster;
	}
	public Subject(String fileName) {
    
        this.fileName = fileName;
        loadArray();

    }

     private void loadArray() {        

         try {
            period = fileName.indexOf(".");
            className = fileName.substring(0, period);

            File myFile = new File(fileName);
         
            Scanner scanReader = new Scanner(myFile);
           
            while (scanReader.hasNextLine()) {
                input = scanReader.nextLine();
                comma = input.indexOf(",");
                
                // using the comma for ArrayLists
                roster.add(input.substring(0, comma)); 
                gradeS = input.substring(comma + 1);
                grades.add(Integer.parseInt(gradeS));
                
              
            }
       
            scanReader.close();
           } 
       
        catch (Exception e) {               
            System.out.println("Error " +  e);
            e.printStackTrace();
            
            }
     }

    private int avgGrade(ArrayList<Integer> grades) {

        int sumGrades = 0;
        int count = 0;

        for (int x : grades) {
            sumGrades += x;
            count++;
        }

        return sumGrades / count;
    }


  
}
