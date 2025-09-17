package encapsulation;

public class Student1 {
    private String name;
    private int phyMarks;
    private int chemMarks;
    private int bioMarks;

    public void setName(String name){
        this.name = name;
    }
    public void setPhyMarks(int phyMarks){
        this.phyMarks = phyMarks;
    }
    public void setChemMarks(int chemMarks){
        this.chemMarks = chemMarks;
    }
    public void setBioMarks(int bioMarks){
        this.bioMarks = bioMarks;
    }

    void marksRead(){
        System.out.println(name);
        System.out.println(phyMarks);
        System.out.println(chemMarks);
        System.out.println(bioMarks);

        int totalMarks = phyMarks + chemMarks + bioMarks;
        float percentage = (totalMarks * 100)/300;
        System.out.println(percentage);
    }
}